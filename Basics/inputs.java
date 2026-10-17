package Basics;

import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        String name = inputs.nextLine();
        System.out.println(name);


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no:");
        int num1 = sc.nextInt();

        System.out.print("Enter second no:");
        int num2 = sc.nextInt();

        System.out.println(num1 + num2);
    }
}