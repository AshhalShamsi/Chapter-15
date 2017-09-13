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
      String input = "";
      //create PriorityQueue of ToDo
      PriorityQueue<ToDo> work = new PriorityQueue<>(); 
      //creates a sentry variable for the while loop to run until the user enters quit
      boolean sentry = true;
      //add several ToDo objects to the priority queue
       work.add(new ToDo("1", "Fix Door"));
       work.add(new ToDo("D", "Break Door"));
       work.add(new ToDo("2", "Rebuild Door"));
       work.add(new ToDo("W", "Destroy Door"));
       work.add(new ToDo("3", "Create Door"));
   while (sentry)
      {
      System.out.println("Please Enter A command");
      // asks the user for a line
      input = keyboard.nextLine();
      if(input.substring(0,3).equalsIgnoreCase("add"))//checks if the first word is add
             work.add(new ToDo(input.substring(4,5), input.substring(6)));
                          //enters the priority      enters the rest of the string
      
      else if(input.substring(0,4).equalsIgnoreCase("next"))//checks if the word is next
            System.out.println(work.remove());//removes the value witht he highest priority
      else if(input.equalsIgnoreCase("quit"))//quits the program
            sentry = false;
      else
            System.out.println("Print Correct Command");
   }
}
}
