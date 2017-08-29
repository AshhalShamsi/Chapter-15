import java.util.Scanner;
import java.util.*;

/**
   A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Compute primes up to which integer?");
      int n = Integer.parseInt(in.nextLine());
      Set<Integer> numbers = new HashSet<>();
      double sqn = Math.sqrt(n);
      for (int i = 2; i <= n; i++)
        {
            numbers.add(i);
            
        }
      for (int x = 2; x<= sqn; x++)
      {
   
      for (int i = x + 1; i <= n; i++)
        {
            if (i%x == 0)
                numbers.remove(i);
            
        }
    }
      for (Integer i: numbers)
            System.out.println(i);
        
      // Your work goes here







   }
   
}
