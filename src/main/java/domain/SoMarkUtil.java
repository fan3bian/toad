package domain;

/**
 * 订单标记类转化类
 * User: douhuatong
 * Date: 14-8-6
 * Time: 下午3:57
 */
public class SoMarkUtil implements java.io.Serializable {


    /** 实际值 */
    private char value[];
    /** 长度 */
    private int count;

    private final int defaultLength = 200;


    public SoMarkUtil() {
        this.count = defaultLength;
        this.value = String.format("%0" + defaultLength + "d", 0).toCharArray();
    }

    public SoMarkUtil(String soMark) throws Exception {
        if (soMark.length() != defaultLength) {
            // throw new SoBizException(SoIssuedErrorEnum.R_20_2);
            if (soMark.length() > defaultLength) {
                soMark = soMark.substring(0, defaultLength);
            } else {
                soMark = soMark + String.format("%0" + (defaultLength - soMark.length()) + "d", 0);
            }
        }
        this.count = soMark.length();
        this.value = soMark.toCharArray();
    }


    /**
     * 获取第index的值，index从1开始
     * @param index
     * @return
     */
    public char charAt(int index) {
        if ((index <= 0) || (index > count))
            throw new StringIndexOutOfBoundsException(index);
        return value[index - 1];
    }

    /**
     * 修改第index的值，index从1开始
     * @param index
     * @param a
     */
    public void inChar(int index, char a) {
        if ((index <= 0) || (index > count))
            throw new StringIndexOutOfBoundsException(index);
        value[index - 1] = a;
    }

    /**
     * 获取当前长度
     * @return
     */
    public int length() {
        return count;
    }

    /**
     * 获取当前字符
     * @return
     */
    public String toString() {
        return String.valueOf(value);
    }


    public static void main(String args[]) {



    }


}
