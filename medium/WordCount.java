import java.util.*;
import java.io.*;

public class WordCount{
	public static int countWords(String str){
		if(str==null || str.isEmpty())
			return 0;
		String[] words=str.split("\\s+");
		return words.length;
	}

	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		System.out.println("No of Words : "+countWords(str));
	}
}

		
