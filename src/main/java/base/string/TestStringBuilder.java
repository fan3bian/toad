package base.string;

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
}
