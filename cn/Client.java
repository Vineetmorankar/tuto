import java.net.*;
import java.io.*;

public class Client {
	public static void main(String args[]) throws Exception {
		Socket s = new Socket("localhost", 3000);
		DataInputStream Din = new DataInputStream(s.getInputStream());
		DataOutputStream Dout = new DataOutputStream(s.getOutputStream());
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String str = " ", str2 = " ";
		while (!str.equals("bye")) {
			str = bf.readLine();
			Dout.writeUTF(str);
			Dout.flush();
			str2 = Din.readUTF();
			System.out.println("server says: " + str2);
		}
		Dout.close();
		s.close();
	}
}
