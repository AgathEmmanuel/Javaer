

// Code using Scanner Class
import java.io.*;
import java.util.Scanner;
class ScannerVsBuffered
{
     public static void main(String args[])throws IOException
     {

         Scanner scn = new Scanner(System.in);
         System.out.println("Enter an integer");
         int a = scn.nextInt();
         System.out.println("Enter a String");
         String b = scn.nextLine();
         System.out.printf("You have entered:- "
                 + a + " " + "and name as " + b);

	 //solved

         System.out.println("\nEnter an integer");
         int c = scn.nextInt();
	 scn.nextLine();//solves the problem
         System.out.println("Enter a String");
         String d = scn.nextLine();
         System.out.printf("You have entered:- "
                 + c + " " + "and name as " + d +"\n");

	BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in));
        System.out.println("\nEnter an integer");
        int e = Integer.parseInt(br.readLine());
        System.out.println("Enter a String");
        String f = br.readLine();
        System.out.printf("You have entered:- " + e +
                          " and name as " + f+"\n");

	 
     }
}

/*
 *
 *In Scanner class if we call nextLine() method after any one of the seven nextXXX() method then the nextLine() does not read values from console and cursor will not come into console it will skip that step. The nextXXX() methods are nextInt(), nextFloat(), nextByte(), nextShort(), nextDouble(), nextLong(), next().
In BufferReader class there is no such type of problem. This problem occurs only for Scanner class, due to nextXXX() methods ignore newline character and nextLine() only reads till first newline character. If we use one more call of nextLine() method between nextXXX() and nextLine(), then this problem will not occur because nextLine() will consume the newline character.


*/


/*
 *
 *
 
Other differences:
 

    BufferedReader is synchronous while Scanner is not. BufferedReader should be used if we are working with multiple threads.
    BufferedReader has significantly larger buffer memory than Scanner.
    The Scanner has a little buffer (1KB char buffer) as opposed to the BufferedReader (8KB byte buffer), but it’s more than enough.
    BufferedReader is a bit faster as compared to scanner because scanner does parsing of input data and BufferedReader simply reads sequence of characters.


    */


