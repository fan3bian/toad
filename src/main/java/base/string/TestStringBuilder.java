package base.string;

import org.junit.Test;

public class TestStringBuilder {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("zhang");
        append(stringBuilder);
        System.out.println(stringBuilder);
    }

    private static void append(StringBuilder sb) {
        sb = new StringBuilder();
        sb.append("hah");
    }

    @Test
    public void test1() {
        String a = "查询商品080V05504-6096失败";
        System.out.println(a.startsWith("查询商品"));
        int index = a.indexOf("查询商品");
        System.out.println(index);

        String replace = a.replace("查询商品", "").replace("失败", "");
        System.out.println(replace);
        System.out.println(a.substring(4, a.length() - 2));
    }

    @Test
    public void test2() {
        StringBuilder sb = new StringBuilder("abcd->");
//        sb.delete(0,sb.length());
        sb.delete(sb.length() - 2, sb.length());
        System.out.println(sb.toString());
    }

    @Test
    public void testEquals() {

    }

    private boolean isMatch(String a, String b) {
        if (a.length() == b.length()) {

        }
        return false;
//        a.split()
    }
}
