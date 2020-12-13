package algorithm.leetcode;

//todo
public class Test38 {
    public String countAndSay(int n) {
        //1
        //1:1
        //2:1
        //1:2,1:1
        //1:1,1:2,2:1
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder = cas(stringBuilder,n);
        return stringBuilder.toString();
    }

    private StringBuilder cas(StringBuilder args, int n){
        //terminates
        if (n == 1) {
            args.append(1);
            return args;
        }
        //next loop
        args = cas(args,n - 1);
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < args.length(); i++) {
            if (i+1 < args.length() && args.charAt(i) == args.charAt(i + 1)) {
                count++;
            } else {
                sb.append(count).append(args.charAt(i));
                count=1;
            }
        }
        System.out.println("n= "+n+"sb="+sb);
        return sb;
    }

    public static void main(String[] args) {
//        StringBuilder sb =new StringBuilder();
//        sb.append(1);
//        System.out.println(sb.toString());
        Test38 test38 = new Test38();
//        System.out.println(test38.countAndSay(2));
//        System.out.println(test38.countAndSay(3));
        System.out.println(test38.countAndSay(6));
    }
}
