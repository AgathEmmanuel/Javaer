import java.util.*;

public class NoOfDigits{
	public static void main (String[] args){
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the number: ");
		n=sc.nextInt();
		while(n!=0){
			n/=10;
			count++;
		}
		System.out.println("No of digits :"+count);
	}
}

		
		
