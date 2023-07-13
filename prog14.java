import java.util.Scanner;
public class prog14 {
    public static void main(String args[]){
        System.out.print("Enter 1 or 0 :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0){
            return ;
        }
         do {
            System.out.println("Enter your marks : ");
            Scanner m = new Scanner(System.in);
            int Marks = m.nextInt();
            if(Marks>=90){
                System.out.println("This is Good");
            }
            if(Marks >=60 && Marks <=89){
                System.out.println("This is also good");
            }
            if(Marks >= 0 && Marks <=59){
                System.out.println("This is good as well");
            }
         }while(n == 1);
        
    }
}
