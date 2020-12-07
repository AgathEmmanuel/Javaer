import java.util.*;


public class maxOccurChar{
	public static char maxChar(String a){
		char[] s=a.toCharArray();
		int counter[]=new int[26];
		char result=0;
		int max=-1;
		for(int i=0;i<(s.length);i++){
			if(s[i]!=' ')
				counter[(int)(s[i]-'a')]++;
		}
		for(int i=0;i<26;i++){
			if(max<counter[i]){
				max=counter[i];
				result=(char)(i+'a');
			}
		}
		return result;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("The max character is "+maxChar(s));
	}
}

