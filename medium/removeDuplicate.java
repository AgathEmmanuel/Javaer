import java.util.*;

public class removeDuplicate{
	public static String dupRemover(String s){
		char[] sarr=s.toCharArray();
		int index=0;
		for(int i=0;i<sarr.length;i++){
			int j;
			for(j=0;j<i;j++){
				if(sarr[i]==sarr[j])
					break;
			}
			if(j==i){
				sarr[index++]=sarr[i];
			}
		}
		return String.valueOf(Arrays.copyOf(sarr,index));
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		System.out.println("The result is\n"+dupRemover(s));
	}
}

