import java.util.Scanner;
public class prog5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int number1 = sc.nextInt();

        System.out.println("Enter the first number : ");
        int number2 = sc.nextInt();

        System.out.println("Enter the first number : ");
        int number3 = sc.nextInt();

        int largest=findLargest(number1,number2,number3);
        System.out.println("The largest number is "+largest);
    }
    public static int findLargest(int num1,int num2,int num3){
        
    int largest = num1;

    if (num2 > num1){
        largest = num2;
    }
    else if (num3 > num1){
        largest = num3;
    }
    return largest;
}
    
}
