import java.util.*;
public class Ascii{
	public static void main(String[] args){
		char ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		int ascii=(int)ch;
		System.out.println("ASCII of "+ch+" is "+ascii);
	}
}


