import java.util.Scanner;
public class prog3 
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
    
        int num = sc.nextInt();
        int r = num;
        int n = r % 10;
        {
            if (n == 0)
            {
                System.out.println("You've entered 0");
            }
            else if (n > 0)
            {
                System.out.println("The number is positive");
            }
            else if (n < 0)
            {
                System.out.println("The number is Negative");
            }

        }

    }
     
}
