package 网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress address = InetAddress.getByName("LAPTOP-3HRADR1C");
        InetAddress address = InetAddress.getByName("192.168.214.1");

        String hostAddress = address.getHostAddress();
        System.out.println(hostAddress);

        String hostName = address.getHostName();
        System.out.println(hostName);
    }
}
