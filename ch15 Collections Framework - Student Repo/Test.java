import java.util.*;

/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class Test
     */
    public Test()
    {
       
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static void main (String args[])
    {
        LinkedList<String> name = new LinkedList<>();
        name.addFirst("yes");
        name.addFirst("Jebus");
        name.addFirst("yeet");
        ListIterator iterator = name.listIterator();
        iterator.add("rek me m8");
        iterator = name.listIterator();
        
        for (String loss: name)
            System.out.println(loss);
            
        System.out.println("-------------------------------------------------");
        
        while (iterator.hasNext())
        {
            String yes = (String)iterator.next();
            if (yes.length() <= 3)
                iterator.remove();
        }

        
         System.out.println("-------------------------------------------------");
         
         for (String loss: name)
            System.out.println(loss);
    }

}
