import java .io.*;  
import java.util.*;  
    
class SortArrayFunc  
{        
    static int largest(int[] arr,int n)  
    {  
        Arrays.sort(arr);  
        return arr[n - 1];  
    }  
    static int printArray(int[] arr){
	    for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
	    }
	    System.out.println();
	    return 0;
    }

    public static void main(String[] args)  
    {  
	Scanner sc=new Scanner(System.in);
        int []arr = {10, 324, 45, 90, 9808};  
        int n = arr.length;  
        System.out.println("The largest element is "+largest(arr, n));  
	int []arra=new int[4];
	for(int i=0;i<arra.length;i++){
		arra[i]=sc.nextInt();
	}
        System.out.println("The largest element is "+largest(arra,arra.length));  
	System.out.println();
	printArray(arr);
	printArray(arra);



    }  
}  
