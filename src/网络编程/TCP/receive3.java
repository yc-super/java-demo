package 网络编程.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
/*
*       服务器给出回应
* */
public class receive3 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\网络编程\\TCP\\ceshi-receive.txt"));

        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
//            bw2.write(line);
//            bw2.flush();
        }
//        s.shutdownOutput();
        bw.close();

        BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bw2.write("文件上传结束");

        bw2.close();
        ss.close();
    }
}
