// import java.net.*;
// import java.util.*;

// public class dnsl {
//     public static void main(String args[]) throws Exception {
//         String host;
//         Scanner ch = new Scanner(System.in);
//         System.out.println("Enter host name");
//         host = ch.next();
//         InetAddress add = InetAddress.getByName(host);
//         System.out.println("Ip Address Is : " + add.getHostAddress());
//         String Ip;
//         System.out.println("Enter Ip : ");
//         Ip = ch.next();
//         InetAddress add1 = InetAddress.getByName(Ip);
//         System.out.println(" Host NAme Is : " + add1.getHostName());

//     }
// }
import java.net.*;
import java.util.*;

public class dnsl {
    public static void main(String[] args) throws Exception {
        String host;
        Scanner ch = new Scanner(System.in);
        System.out.println("Enter Host Name: ");
        host = ch.next();
        InetAddress add = InetAddress.getByName(host);
        System.out.println("IP address is: " + add.getHostAddress());
        System.out.println("Host name is: " + add.getHostName());
        System.out.println("Total Address is: " + add.toString());

        String ip;
        System.out.println("Enter IP: ");
        ip = ch.next();
        InetAddress add1 = InetAddress.getByName(ip);
        System.out.println("Host name is: " + add1.getHostName());
        System.out.println("IP address is: " + add1.getHostAddress());
        System.out.println("Total Address is: " + add1.toString());
    }

}
