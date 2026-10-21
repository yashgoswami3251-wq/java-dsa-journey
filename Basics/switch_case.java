import java.util.Scanner;

void main(){
    Scanner sc = new Scanner(System.in);
    int days = sc.nextInt();

    // This is new Technique old technique still working 
    switch (days) {
        case 1 -> System.out.println("Monday");
        case 2 -> System.out.println("Tuesday");
        case 3 -> System.out.println("Wednesday");
        case 4 -> System.out.println("Thursday");
        case 5 -> System.out.println("Friday");
        case 6 -> System.out.println("Saturday");
        case 7 -> System.out.println("Sunday");
        default -> System.out.println("Enter valid days");
        case 9 -> System.out.println("You pressed 9");
    }

    System.out.print("Enter New days : ");
    int newdays = sc.nextInt();

    switch (newdays) {
        case 1,2,3,4,5 -> System.out.println("weekday");
        case 6,7 -> System.out.println("Weekend");
        default-> System.out.println("Enter valid days");
    }
}