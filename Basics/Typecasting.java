package Basics;
import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner innput = new Scanner(System.in);
        float num = innput.nextInt();  // float -> int = true , int -> float = false
        System.out.println(num);

        int number = 10;
        float numbers = (int)(number);
        System.out.println("Integet into float : "+numbers);

        int i = 50000;
        float f = 9.0f;
        short s = 8983;
        double d = 892.232;
        char c = 'a';
        byte b = 42;
        double result = (f*b) + (i/c) + (d*c);
        System.out.println((f*b) +", "+ (i/c)+", "+ (d*s));
        System.out.println(result);

    }
}
