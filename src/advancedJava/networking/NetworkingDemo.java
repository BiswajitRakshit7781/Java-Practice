package advancedJava.networking;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkingDemo {

    public static void main(String[] args) throws UnknownHostException {

        String url = "google.in";

        InetAddress inetAddress = Inet4Address.getByName(url);

        System.out.println("Address : "+ Arrays.toString(inetAddress.getAddress()));

        System.out.println("Host Address : " + inetAddress.getHostAddress());

        System.out.println("Local Address : " + inetAddress.isAnyLocalAddress());

        System.out.println("Is Link Local Address : "+ inetAddress.isLinkLocalAddress());

        System.out.println("Is Loop back Address : "+ inetAddress.isLoopbackAddress());

        System.out.println("Is Site Local Address : "+ inetAddress.isSiteLocalAddress());

        System.out.println("HashCode : "+ inetAddress.hashCode());
    }
}
