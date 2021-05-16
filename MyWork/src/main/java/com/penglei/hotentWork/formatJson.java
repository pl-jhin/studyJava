package com.penglei.hotentWork;

import java.io.*;

public class formatJson {
    public static BufferedReader bufread;
    //指定文件路径和名称
    private static String path = "/Users/penglei/Desktop/openPlaceholderJson.js";
    private static File filename = new File(path);
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

//        System.out.println("文件内容是:"+ "\r\n" + readStr);
        return readStr;
    }
    public static void replaceTxtByStr(String readStr) {
        readStr = readStr.replaceAll("\"(\\w+)\"(\\s*:\\s*)", "$1$2");
        readStr = readStr.replaceAll("\\n","");
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
        replaceTxtByStr(readStr);

    }
}
