package io.bio;

import java.io.File;
import java.io.FilenameFilter;
import java.net.FileNameMap;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList {
    public static void main(String[] args) {
        File file = new File(".");
        String list[] ;
        if (args.length==0){
            list = file.list();
        }else{
//            list = file.list(new DirFilter(args[0]));
            String regex = args[0];
            list = file.list(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return Pattern.compile(regex).matcher(name).matches();
                }
            });
        }
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for (String s : list) {
            System.out.println(s);
        }
    }
        static class DirFilter implements FilenameFilter{
        private Pattern pattern;

        public DirFilter(String regex) {
            this.pattern = Pattern.compile(regex);
        }

        @Override
        public boolean accept(File dir, String name) {
            return pattern.matcher(name).matches();
        }
    }
}
