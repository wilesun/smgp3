package win.sinno.smgp3.protocol.constant;

/**
 * 可选参数类型
 * <p>
 * TLV
 * Tag,Length,Value
 *
 * @author : admin@chenlizhong.cn
 * @version : 1.0
 * @since : 2017/2/9 下午2:18
 */
public class Tlv1 {

    /**
     * 标签值
     * <p>
     * {@link SmgpTagEnum}
     */
    private int tag;

    /**
     * value 部分的长度
     */
    private int length;

    private String value;

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
