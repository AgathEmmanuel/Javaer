

// Code using Scanner Class
import java.util.Scanner;
class ScannerClass1
{
     public static void main(String args[])
     {
         Scanner scn = new Scanner(System.in);
         System.out.println("Enter an integer");
         int a = scn.nextInt();
         int c = scn.nextInt();
         float f = scn.nextFloat();


         System.out.println("Enter a String");


         String b = scn.nextLine();
         System.out.println("You have entered:- "
                 + a + " " + "and name as " + b);
     }
}
