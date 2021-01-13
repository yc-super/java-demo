package FileAndIO.zifuStream;

import java.io.*;

public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        File srcFile=new File("C:\\Users\\15988\\Pictures\\联想锁屏壁纸");
        String srcFolderName=srcFile.getName();
        File destFolder=new File("src\\FileAndIO\\FileDemo\\",srcFolderName);
        if(!destFolder.exists()){
            destFolder.mkdir();
        }
        File[] listFiles=srcFile.listFiles();
        for(File srcfile:listFiles){
            String name=srcfile.getName();
            File destfile=new File(destFolder,name);
            copyFile(srcfile,destfile);
        }
    }
    private static void copyFile(File srcFile,File destFile) throws IOException {
        //使用字节流复制文件
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(destFile));
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(srcFile));
        byte[] bytes=new byte[1024];
        int len;
        while((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
    }
}
