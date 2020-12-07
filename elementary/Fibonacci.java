import java.io.*;

public class Fibonacci{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number limit ");
		int num=Integer.parseInt(br.readLine());
		int a=0,b=1,next;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<=num;i++){
			next=a+b;
			a=b;
			b=next;
			System.out.print(next+" ");
			}
		System.out.println();
		}
}


				

