package 网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class receive2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);
        byte[] bytes=new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        while(true){
            ds.receive(dp);
            byte[] datas = dp.getData();
            System.out.println("接收到的数据是："+new String(datas,0,dp.getLength()));
        }
    }
}
