

// Java program to illustrate using 
// Java supports three jump statement: break, continue and return.
// These three statements transfer control to other part of the program. 
// break to exit a loop 
class BreakLoopDemo 
{ 
    public static void main(String args[]) 
    { 
        // Initially loop is set to run from 0-9 
        for (int i = 0; i < 10; i++) 
        { 
            // terminate loop when i is 5. 
            if (i == 5) 
                break; 
  
            System.out.println("i: " + i); 
        } 
        System.out.println("Loop complete."); 
    } 
} 
