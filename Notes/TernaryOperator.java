

// Java code to illustrate ternary operator 
  
import java.io.*; 
  
class TernaryOperator { 
    public static void main(String[] args) 
    { 
  
        // variable declaration 
        int n1 = 5, n2 = 10, res; 
  
        System.out.println("First num: " + n1); 
        System.out.println("Second num: " + n2); 
  
        // Performing ternary operation 
        res = (n1 > n2) ? (n1 + n2) : (n1 - n2); 
  
        // Print the largest number 
        System.out.println("Result = " + res); 
    } 
} 

/*
 *
 *
 *
 String mood = inProfit() ? "happy" : "sad";


because the ternary expression is returning something (of type String in this example).

It's not really meant to be used as a short, in-line if-else. In particular, you can't use it if the individual parts don't return a value, or return values of incompatible types. (So while you could do this if both method happened to return the same value, you shouldn't invoke it for the side-effect purposes only).


*/


