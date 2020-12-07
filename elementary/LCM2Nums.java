import java.util.*;

public class LCM2Nums{
	public static void main(String[] args){
		int a,b,lcm,flag=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEntern 2 numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		lcm=(a>b)?a:b;
		while(flag==1){
			if(lcm%a==0 && lcm%b==0){
				System.out.println("Lcm of "+a+" and "+b+" is "+lcm);
				flag=0;
				break;
			}
			++lcm;
		}
	}
}

			
		 
		
