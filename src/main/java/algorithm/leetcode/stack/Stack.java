//package algorithm.leetcode.stack;
//
///**
// * 用数组实现栈
// * 栈
// */
//public class Stack<T> {
//    private Object[] element = new Object[1000];
//    int size;
//
//    public void push(T t) {
//        element[size++] = t;
//    }
//
//    public T pop() {
//        Object o = element[--size];
//        element[size]=null;
//        return (T)o;
//    }
//
//    int size() {
//        return size;
//    }
//
//    public static void main(String[] args) {
//        Stack<Integer> stack =new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        Integer pop = stack.pop();
//        Integer pop2 = stack.pop();
//
//    }
//}
