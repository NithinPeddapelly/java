import java.util.Scanner;
public class prog25 {
    public static void main(String args[]){
        System.out.println("Enter a numberrrr :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(y);
                y++;    
            }
            System.out.println();
        }
    }
}
