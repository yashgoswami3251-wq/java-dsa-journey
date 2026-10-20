package Basics;

public class reversenumber {
    public static void main(String[] args) {
        int number = 123456;
        int reminder = 0;
        while (number >0) { 
            reminder = number%10;
            number = number/10;
            System.out.print(reminder);
        }        
    }
}
