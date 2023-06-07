import java.io.*;

public class sub {
    public static void main(String args[]) throws IOException {
        System.out.println("Enter IP");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String ip = bf.readLine();
        String cclass = ip.substring(0, 3);
        Integer c = Integer.parseInt(cclass);
        String mask = null;

        if (c > 0) {
            if (c <= 127) {
                mask = "255.0.0.0";
                System.out.println("Class A IP Address ");
                System.out.println(mask);
            }
            if (c >= 128 && c <= 191) {
                mask = "255.255.0.0";
                System.out.println("Class B IP Address ");
                System.out.println(mask);
            }
            if (c >= 192 && c <= 223) {
                mask = "255.255.255.0";
                System.out.println("Class C IP Address ");
                System.out.println(mask);
            }
            if (c >= 224 && c <= 239) {
                mask = "255.0.0.0";
                System.out.println("Class D IP Address ");
                System.out.println(mask);
            }
            if (c >= 240 && c <= 254) {
                mask = "255.0.0.0";
                System.out.println("Class E IP Address ");
                System.out.println(mask);
            }
        }

        String netad = " ";
        String broad = " ";
        String[] netparts = ip.split("\\.");
        String[] broadparts = mask.split("\\.");
        for (int i = 0; i < 4; i++) {
            Integer x = Integer.parseInt(netparts[i]);
            Integer y = Integer.parseInt(broadparts[i]);
            Integer z = x & y;
            netad += z + ".";
            Integer w = z | (y ^ 255);
            broad += w + ".";
        }
        System.out.println("Network address is: " + netad);
        System.out.println("Broadcast address is: " + broad);
    }
}
