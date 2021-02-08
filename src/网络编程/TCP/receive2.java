package 网络编程.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class receive2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\网络编程\\TCP\\ceshi.txt"));
        String line;
        while((line=br.readLine())!=null){
//            System.out.println(line);
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        ss.close();
        bw.close();
    }
}
