package 网络编程.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket(InetAddress.getByName("192.168.130.1"), 10000);
        OutputStream os = s.getOutputStream();
        os.write("你好，tcp!".getBytes());

        //接收服务端反馈
        InputStream is = s.getInputStream();
        byte[] bytes=new byte[1024];
        int len;
//        while((len=is.read(bytes))!=-1){
        len=is.read(bytes);
            System.out.println("接收到服务器的反馈："+new String(bytes,0,len));
//        }

        s.close();//关闭s,同时关闭os,is
    }
}
