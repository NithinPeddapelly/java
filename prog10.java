import java.util.Scanner;
public class prog10 {
    public static void main(String args[])
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }
    }
}