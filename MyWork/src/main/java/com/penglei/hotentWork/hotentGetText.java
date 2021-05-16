package com.penglei.hotentWork;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hotentGetText {
    public static BufferedReader bufread;
    //指定文件路径和名称
    private static String path = "/Users/penglei/Documents/python/demo/spider/json.js";
    private static String fliePath = "/Users/penglei/Desktop/work/hotentWorkByHTML/web/manage/src/components/dialog/CustomDialogDialog.vue";
    private static File filename = new File(fliePath);
    private static String readStr ="";

    public static String readTxtFile(){
        String read;
        FileReader fileread;
        try {
            fileread = new FileReader(filename);
            bufread = new BufferedReader(fileread);
            try {
                while ((read = bufread.readLine()) != null) {
                    readStr = readStr + read+ "\r\n";
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String group = "";
        String pattern = "(?<!/\\/\\s{5}|<!--\\s.{5})[\\u4e00-\\u9fa5，：]+";
        Pattern r = Pattern.compile(pattern);
        Matcher matcher = r .matcher(readStr);
        if (matcher.find()) {
            matcher.reset();
            while (matcher.find()) {
               group = matcher.group();
               System.out.println(group);
            }
        }


//        System.out.println("文件内容是:"+ "\r\n" + readStr);
        return readStr;
    }
    public static void replaceTxtByStr(String readStr) {
        readStr = readStr.replaceAll("\"(\\w+)\"(\\s*:\\s*)", "$1$2");
        try {
            File file = new File(path);
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuffer buf = new StringBuffer();
            buf.append(readStr);
            br.close();
            FileOutputStream fos = new FileOutputStream(file);
            PrintWriter pw = new PrintWriter(fos);
            pw.write(buf.toString().toCharArray());
            pw.flush();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String readStr = readTxtFile();
//        replaceTxtByStr(readStr);

    }
}
