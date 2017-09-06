import java.util.Scanner;
import java.util.*;
/**
   A program to add, remove, modify or print
   student names and grades.
*/
public class Chapter16examples{
   public static void main(String[] args)
   {
     //Stack -LIFO
     //        4
     //        3
     //        2
     //        1
     //pop     4
     
     Stack<String> words = new Stack<>();
     words.push("Aisle");
     words.push("Bdellium");
     words.push("Czar");
     
     System.out.println(words.pop());
     System.out.println(words.peek());
     
     
     Queue<String> word = new LinkedList<>();
     
     word.add("Djinn");
     word.add("Euphrates");
     word.add("Fohn");
     
     System.out.println(word.remove());
     System.out.println(word.peek());
     
     
     
     
      
   }
}
