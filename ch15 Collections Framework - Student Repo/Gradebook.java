import java.util.Scanner;
import java.util.*;
/**
   A program to add, remove, modify or print
   student names and grades.
*/
public class Gradebook
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      Map<String, String> students = new HashMap<>();
     

      boolean done = false;
      while(!done)
      {
         System.out.println("A)dd R)emove M)odify P)rint Q)uit");
         String input = in.nextLine();
         if (input.equalsIgnoreCase("Q"))
         {
            done = true;
         }
         else if (input.equalsIgnoreCase("A"))
         {
            System.out.println("Please enter the new student's name:");
            String name = in.nextLine();
            System.out.println("Please enter the new student's grade:");
            String grade = in.nextLine();
            students.put(name, grade);
         }
         else if (input.equalsIgnoreCase("R"))
         {
            System.out.println("Please enter the student's name that you wish to remove:");
            String name = in.nextLine();
            Set<String> keys = students.keySet();
            for (String i : keys)
            {
                if (i.equalsIgnoreCase(name))
                    students.remove(i);
            }
         }
         else if (input.equalsIgnoreCase("M"))
         {
            System.out.println("Please enter the student's name whose grade you wish to change:");
            String name = in.nextLine();
            System.out.println("Please enter the student's new grade:");
            String grade = in.nextLine();
            Set<String> keys = students.keySet();
            for (String i : keys)
            {
                if (i.equalsIgnoreCase(name))
                    students.put(i, grade);
            }
         }
         else if (input.equalsIgnoreCase("P"))
         {
            Set<String> keys = students.keySet();
            for (String i : keys)
            {
                System.out.println(i + ": " + students.get(i));
            }
         }
         else
         {
            done = false;
         }
      }
   }
}
