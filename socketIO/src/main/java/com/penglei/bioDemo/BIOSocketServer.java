package com.penglei.bioDemo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class BIOSocketServer {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[1024];
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress(9999));
        while (true){
            // 等待链接
            System.out.println("服务端等待链接");
            // 建立链接 这里会阻塞
            Socket socket = serverSocket.accept();
            // 验证阻塞，如果在上一行代码阻塞，这里不会输出
            System.out.println("服务端链接成功");
            // 读取数据，这里还是会阻塞
            socket.getInputStream().read(bytes);
            // 验证阻塞，如果在上一行代码阻塞，这里不会输出
            System.out.println("获得数据");
            // 打印
            String data = new String(bytes);
            System.out.println("数据为:"+data);
        }
    }
}
