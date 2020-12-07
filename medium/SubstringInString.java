
import java.util.*;

public class SubstringInString{
	public static int countN(String sub,String str){
		int m=sub.length();
		int n=str.length();
		int count=0;
		for(int i=0;i<=n-m;i++){
			int j;
			for(j=0;j<m;j++){
				if(str.charAt(i+j)!=sub.charAt(j))
					break;
			}
			if(j==m){
				count++;
				j=0;
			}
		}
		return count;
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String sub=sc.nextLine();
		String str=sc.nextLine();
		System.out.println("The no of substring ||"+sub+"|| in ||"+str+"|| is "+countN(sub,str));
	}
}

