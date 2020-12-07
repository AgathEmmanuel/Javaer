import java.util.*;
public class UpperCase{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		/*
		 *next() can read the input only till the space. It can't read two words separated by a space. Also, next() places the cursor in the same line after reading the input. nextLine() reads input including space between the words (that is, it reads till the end of line \n ).
		 */

		char ch=cin.nextLine().charAt(0);
		if(ch>=67 && ch<=90)
			System.out.print("Upper");
		else if(ch>=97 && ch<=122)
			System.out.print("Lower");
		else if(ch>=48 && ch<=57)
			System.out.print("Number");
		else
			System.out.print("Symbol");

	}
}

		
