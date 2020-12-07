import java.util.*;

public class HCF2Nums{
	public static void main(String[] args){
		int a,b,hcf=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers ");
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=1;i<=a && i<=b;i++){
			if(a%i==0 && b%i==0)
				hcf=i;
		}
		System.out.println(" The Lcm is "+hcf);
	}
}


