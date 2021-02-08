package 网络编程.TCP.MultiThread;

import java.io.*;
import java.net.Socket;

public class ServerSocketThread implements Runnable{
    private Socket s;
    public ServerSocketThread(Socket s) {
        this.s=s;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            int count=0;
            File f;
            f = new File("ceshi[" + count + "].txt");
            while(f.exists()){
                count++;
                f = new File("ceshi[" + count + "].txt");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));


            String line;
            while((line=br.readLine())!=null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bw2.write("文件上传成功！");
            bw2.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
