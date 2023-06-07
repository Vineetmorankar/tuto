import java.net.*;
import java.io.*;

public class Server {
    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(3000);
        Socket s = ss.accept();
        DataInputStream Din = new DataInputStream(s.getInputStream());
        DataOutputStream Dout = new DataOutputStream(s.getOutputStream());
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = " ", str2 = " ";
        while (!str.equals("bye")) {
            str = Din.readUTF();
            System.out.println("client says: " + str);
            str2 = bf.readLine();
            Dout.writeUTF(str2);
            Dout.flush();
        }
        Din.close();
        ss.close();
        s.close();
    }

}