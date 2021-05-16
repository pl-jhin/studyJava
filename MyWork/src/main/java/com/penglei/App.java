package com.penglei;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String str = "123456789";
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
            sb.append(str.charAt(i));
            if (count % 3 == 0 && i != (str.length()-1)) sb.append(",");
        }
        System.out.println(sb);
    }
}
