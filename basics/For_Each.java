

// Java program to illustrate  
// for-each loop 
class For_Each      
{ 
    public static void main(String[] arg) 
    { 
        { 
            int[] marks = { 125, 132, 95, 116, 110 }; 
              
            int highest_marks = maximum(marks); 
            System.out.println("The highest score is " + highest_marks); 
        } 
    } 
    public static int maximum(int[] numbers) 
    {  
        int maxSoFar = numbers[0]; 
          
        // for each loop 
        for (int num : numbers)  
        { 
            if (num > maxSoFar) 
            { 
                maxSoFar = num; 
            } 
        } 
    return maxSoFar; 
    } 
} 


/* 
 *
 * 
Limitations of for-each loop

    For-each loops are not appropriate when you want to modify the array:

    for (int num : marks) 
    {
        // only changes num, not the array element
        num = num*2; 
    }

    For-each loops do not keep track of index. So we can not obtain array index using For-Each loop

    for (int num : numbers) 
    { 
        if (num == target) 
        {
            return ???;   // do not know the index of num
        }
    }

    For-each only iterates forward over the array in single steps

    // cannot be converted to a for-each loop
    for (int i=numbers.length-1; i>0; i--) 
    {
          System.out.println(numbers[i]);
    }

    For-each cannot process two decision making statements at once

    // cannot be easily converted to a for-each loop 
    for (int i=0; i<numbers.length; i++) 
    {
        if (numbers[i] == arr[i]) 
        { ...
        } 
    }



    */

