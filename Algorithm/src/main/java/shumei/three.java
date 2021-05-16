package shumei;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class three {
    private static final String[] keyWord = {"拾","佰","万","亿"};
    private static final String[] china = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
    public static int change(String str){
        String check = "\\D";
        //首先遍历String
        for (int i =0;i<str.length();i++){
            //开始处理元素
            //第一步开始转换
            for (int j = 0 ;j < china.length;j++){
                //System.out.println("china[j]="+china[j]+"+++"+str.charAt(i));
                if (china[j].equals(String.valueOf(str.charAt(i)))){
                    str =str.replaceAll(String.valueOf(str.charAt(i)), String.valueOf((j)));
                }
            }
        }
        //第二次去除
        Pattern p = Pattern.compile(check);
        Matcher m = p.matcher(str);
        str = m.replaceAll("");
        System.out.println(str);
        return 0;
    }

    public static void main(String[] args) {
        String s = "玖拾捌亿柒仟陆佰伍拾肆万叁仟贰佰零壹";
        String s1 = "壹";
        change(s1);
    }
}
