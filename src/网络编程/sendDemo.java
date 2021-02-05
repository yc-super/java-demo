package 网络编程;

import java.io.IOException;
import java.net.*;

public class sendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket();
        byte[] bytes="hello,udp,我来了。".getBytes();
//        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.214.1"), 10086);//VMnet1
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.130.1"), 10086);//VMnet8
        ds.send(dp);
        ds.close();


    }
}
