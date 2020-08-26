package algorithm.some;

/**
 * 递归
 */
public class Recursion {

    /**
     * 阶乘
     *
     * @param i
     */
    public static int factorial(int i) {
        if (i <= 2) {
            return i;
        } else {
            return i * factorial(i - 1);
        }
    }

    /**
     * 斐波那契数列
     * 1 1 2 3 5 8 13 21 34 55
     *
     * @param i
     * @return
     */
    public static int fibonacci(int i) {
        if (i == 1 || i == 2) {
            return 1;
        }
        return fibonacci(i - 1) + fibonacci(i - 2);
    }

    public static void main(String[] args) {
//        System.out.println(factorial(3));
//        System.out.println(factorial(4));
//        System.out.println(factorial(5));

        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(8));
    }

}
