package base;

public class TestString {
    public static void main(String[] args) {
        //Object中clone的访问控制符是 protected，必须显示继承才能使用
        int[] a = new int[]{1};
        int[] clone = a.clone();
        System.out.println(a == clone);
        System.out.println(a.equals(clone));
    }
}
