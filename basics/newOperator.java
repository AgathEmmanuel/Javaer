

// Java program to demonstrate assigning  
// of object reference variables 
  
// Box class 
class Box 
{ 
    double width; 
    double height; 
    double depth; 
} 
  
// Driver class 
public class newOperator 
{ 
    // Driver method 
    public static void main(String args[])  
    { 
        // creating box object 
        Box b1 = new Box(); 
          
        // assigning b2 to b1 
        Box b2 = b1; 
          
        // height via b1 and b2 
        System.out.println(b1.height); 
        System.out.println(b2.height); 
          
        // changing height via b2 
        b2.height = 20; 
          
        // height via b1 and b2 
        // after modification through b2 
        System.out.println(b1.height); 
        System.out.println(b2.height); 
    } 
      
} 

/*
 *
 *
Declaration : First, you must declare a variable of the class type. This variable does not define an object. Instead, it is simply a variable that can refer to an object. Below is general syntax of declaration with an example :

Syntax :
class-name var-name;

Example :
// declare reference to an object of class Box
Box mybox;


Instantiation and Initialization : Second, you must acquire an actual, physical copy of the object and assign it to that variable. You can do this using the new operator. The new operator instantiates a class by dynamically allocating(i.e, allocation at run time) memory for a new object and returning a reference to that memory. This reference is then stored in the variable. Thus, in Java, all class objects must be dynamically allocated.


First let us understand what the following fragment does in above program.

Box b1 = new Box();
Box b2 = b1;

You might think that b2 is being assigned a reference to a copy of the object referred to by b1. That is, you might think that b1 and b2 refer to separate and distinct objects. However, this would be wrong. Instead, after this fragment executes, b1 and b2 will both refer to the same object. The assignment of b1 to b2 did not allocate any memory or copy any part of the original object. It simply makes b2 refer to the same object as does b1. Thus, any changes made to the object through b2 will affect the object to which b1 is referring, since they are the same object. Same can be verified by output when we change height of box via b2.
 *
 *
 *
 *
 *Note : Although b1 and b2 both refer to the same object, they are not linked in any other way. For example, a subsequent assignment to b1 will simply unhook b1 from the original object without affecting the object or affecting b2.For example :

Box b1 = new Box();
Box b2 = b1;
// ...
b1 = null;

Here, b1 has been set to null, but b2 still points to the original object.

Passing object references variables to methods

When we pass object reference to a method, the parameter that receives it will refer to the same object as that referred to by the argument. To know more with examples, refer Passing and Returning Objects in Java.




*/


