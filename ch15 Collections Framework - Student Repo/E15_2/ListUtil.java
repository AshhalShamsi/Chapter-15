package E15_2;

import java.util.*;

/**
   This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
   /**
      Reverses the elements in a linked list
      @param strings the linked list to reverse
   */
   public static void reverse(LinkedList<String> strings)
   {
       LinkedList<String> reverse = new LinkedList<>();
       
       ListIterator<String> iterator = strings.listIterator();
       while (iterator.hasNext()){
           iterator.next();
       strings.addFirst(strings.remove());
    }
   }
}