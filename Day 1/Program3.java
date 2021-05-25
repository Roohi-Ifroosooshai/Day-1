


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Program3 {

   public static void main(final String[] arguments) throws InterruptedException, ExecutionException {
    
        ExecutorService executor = Executors.newSingleThreadExecutor();
        
        for (int i=1; i<=5; i++){
            Future<Long> result = executor.submit(new Factorial(i));
            
            Long factorial = result.get();
            System.out.println("Thread"+i);
            System.out.println("Factorial of "+ i + ": " + factorial);
        }
        executor.shutdown();
   }  

static class Factorial implements Callable<Long> {
      private int number;

      public Factorial(int number) {
         this.number = number;
      }

      public Long call() throws Exception {
         return factorial();
      }

      private Long factorial() throws InterruptedException {
         long result = 1;
                   
         while (number != 0) {              
            result = number * result;
            number--;
            Thread.sleep(100);          
         }
         return result;      
      }
   }
}
