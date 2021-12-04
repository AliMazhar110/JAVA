import java.io.*;
import java.net.*;
import java.util.Random;

public class SelectiveRepeatClient {
    static Socket connection;
    public static void main(String[] args) throws SocketException {
        try {
            int v[] = new int[10];
            int n = 0; 
            Random rands = new Random();
            int rand = 0;
            InetAddress addr = InetAddress.getByName("Localhost");
            System.out.println(addr);
            connection = new Socket(addr, 8011);
            DataOutputStream out = new DataOutputStream(connection.getOutputStream());
            DataInputStream in = new DataInputStream(connection.getInputStream());
            int p = in.read();
            System.out.println("No of frame:"+ p);
            for (int i = 0; i < p; ++i) {
                v[i] = in.read();
                System.out.println(v[i]);
            }
            rand = rands.nextInt(p);
            v[rand] = -1;
            for (int i = 0; i < p; ++i) {
                System.out.println("Received frame is "+ v[i]);
            }
            for (int i = 0; i < p; ++i) 
                if (v[i] == -1) {
                    System.out.println("Not received number: "+ (i+1));
                    System.out.println("Request to retransmit from packet no "+ (i+1) +" again!!");
                    n = i;
                    out.write(n);
                    out.flush();
                }
            System.out.println();
			v[n] = in.read();
			System.out.println("Received frame is: " + v[n]);
			System.out.println("quiting");
		} catch (Exception e) {
			System.out.println(e);
		}
    }
}
