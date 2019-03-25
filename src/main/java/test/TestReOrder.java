package test;

import org.junit.Test;

/**
 * 验证指定重排列,可惜，没什么指令重排列。
 */
public class TestReOrder {
    final boolean success;

    TestReOrder(boolean success) {
        this.success = success;
    }

    private void method() {
        if (success) {
            for (int i = 0; i < 100 * 100 * 100; i++) {
                i++;
            }
        }else{
            for (int i = 0; i < 100 * 100 * 100; i++) {
                i++;
            }
        }

    }

    @Test
    public void test() {
        new TestReOrder(true).method();
    }
}
