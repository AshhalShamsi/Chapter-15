import java.util.PriorityQueue;
import java.util.*;
/**
   This program demonstrates a priority queue of work orders. The
   most important work orders are removed first.
*/
public class PriorityQueueDemo
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner (System.in);
      //create PriorityQueue of WorkOrder
      String input = "";
      PriorityQueue<ToDo> work = new PriorityQueue<>(); 
      boolean sentry = true;
      //add several WorkOrder
   while (sentry)
      {
      System.out.println("Please Enter A command");
      input = keyboard.nextLine();
      if(input.substring(0,3).equalsIgnoreCase("add"))
             work.add(new ToDo(input.substring(4,5), input.substring(6)));
      
      else if(input.substring(0,4).equalsIgnoreCase("next"))
            System.out.println(work.remove());
      else if(input.equalsIgnoreCase("quit"))
            sentry = false;
      else
            System.out.println("Print Correct Command");
   }
}
}
