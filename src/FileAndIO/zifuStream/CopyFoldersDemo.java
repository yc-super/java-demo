package FileAndIO.zifuStream;

import java.io.*;

public class CopyFoldersDemo {
    public static void main(String[] args) throws IOException {
        File srcFolder=new File("D:\\1学习\\复制多级目录测试");
        File destFolder=new File("src\\FileAndIO\\FileDemo");
        CopyFolders(srcFolder,destFolder);
    }
    private static void CopyFolders(File srcFolder,File destFolder) throws IOException {
        if(srcFolder.isFile()){
            copyFile(srcFolder,destFolder);
        }
        File destFolder2=new File(destFolder,srcFolder.getName());
        if(!destFolder2.exists()){
            destFolder2.mkdir();
        }
        File[] listFiles=srcFolder.listFiles();
        if(listFiles!=null){
            for(File file:listFiles){
                CopyFolders(file,destFolder2);
            }
        }
    }
    private static void copyFile(File srcFile,File destFolder) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(new File(destFolder,srcFile.getName())));
        int len;
        byte[] bytes=new byte[1024];
        while((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
    }

}
