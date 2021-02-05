package 网络编程;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;
/*
* UDP通信程序联系
* */
public class send2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        byte[] bytes;
        while(!s.equals("886")){
            bytes=s.getBytes();
            DatagramPacket dp=new DatagramPacket(bytes,bytes.length, InetAddress.getByName("192.168.130.1"),10086);
            datagramSocket.send(dp);
            s=sc.nextLine();
        }
        datagramSocket.close();
        sc.close();
    }
}
