import java.io.PushbackReader;
import java.util.Random;
import java.util.Scanner;
public class LeakyBucket {
    static void solution(int bucketSize, int packetSize, int output) {
        if (packetSize > bucketSize)
            System.out.println("Bucket overflow");
        else {
            while (packetSize > output) {
                System.out.println(output +" bytes outputed");
                packetSize = packetSize - output;
            }
            if (packetSize > 0) {
                System.out.println(packetSize +" bytes outputed");
            }
        }
    }
    public static void main(String[] args) {
        int output, packetSize, bucketSize, n;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter the bucket size(): ");
        bucketSize = sc.nextInt();
        System.out.print("Enter the output rate: ");
        output = sc.nextInt();
        System.out.print("Enter the number of packets: ");
        n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; ++i) {
            packetSize = rand.nextInt(1000);
            System.out.println("Packet number: "+ i +"\tPacket size = "+ packetSize);
            solution(bucketSize, packetSize, output); 
        }
    }
}
