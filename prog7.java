import java.util.Scanner;
public class prog7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any year : ");
        int a = sc.nextInt();
        int n = a;
        
        if (a % 4 == 0 && (a % 400 == 0 || a % 100 != 0)) { //This line starts an "if" statement to check if the year is divisible by 4 (no remainder) and either divisible by 400 (with no remainder) or not divisible by 100 (with a remainder).
            System.out.println(n + " is a leap year");
        } else {
            System.out.println(n + " is not a leap year");
        }
    }
}













