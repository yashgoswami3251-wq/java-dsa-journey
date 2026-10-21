import java.util.Scanner;

void main(){
    Scanner in = new Scanner(System.in);
    int id = in.nextInt();
    String dept = in.next();

    // Better way to write
    switch (id) {
        case 1 -> System.out.println("Yashgiri");
        case 2 -> System.out.println("Kalpeshgiri");
        case 3 -> 
        {
            System.out.println("Emp Number 3");
        switch (dept) {
            case "It"->System.out.println("It department");
            case "Ce"->System.out.println("Ce department");
            default->System.out.println("No department");
        }
    }
    default -> System.out.println("NO Id matches");
    }

    Scanner input = new  Scanner(System.in);
    int empid = input.nextInt();
    String empdept = input.next();

    switch (empid) {
        case 1:
            System.out.println("Yashgiri");
            break;
        case 2:
            System.out.println("Kalpeshgiri");
        case 3:
            System.out.println("Emp 3 details");
            switch (empdept) {
                case "It":
                    System.out.println("It department");
                    break;
                case "Ce":
                    System.out.println("Ce department");
                    break;
                default:
                    System.out.println("No department here");
                    break;
            }
            break;
        default:
            System.out.println("Enter valid Id");
            break;
    }
}
