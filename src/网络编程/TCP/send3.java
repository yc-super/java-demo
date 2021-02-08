package 网络编程.TCP;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/*
*       TCP通信程序练习：
*           客户端：数据来源于文件
*           服务端：将收到的数据存入文件
*
*           服务器给出回应
* */
public class send3 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket(InetAddress.getByName("192.168.130.1"), 10000);

        BufferedReader br = new BufferedReader(new FileReader("src\\网络编程\\TCP\\ceshi.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.shutdownOutput();

        br.close();

        BufferedReader br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line2=br2.readLine();
        System.out.println(line2);

        br2.close();
        s.close();
    }
}
