
import java.io.*;

public class Factorial{

	public static int fact_n(int n){
		int fact=1,i;
		if(n==0)
			fact=1;
		else
			for(i=1;i<=n;i++)
				fact*=i;
		return fact;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number ");
		int a=Integer.parseInt(br.readLine());
		System.out.println("Factorial is "+fact_n(a));
	}
	
}


		
