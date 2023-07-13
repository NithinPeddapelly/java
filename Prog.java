import java.util.Scanner;

class Prog{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int b = sc.nextInt();
        int sum =0;
        int rem = b;
        while(rem<0)
        {
            int n = sum % 10;
            sum = sum + rem;
            rem=rem/10;
        }
        System.out.println(sum);
    }
}


