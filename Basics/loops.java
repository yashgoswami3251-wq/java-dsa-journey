package Basics;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        int i = 1;
        while (i != 5) {
            System.out.println(i);
            i++;
        }

        for(int j=1; j!=5; j++){
            System.out.println(j);
        }


        Scanner input = new Scanner(System.in);
        System.out.println("Enter Temprature in C");
        float temC = input.nextFloat();

        float tempF = (temC * 9/5) + 32;
        System.out.println(tempF);  

    }
}
