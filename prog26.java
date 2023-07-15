
import java.util.*;
public class prog26 
{
    public static void main(String args[])
    {
        System.out.print("Enter a num : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                int r = i+j;
                if(r % 2 == 0)
                {
                    System.out.print("1");
                }
                else if(r % 2 != 0)
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    
}
