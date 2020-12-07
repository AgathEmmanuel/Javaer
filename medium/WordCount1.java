import java.util.*;
import java.io.*;


public class WordCount1{

	static final int OUT=0;
	static final int IN=1;
	public static int countWords(String str){
		int state=OUT;
		int wc=0;
		int i=0;
		while(i<str.length()){
			System.out.print(str.charAt(i));
			System.out.print(wc);
			System.out.println(state);

			if(str.charAt(i)==' '||str.charAt(i)=='\n'||str.charAt(i)=='\t')
				state=OUT;
			else if(state==OUT){
				state=IN;
				++wc;
				//we increment the word count when previous state is OUt
				//and the next character is a word character
			}
			++i;
			}
			return wc;
		}
	

		public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		System.out.println("No of Words : "+countWords(str));
	}
}

