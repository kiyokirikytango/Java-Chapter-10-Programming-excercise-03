/*
Chapter 10 Programming excercise 03
Riky Hernandez
10/01/21
Description: Design a class, checking values if they are prime,odd even
                check if they are equal values, and changing arrays and strings to int
      ____
     /___/\_                               
    _\   \/_/\__                          
  __\       \/_/\                       
  \   __    __ \ \                    
 __\  \_\   \_\ \ \   __               
/_/\\   __   __  \ \_/_/\           
\_\/_\__\/\__\/\__\/_\_\/         
   \_\/_/\       /_\_\/             
      \_\/       \_\/
*/
package chapter10_03;


public class Chapter10_03 {

   
    public static void main(String[] args) {
                                                                    //making int using specific values
        MyInteger int1 = new MyInteger(13);
        MyInteger int2 = new MyInteger(8);
        MyInteger int3 = new MyInteger(12);
        MyInteger int4 = new MyInteger(22);
        MyInteger int5 = new MyInteger(94);
        MyInteger int6 = new MyInteger(9);
        

        System.out.println(int1.getValue() + ", is it prime? " + int1.isPrime());           //checking values if the are prime numbers
        System.out.println(int2.getValue() + ", is it prime? " + int2.isPrime());
        System.out.println(int3.getValue() + ", is it prime? " + int3.isPrime());
 
        System.out.print("\n");
            

        System.out.println(int4.getValue() + ", is it Even? " + int4.isEven());     //checking values if the are even numbers
        System.out.println(int5.getValue() + ", is it Even? " + int5.isEven());
        System.out.println(int6.getValue() + ", is it Even? " + int6.isEven());
        
         System.out.print("\n");
            

        System.out.println(int1.getValue() + ", is it Odd? " + int1.isOdd());               //checking values if the are odd numbers
        System.out.println(int4.getValue() + ", is it Odd? " + int4.isOdd());
        System.out.println(int6.getValue() + ", is it Odd? " + int6.isOdd());
        
        System.out.print("\n");
        
        System.out.println(MyInteger.isPrime(12));                                  //checling if specified values are even,odd, or prime
        System.out.println(MyInteger.isOdd(25));
        System.out.println(MyInteger.isEven(100));
        
        System.out.print("\n");
        
        System.out.println(int1.getValue() + " equals " + int4.getValue() + ": " + int1.equals(int4));   //checkin of two values are equal

        System.out.println(MyInteger.parseInt(new char[] {'9'}));                           //converts an array of numeric value to an int value
        
        System.out.println(MyInteger.parseInt("1994"));                                                           //converts a sting to a int value
    }
}

        