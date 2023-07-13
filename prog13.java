import java.util.Scanner;
public class prog13 {
    public static void main(String args[]){
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("The Even numbers are : ");
        for (int i=1;i <= n;i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        int u = 1;
        System.out.println(" ");  // Added for next line sepration 
        System.out.print("The Odd numbers are : ");
        while (u <=n)
        {
            if (u % 2 !=0){
                System.out.print(u+" ");
            }
            u++;
        }
    }
    
}
