import java.util.Scanner;
class prog6{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the first number");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number");
        int number2 = sc.nextInt();
        System.out.println("Enter the third number");
        int number3 = sc.nextInt();
        int largest=findlargest(number1,number2,number3);
        System.out.println("The largest number is : "+ largest);

    }
    public static int findlargest(int num1,int num2,int num3)
    {
        int largest = num1;
        if(num2>num1){
            largest = num2;
        } 
        if (num3 > num2){
            largest = num3;
        }
        return largest;
    }

}