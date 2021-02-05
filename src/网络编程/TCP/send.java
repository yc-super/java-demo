package 网络编程.TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class send {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket(InetAddress.getByName("192.168.130.1"), 30000);
        OutputStream os = s.getOutputStream();
        os.write("nihaoa".getBytes());
        os.close();
        s.close();
    }
}
