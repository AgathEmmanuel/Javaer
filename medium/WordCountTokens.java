import java.util.StringTokenizer;
import java.io.*;

public class WordCountTokens{
	public static int count_w(String str){
		if(str==null||str.isEmpty())
			return 0;
		StringTokenizer tokens=new StringTokenizer(str);
		return tokens.countTokens();
	}

	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		System.out.println("The word count is "+count_w(str));
	}
}

