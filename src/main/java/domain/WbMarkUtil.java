package domain;


import java.io.Serializable;

/**
 * Created by duff on 2016/12/26.
 */
public class WbMarkUtil implements Serializable {
    /** 实际值 */
    private char value[];
    /** 长度 */
    private int count;

    public WbMarkUtil() {
        this.count = 50;
        this.value = String.format("%050d", 0).toCharArray();
    }

    public WbMarkUtil(String soMark)  {
        if (soMark.length() != 50) {
            throw new RuntimeException("入库单标记位异常!");
        }
        this.count = soMark.length();
        this.value = soMark.toCharArray();
    }


    public WbMarkUtil(int bizType) {
        this.count = 50;
        this.value = String.format("%050d", 0).toCharArray();
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
     * 获取第index的值，index从1开始
     * @param index
     * @return
     */
    public byte byteAt(int index) {
        if ((index <= 0) || (index > count))
            throw new StringIndexOutOfBoundsException(index);
        return (byte)(value[index - 1]-48);
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
     * 修改第index的值，index从1开始
     * @param index
     * @param a
     */
    public void inChar(int index, byte a) {
        if ((index <= 0) || (index > count))
            throw new StringIndexOutOfBoundsException(index);
        char charIndex = (char) (a + 48);
        value[index - 1] = charIndex;
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
