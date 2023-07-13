import java.util.Scanner;
public class prog4 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number : ");
    int a = sc.nextInt();
    int sum = 0;
    int rem = a;
    
    while (rem != 0)
    {
        int b = rem % 10;
        sum = sum + b;
        rem = rem /10;
    }
    System.out.println("The sum is : "+ sum);

    }
}
