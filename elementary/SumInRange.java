import java.util.*;

public class SumInRange{
	public static void main(String[] args){
		int min,max,sum=0;
		Scanner sc=new Scanner(System.in);
		min=sc.nextInt();
		max=sc.nextInt();
		for(int i=min;i<=max;i++)
			sum+=i;

		System.out.println("The Sum is "+sum);
	}
}

