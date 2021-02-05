package 网络编程.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        byte[] bytes=new byte[1024];
        int len;
//        while((len=is.read(bytes))!=-1){
            len=is.read(bytes);
            System.out.println("接收到数据："+new String(bytes,0,len));
//        }

        //给客户端反馈
        OutputStream os = s.getOutputStream();
        os.write("你要好好学java啊".getBytes());
        ss.close();//关闭ss,也关闭了s,is,os
    }
}
