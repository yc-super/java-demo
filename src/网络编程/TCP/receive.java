package 网络编程.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class receive {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(30000);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        byte[] bytes=new byte[1024];
        int len = is.read(bytes);
        System.out.println("数据是："+new String(bytes,0,len));

        ss.close();
    }
}
