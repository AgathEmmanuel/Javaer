import java.util.*;

public class ReverseNumber{
	public static void main(String[] args){
		int rem=0,rev=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num!=0){
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.println("reversed num is "+rev);
	}
}


