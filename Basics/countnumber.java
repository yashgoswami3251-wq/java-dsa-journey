package Basics;

import java.util.Scanner;

public class countnumber {
    public static void main(String[] args) {
        System.out.print("Enter Number :");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.print("Enter which number you want to find :");
        int target = input.nextInt();
        int count = 0;

        System.out.println(target);
        while (number >0) {
            int reminder = number % 10;
            if(reminder == target){
                count++;
            }
            number = number / 10;
        }
        System.out.println(target+" repeat "+count+" Times ");
    }
}
