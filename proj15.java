import java.util.Scanner;
public class proj15 {
    public static void main(String args[]){
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i=2;i<=n;i++){
            if(n % i == 0){
                sum++;                
            }
        }
        if (sum <= 2){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is Not prime");
        }
    }
}
