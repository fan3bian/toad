package ext.pinyin;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

import java.util.regex.Pattern;

public class TestPinyin {
    private static final String regex = "[^\\u4e00-\\u9fa5]";//非汉语

    public static void main(String[] args) throws Exception {
        //1.过滤字母/数字/特殊字符，只保留汉字
//        String regex = "[\\u4e00-\\u9fa5]";

//        String regex = "[^(\\u4e00-\\u9fa5)]";

//        //2.

        String str = "@#￥%……&*——+!@#$%^&*()（）_+汉%……&*——+!@字！@#￥%……&*——+!@#$%^&*()（）_+";


//        String  str = "hello你好吗,我很好 thank you";
//        String reg = "[\\u2E80-\\u9FFF]+";
//        Pattern pat = Pattern.compile(regex);
//        Matcher mat = pat.matcher(str);
//        String repickStr = Pattern.compile(regex).matcher(str).replaceAll("");
//        System.out.println("过滤中文后: "+repickStr);
//        String pinyin = getPingYin(repickStr);
//        System.out.println(getPinYinHeadChar(repickStr));
        System.out.println(genMnemonic(str));
//        System.out.println("u4e00");

    }

    public static String getPingYin(String src) {
        HanyuPinyinOutputFormat format = new HanyuPinyinOutputFormat();
        format.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        format.setVCharType(HanyuPinyinVCharType.WITH_V);
        StringBuilder sb = new StringBuilder();
        char[] srcArray = src.toCharArray();
        try {
            for (int i = 0; i < srcArray.length; i++) {
                // 判断是否为汉字字符
//                String[] targetArray = PinyinHelper.toHanyuPinyinStringArray(srcArray[i], format);
//                sb.append(targetArray[0]);
                if (java.lang.Character.toString(srcArray[i]).matches("[\\u4E00-\\u9FA5]+")) {
                    String[] targetArray = PinyinHelper.toHanyuPinyinStringArray(srcArray[i], format);
                    sb.append(targetArray[0]);
                } else {
                    sb.append(srcArray[i]);
                }
            }
            return sb.toString();
        } catch (BadHanyuPinyinOutputFormatCombination e1) {
            e1.printStackTrace();
        }
        return sb.toString();
    }
    public static String getPinYinHeadChar(String str){
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(PinyinHelper.toHanyuPinyinStringArray(c)[0].charAt(0));
        }
        return sb.toString().toUpperCase();
    }

    private  static String genMnemonic(String goodsName){
        String hanyu = Pattern.compile(regex).matcher(goodsName).replaceAll("");
        System.out.println("过滤后的汉字：["+hanyu+"]");
//        return getPinYinHeadChar(hanyu);
        return "";
    }


}
