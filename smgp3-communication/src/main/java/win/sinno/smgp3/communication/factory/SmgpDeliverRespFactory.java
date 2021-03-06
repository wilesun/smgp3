package win.sinno.smgp3.communication.factory;

import win.sinno.smgp3.protocol.body.SmgpDeliverRespBody;
import win.sinno.smgp3.protocol.constant.SmgpRequestEnum;
import win.sinno.smgp3.protocol.header.SmgpHeader;
import win.sinno.smgp3.protocol.message.SmgpDeliverResp;

/**
 * smgp deliver resp message factory
 *
 * @author : admin@chenlizhong.cn
 * @version : 1.0
 * @since : 2017/2/15 下午1:24
 */
public class SmgpDeliverRespFactory {

    private static final int PACKAGE_LEN = 26;

    public static Builder builder(Integer sequenceId) {
        return new Builder(sequenceId);
    }

    public static class Builder {

        private String msgId;

        private Integer status;

        private Integer sequenceId;

        public Builder(Integer sequenceId) {
            this.sequenceId = sequenceId;
        }

        public Builder msgId(String msgId) {
            this.msgId = msgId;
            return this;
        }

        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public SmgpDeliverResp build() {
            SmgpDeliverResp smgpDeliverResp = new SmgpDeliverResp();

            SmgpHeader header = new SmgpHeader();
            header.setPacketLength(PACKAGE_LEN);
            header.setRequestId(SmgpRequestEnum.DELIVER_RESP.getId());
            header.setSequenceId(sequenceId);

            SmgpDeliverRespBody body = new SmgpDeliverRespBody();
            body.setMsgId(msgId);
            body.setStatus(status);

            smgpDeliverResp.setHeader(header);
            smgpDeliverResp.setBody(body);

            return smgpDeliverResp;
        }
    }
}
