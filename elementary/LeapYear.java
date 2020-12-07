import java.util.*;
import java.io.*;

public class LeapYear{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Year to check ");
		int a=Integer.parseInt(br.readLine());
		if(a%4==0)
			if(a%100==0)
				if(a%400==0)
					System.out.println("leap year");
				else
					System.out.println("not leap year");
			else
				System.out.println("leap year");
		else
			System.out.println("not leap year");
	}
}





