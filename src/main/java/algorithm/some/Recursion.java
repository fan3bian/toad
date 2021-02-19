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
     * O(2^n)
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

    /**
     * 备忘录 自顶向下
     *
     * @param
     * @return
     */
    public int fibonacci2(int n) {
        int[] nums = new int[n];
        return dfs(nums, n);
    }

    private int dfs(int[] nums, int n) {
        if (n <= 2) return 1;
        if (nums[n - 1] != 0) return nums[n - 1];
        int val = dfs(nums, n - 1) + dfs(nums, n - 2);
        nums[n - 1] = val;
        return val;
    }

    //自底向上
    public int fibonacci3(int n) {
        if (n <= 2) return 1;
        int[] nums = new int[n + 1];
        nums[1] = nums[2] = 1;
        for (int i = 3; i <= n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n];
    }

    //状态压缩
    public int fibonacci4(int n) {
        if (n < 1) return 0;
        if (n <= 2) return 1;
        int prev = 1, curr = 1;
        for (int i = 3; i <= n; i++) {
            int sum = prev + curr;
            prev = curr;
            curr = sum;
        }
        return curr;
    }

    public static void main(String[] args) {
//        System.out.println(factorial(3));
//        System.out.println(factorial(4));
//        System.out.println(factorial(5));
        Recursion recursion = new Recursion();
        System.out.println(recursion.fibonacci3(8));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(8));
    }

}
