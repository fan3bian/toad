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
    public void test1(){
        String a= "查询商品080V05504-6096失败";
        System.out.println(a.startsWith("查询商品"));
        int index = a.indexOf("查询商品");
        System.out.println(index);

        String replace = a.replace("查询商品", "").replace("失败", "");
        System.out.println(replace);
        System.out.println(a.substring(4, a.length() - 2));
    }
}
