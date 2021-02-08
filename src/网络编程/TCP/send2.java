package 网络编程.TCP;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
/*
*       数据来源于键盘录入，直到输入的数据是886，发送数据结束
* */
public class send2 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket(InetAddress.getByName("192.168.130.1"), 10000);

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while((line=br.readLine())!=null){
            if(line.equals("886")){
               break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
