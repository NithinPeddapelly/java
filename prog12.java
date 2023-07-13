import java.util.Scanner;
public class prog12 {
    public static void main(String args[]){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;

        for (int i = 1;i<=10;i++)
        {
            sum = n * i;
            System.out.println(n+" X "+ i +" = "+sum);
        }
        
    }
}

