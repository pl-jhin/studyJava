package com.penglei;

public class Demo1 {
    public static void main(String[] args) {
        String str= "b#a#c##d##e";
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='#'){
                sb1.append(str.charAt(i));
            }else sb2.append(str.charAt(i));
        }
        String result = sb1.toString()+sb2.toString();
        System.out.println(result);

    }
}
