import java.util.Scanner;

void main(){
    Scanner op = new Scanner(System.in);
   
    int ans = 0;
    while (true) {
         System.out.print("Enter operators : ");
         char operators = op.next().trim().charAt(0);
        if(operators == '+' || operators == '-'|| operators == '*' || operators == '/' || operators == '%'){
            System.out.print("Enter num1 :");
            int num1 = op.nextInt();
            System.out.print("Enter num2 :");
            int num2 = op.nextInt();

            if(operators =='+'){
                ans = num1 +  num2;
            }
            if(operators == '-'){
                ans = num1 - num2;
            }
            if(operators == '*'){
                ans = num1 * num2;
            }
            if(operators == '/'){
                if(num2 != 0){
                    ans = num1 / num2;
                }
            }
            if(operators == '%'){
                ans = num1 % num2;
            }
        }else if(operators == 'x' || operators == 'X'){
            break;
        }else{
            System.out.println("Envalid Operations");
        }
        System.out.println(ans);
    }
    
}