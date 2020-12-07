import java.util.*;

public class SumOfDigits{
	public static void main(String[] args){
		int sum=0,rem;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num!=0){
			rem=num%10;
			sum+=rem;
			num/=10;
		}
		System.out.println("The sum is "+sum);

	}
}

