package 网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class receiveDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端的Socket对象（DatagramSocket）
        DatagramSocket ds=new DatagramSocket(10086);
        //创建一个数据包，用于接收数据
        byte[] bytes=new byte[1024];
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length);
        ds.receive(dp);

        byte[] datas = dp.getData();
        System.out.println(datas.length);

        System.out.println("接收到的数据是："+new String(datas).length());
        System.out.println("接收到的数据是："+new String(datas,0,dp.getLength()));
    }
}
