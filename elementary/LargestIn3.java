import java.util.*;

public class LargestIn3{
	public static void main(String[] args){
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b && a>c)
			System.out.println("The largest num is "+a);
		else if(b>a && b>c)
			System.out.println("The largest num is "+b);
		else
			System.out.println("The largest num is "+c);
	}
}


