import java.io.*;

public class InputBuffer{
	public static void main(String[] args) throws IOException{
		String name;
		int age;
		char gender;
		BufferedReader cin=new BufferedReader
			(new InputStreamReader(System.in));
		System.out.print("please enter your name: ");
		name=cin.readLine();
		System.out.print("enter your age: ");
		age=Integer.parseInt(cin.readLine());
		System.out.print("enter your gender");
		gender=cin.readLine().charAt(0);

		System.out.println("you name is: "+name);
		System.out.println("you gender is: "+gender);
		System.out.println("you age is: "+age);
	}
}



		
