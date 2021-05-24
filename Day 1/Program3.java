


import java.lang.Thread;
class Factorial implements Runnable
{
 	Thread t;
        int N,fact=1;
	Factorial(int N)
        {
         this.N=N;
         t=new Thread(this);
         System.out.println("New thread: " + t);
         t.start();
        }
       public void run()
        {
	   try
             {
              for(int j=1;j<=N;j++)
                   {
                     fact=fact*j;
                   }
                 System.out.println("Factorial " +N+" : "+fact);
            t.sleep(500);
            
          }
       catch(InterruptedException e)
       {
          System.out.println("Interrupted Exception");
       }
  }

}

  
class Program3
{
   public static void main(String arg[])
    {
     try{
       for (int i=1;i<=5;i++)
        {
          int n=i;
	   new Factorial(n);
          Thread.sleep(1000);
        }
     }
     catch(InterruptedException e)
      {
        System.out.println("Interrupted Exception");
      }
	
    System.out.println("Returned factorial of 5 different numbers");
  }
}