

// Java program to demonstrate  
// cloning of one-dimensional arrays 
  
class ArrayClone 
{     
    public static void main(String args[])  
    { 
        int intArray[] = {1,2,3}; 
          
        int cloneArray[] = intArray.clone(); 
          
        // will print false as deep copy is created 
        // for one-dimensional array 
        System.out.println(intArray == cloneArray); 
          
        for (int i = 0; i < cloneArray.length; i++) { 
            System.out.println(cloneArray[i]+" "); 
        } 

/*


 When you clone a single dimensional array, such as Object[], a “deep copy” is performed with the new array containing copies of the original array’s elements as opposed to references. 

 */




// Java program to demonstrate  
// cloning of multi-dimensional arrays 
  
        int intArray1[][] = {{1,2,3},{4,5}}; 
          
        int cloneArray1[][] = intArray1.clone(); 
          
        // will print false 
        System.out.println(intArray1 == cloneArray1); 
          
        // will print true as shallow copy is created 
        // i.e. sub-arrays are shared 
        System.out.println(intArray1[0] == cloneArray1[0]); 
        System.out.println(intArray1[1] == cloneArray1[1]); 

          
    } 
} 
