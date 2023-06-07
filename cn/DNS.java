import java.util.*;
import java.net.*;

public class DNS {
    public static void main(String[] args) {
        String host = new String();
        String ip = new String();
        Scanner ch = new Scanner(System.in);
        System.out.println("1.Host to IP Address.\n2.IP Address to Host.");
        System.out.println("\n Enter your choice");
        int choice = ch.nextInt();
        if (choice == 1) {
            try {
                System.out.println("Enter the host :");
                host = ch.next();
                InetAddress address = InetAddress.getByName(host);
                System.out.println("Host Name: " + address.getHostName());
                System.out.println("IP: " + address.getHostAddress());
                System.out.println("Host name and IP address: " + address.toString());
            } catch (UnknownHostException e) {
                System.out.println("unknown");
            }
        } else {
            try {
                System.out.println("Enter the IP address :");
                ip = ch.next();
                InetAddress address1 = InetAddress.getByName(ip);
                System.out.println("Host Name: " +
                        address1.getHostName());
                System.out.println("IP: " +
                        address1.getHostAddress());
                System.out.println("Host name and IP address: " +
                        address1.toString());
            } catch (UnknownHostException e) {
                System.out.println("unknown");
            }
        }
    }
}