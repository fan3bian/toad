package base;

public class TestArray {
    public static void main(String[] args) {
        int a1[]={1,3};
        int a2[]=a1.clone();
        System.out.println(a1 == a2);
    }
}
