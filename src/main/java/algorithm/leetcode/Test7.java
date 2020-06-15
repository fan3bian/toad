package algorithm.leetcode;

public class Test7 {
    public static void main(String[] args) {
        isPalindrome2(121);
        System.out.println(reverse(1345));
    }

    static int test7(int x) {
        int rev = 0;
        if (x == 0) {
            return x;
        }
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            rev = rev * 10 + pop;
        }

        return rev;

    }

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            //整数越界  Integer.MAX_VALUE > rev * 10 + pop > Integer.MIN_VALUE
//            if (rev * 10 + pop > Integer.MIN_VALUE) {
//                return 0 ;
//            }
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > Integer.MAX_VALUE % 10)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < Integer.MIN_VALUE % 10)) {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }

    //test8
    static boolean isPalindrome(int x) {
        int reverse = reverse(x);
        if (reverse == x) {
            return true;
        }
        return false;
    }
    public static boolean isPalindrome2(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > Integer.MAX_VALUE % 10)) {
                rev=  0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < Integer.MIN_VALUE % 10)) {
                rev= 0;
            }
            rev = rev * 10 + pop;
        }

        if (rev == x) {
            return true;
        }
        return false;
    }
}
