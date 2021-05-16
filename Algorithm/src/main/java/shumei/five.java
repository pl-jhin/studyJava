package shumei;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class five {
    private final static String[] keyWord={"微信","QQ"};
    public static String changeKeyWord(String str){
        String s = "1";
        for (int i = 1 ;i<str.length();i++){
            s=s+"2";
        }
        return s;
    }
    public static String changeKeyString(String str){
        String s = "3";
        for (int i = 1 ;i<str.length();i++){
            s=s+"4";
        }
        return s;
    }
    public static String check(String str){
        String s = "";

        return null;
    }
    public static void main(String[] args) {

        String index = null;
        String chine= "[\\u4E00-\\u9FA5]+";
        String result = "";

        Pattern p1 = Pattern.compile(chine);
        Matcher m;
        String s = "想知道如果提高王者荣耀水平，上分把妹不是梦，加微信：17252sugats78，加QQ：34676328889";
        int[] ints = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,0,3,4,4,4,4,4,4,4,4,4,4,4,4,0,0,1,2,0,3,4,4,4,4,4,4,4,4,4,4};
        s=s.replaceAll("17252sugats78",changeKeyString("17252sugats78"));
        s=s.replaceAll("34676328889",changeKeyString("34676328889"));
        for (int i = 0 ; i< s.length() ;i++){
            for (int j = 0 ; j < keyWord.length;j++){
                if (i!=s.length()-1) {
                    index = s.charAt(i) + String.valueOf(s.charAt(i + 1));
                }
                if (index.equals(keyWord[j])){
                    s=s.replaceAll(keyWord[j],changeKeyWord(keyWord[j]));
                }
            }

        }
        for (int j = 0 ;j <s.length();j++){

            m = p1.matcher(String.valueOf(s.charAt(j)));
            String s1 = m.replaceAll("0");
            result = result+s1;
        }
        result=result.replaceAll("，","0");
        result=result.replaceAll("：","0");
        System.out.println(s.length()+"==="+ints.length);
        System.out.println(Arrays.toString(result.toCharArray()));
        System.out.println(Arrays.toString(ints));
    }
}
