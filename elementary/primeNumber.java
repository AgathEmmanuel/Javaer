import java.util.*;
import java.io.*;

public class primeNumber{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number ");
		int flag=0;
		int a=Integer.parseInt(br.readLine());
		if(a==1)
			System.out.println("1 is neither prime nor composite");
		else{
			for(int i=2;i<a;i++){
				if(a%i==0)
					flag=1;
			}
		}
		if(flag==1)
			System.out.println("not prime");
		else
			System.out.println("prime");
			
				



	}
}

