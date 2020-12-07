import java.util.*;
import java.io.*;

public class OccurenceWord{
	public static int wordOccurence(String word,String str){
		String a[]=str.split("\\s+");
		int count=0;
		for(int i=0;i<a.length;i++){
			if(word.equals(a[i]))
				count++;
		}
		return count;
	}

		
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String word=br.readLine();
		String str=br.readLine();
		System.out.println("The occurenc of "+word+" is "+wordOccurence(word,str));
	}
}


