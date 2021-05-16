package com.penglei.bioDemo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class BIOSocketClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        Scanner sc = new Scanner(System.in);
        // 建立连接
        socket.connect(new InetSocketAddress(9999));
        System.out.println("已建立连接，请输入数据");
        while (true){
            String data = sc.next();
            // 写数据
            socket.getOutputStream().write(data.getBytes());
        }
    }
}
