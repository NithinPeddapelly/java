import java.util.Scanner;
public class Prog16 {
    public static void main(String args[]){

        System.out.println("Enter 2 numbers for variables");

        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("1.ADDITION \n 2.SUBTRACTION \n 3.MULTIPLICATION \n 4.DIVISION \n 5.REMAINDER");
        Scanner SELECTION = new Scanner (System.in);
        int n = SELECTION.nextInt();

        switch(n){
            case 1 :
            System.out.println("The addition is : " + a+b);
            break;
            case 2:
            System.out.println("The subtraction is : " + (a-b));
            break;
            case 3:
            System.out.println("The multiplication is : " + a*b);
            break;
            case 4:
            System.out.println("The Division is : " + a/b );
            break;
            case 5:
            System.out.println("The Reminder is : "+ a % b );
            break;
            default:
            System.out.println("Invalid input");
        }
    }
    
}
