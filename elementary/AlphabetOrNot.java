import java.util.*;


public class AlphabetOrNot{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		System.out.println();
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
			System.out.println(ch+" is an alphabet");
		else 
			System.out.println(ch+" is not alphabet");

	}
}


