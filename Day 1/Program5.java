import java.util.*;

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
     
        if(input<0) 
          {
             throw new NumberFormatException("number is negative");
          }
        if (input>100)
         {
            throw new NumberFormatException("number is greater than 100");
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