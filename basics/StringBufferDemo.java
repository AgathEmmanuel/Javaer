

import java.io.*; 
class StringBufferDemo { 
    public static void main(String[] args) 
    { 
        StringBuffer s = new StringBuffer("GeeksforGeeks"); 
        int p = s.length(); 
        int q = s.capacity(); 
	//total allocated capacity
        System.out.println("Length of string GeeksforGeeks=" + p); 
        System.out.println("Capacity of string GeeksforGeeks=" + q); 


	StringBuffer b = new StringBuffer("Geeksfor"); 
        b.append("Geeks"); 
        System.out.println(b); // returns GeeksforGeeks 
        b.append(1); 
        System.out.println(b); // returns GeeksforGeeks1 


	StringBuffer a = new StringBuffer("GeeksGeeks"); 
        a.insert(5, "for"); 
        System.out.println(a); // returns GeeksforGeeks 
  
        a.insert(0, 5); 
        System.out.println(a); // returns 5GeeksforGeeks 
  
        a.insert(3, true); 
        System.out.println(a); // returns 5GetrueeksforGeeks 
  
        a.insert(5, 41.35d); 
        System.out.println(a); // returns 5Getr41.35ueeksforGeeks 
  
        a.insert(8, 41.35f); 
        System.out.println(a); // returns 5Getr41.41.3535ueeksforGeeks 
  
        char geeks_arr[] = { 'p', 'a', 'w', 'a', 'n' }; 
  
        // insert character array at offset 9 
        a.insert(2, geeks_arr); 
        System.out.println(a); // returns 5Gpawanetr41.41.3535ueeksforGeeks 



	StringBuffer d = new StringBuffer("GeeksGeeks"); 
        d.reverse(); 
        System.out.println(d); // returns skeeGrofskeeG 


	StringBuffer e = new StringBuffer("GeeksforGeeks"); 
        e.delete(0, 5); 
        System.out.println(e); // returns forGeeks 
        e.deleteCharAt(7); 
        System.out.println(e); // returns forGeek 


    } 
} 
