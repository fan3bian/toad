package algorithm.leetcode.array.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test989addToArrayForm {
    public static List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> ans = new ArrayList();
        int i = A.length;
        while (--i >= 0 || K > 0) {
            if (i >= 0)
                K += A[i];
            ans.add(K % 10);
            K /= 10;
        }
        Collections.reverse(ans);
        return ans;


    }
}
