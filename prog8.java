import java.util.Scanner;

public class prog8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the start year: ");
        int startYear = sc.nextInt();

        System.out.print("Enter the end year: ");
        int endYear = sc.nextInt();
        
        System.out.println("Leap years between " + startYear + " and " + endYear + ":");
        
        for (int year = startYear; year <= endYear; year++) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                System.out.println(year);
            }
        }
    }
}






