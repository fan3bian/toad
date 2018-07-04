package base;

public class TestByte {
	public static void main(String[] args) {
		
		Byte a = 1;
		Byte b = '1';
		System.out.println(a.hashCode()+ "|"+b.hashCode());
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}
}
