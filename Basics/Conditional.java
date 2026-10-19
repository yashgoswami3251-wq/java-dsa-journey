package Basics;

public class Conditional {
    public static void main(String[] args) {
        /* int salary = 25000;
        if(salary > 10000){
            if(salary > 155000){
                salary += 2000;
            }else if(salary > 20000){
                salary += 3000;
            }
        }else{
            salary += 1000;
        }
        System.out.println(salary); */


        int a = 30;
        int b = 40; 
        int c = 10;
        int max = a;
        if(b > max){
            max = b;
            if(c > max){
                max = c;
            }
        }
        System.out.println("Maximum is "+max);

        System.out.println(Math.max(54, Math.max(10, 50)));
    }
}
