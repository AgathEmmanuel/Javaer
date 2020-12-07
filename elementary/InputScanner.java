import java.io.*;
import java.util.Scanner;

public class InputScanner{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);

		System.out.println("Enter name");
		String name=scn.nextLine();


		System.out.println("Enter age ");
		int age=scn.nextInt();
		scn.nextLine();
		/*
		 *This is a common problem, and it happens because the nextInt method doesn't read the newline character of your input, so when you issue the command nextLine, the Scanner finds the newline character and gives you that as a line.

		 scn.nextLine();  //skip the newline character;

		 OR 

		 you can use 

		 int age=Integer.parseInt(input.nextLine());

		 *
		 */



		System.out.println("Enter sex");
		String sex=scn.nextLine();

		System.out.println("Enter age ");
		int age1=scn.nextInt();
		scn.nextLine();


		System.out.println("your name is "+name);
		System.out.println("your age is "+age);
		System.out.println("your sex is "+sex);
	}
}


		

