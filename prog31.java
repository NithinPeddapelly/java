import java.util.Scanner;
public class prog31 {
    public static void main(String args[])
    {
        System.out.print("Enter the number bruh :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            int star = i*2-1;
            for(int j=1;j<=star;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            int star = i*2-1;
            for(int j=1;j<=star;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
