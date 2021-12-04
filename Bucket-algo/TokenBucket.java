import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import java.time.*;

public class TokenBucket {
    private static int tokens;
    private static int time_unit;
    private static int bucket;
    private static int last_check;
    
    TokenBucket(int tokens, int time_unit) {
        this.tokens = tokens;
        this.time_unit = time_unit;
        this.bucket = tokens;
        this.last_check = LocalTime.now().toSecondOfDay();
    }

    private void handle(int packet) {
        int current = LocalTime.now().toSecondOfDay();
        int time_passed = current - last_check;
        last_check = current;
        
        bucket = bucket + time_passed * (tokens / time_unit);

        System.out.println("Bucket: "+ bucket);
        System.out.println("Tokens: "+ tokens);

        if (bucket > tokens)
            bucket = tokens;
        if (bucket < 1)
            drop(packet);
        else {
            bucket = bucket - 1;
            forward(packet);
        }
    }

    private static void forward(int packet) {
        System.out.println("Packet forwarded: "+ packet);
    }

    private static void drop(int packet) {
        System.out.println("Packet dropped: "+ packet);
    }

    public static void main(String[] args) {
        TokenBucket throttle = new TokenBucket(1, 1);
        int packet, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of packets to be transmitted: ");
        packet = sc.nextInt();
        sc.close();
        while (true) {
            if (count == packet) 
                break;
            try{
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
            throttle.handle(count);
            count += 1;
        }

    }
}