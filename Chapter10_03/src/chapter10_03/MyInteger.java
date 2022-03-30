
package chapter10_03;

public class MyInteger {
    
    
  int Value;            //stores the int value

    MyInteger(int value) {
        Value = value;          
    }

    int getValue() {        //the values GetterMethods
        return Value;
    }

        boolean isEven() {              //equation to see if the value is an even number
        return (Value % 2) == 0;
    }

    public boolean isOdd() {                //equation to see if the value is an even odd
        return (Value % 2) == 1;
    }

    public boolean isPrime() {                          //equation to see if the value is an even prime
      for (int i = 2; i <= Value / 2; i++) {
            if (Value % i == 0)
                 return false;
            }
		return true;
	}

    public static boolean isEven(int Int) {         //equation to see if a specific value is an even number
        return (Int % 2) == 0;                          
    }                                                   

    public static boolean isOdd(int Int) {                      //equation to see if a specific value is an odd number
        return (Int % 2) == 1;
    }

    public static boolean isPrime(int Int) {                        //equation to see if a specific value is an prime number
	for (int i = 2; i <= Int / 2; i++) {
            if (Int % i == 0)
                 return false;
            }
		return true;
	}
   

    public static boolean isEven(MyInteger Int) {                   //see if a specified value is an even number
        return Int.isEven();
    }

    public static boolean isOdd(MyInteger Int) {                                      //see if a specified value is an odd number
        return Int.isOdd();
    }

    public static boolean isPrime(MyInteger Int) {
        return Int.isPrime();                                                                                            //see if a specified value is an prime number
    }

    public boolean equals(int x) {
        if (x == Value)                                         
            return true;
        return false;
    }

    public boolean equals(MyInteger Int) {                                      //equation to see if a specific value is equal to a value
        if (Int.Value == Value) 
            return true;
        return false;
    }

    public static int parseInt(char[] values) {                                             //equation to see if a specified value is equal to a value
        int result = 0;
        for (char a : values) {
            result += Character.getNumericValue(a);
        }
        return result;                                                                         //converts an array of numeric value to an int value
    }                                                                                                               
    public static int parseInt(String value) {                                                          //converts a sting to a int value
        return Integer.parseInt(value);
    }
}
    
    

