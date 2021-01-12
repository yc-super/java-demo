package zifuStream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class stringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="中国";
//        byte[] bys=s.getBytes();//[-28, -72, -83, -27, -101, -67]
//        byte[] bys=s.getBytes("utf-8");//[-28, -72, -83, -27, -101, -67]
        byte[] bys=s.getBytes("GBK");//[-42, -48, -71, -6]
        System.out.println(Arrays.toString(bys));

        String ss=new String(bys,"GBK");
        System.out.println(ss);

    }
}
