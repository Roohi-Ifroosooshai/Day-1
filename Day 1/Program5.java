

import java.util.*;

class NumberIsNegativeException extends Exception {
    public NumberIsNegativeException(String message) {
        super(message);
    }
}

class NumberIsTooLargeException extends Exception {
    public NumberIsTooLargeException(String message) {
        super(message);
    }
}

class Program5
{
public static void main(String arg[])
    { 
        System.out.println("Enter input number: ");
        Scanner sr=new Scanner(System.in);
		int input=sr.nextInt();
        boolean flag = false;
        for (int i = 2; i <= input / 2; ++i) {
          if (input % i == 0) {
            flag = true;
            break;
          }
        }
        try{
            if(input<0){
                try{
                    throw new NumberIsNegativeException("number is Negative");
                }
                catch(NumberIsNegativeException e1){
                    System.err.println(e1);
                }
            }
            else if(input>100){
                try{
                    throw new NumberIsTooLargeException("number is greater than 100");
                }
                catch(NumberIsTooLargeException e2){
                    System.err.println(e2);
                }
            }
            else{
                if (!flag)
                System.out.println(input + " is a prime number.");
            else
                System.out.println(input + " is not a prime number.");
            }
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}
