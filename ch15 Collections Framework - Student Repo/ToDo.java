//Ashhal Shamsi
//9/7/2017
//This creates a ToDo priority

/**
   This class encapsulates a work order with a priority.
*/
public class ToDo implements Comparable
{

   private String priority;
   private String description;

   /**
      Constructs a work order with a given priority and description.
      @param aPriority the priority of this work order
      @param aDescription the description of this work order
   */

   public ToDo(String priority, String description)
   {
       this.priority = priority;
       this.description = description;
       
    }

   public String toString()
   {
       return description + ":" + priority;

   }
  /**
    Compares objects by priority
    @param Object other work order
    @return -1,0,1 comparing priority var
   */
  public int compareTo(Object Obj)
  {
     ToDo other = (ToDo)Obj; 
     boolean ours = true;
     if(!(this.priority.charAt(0) == 4 && this.priority.charAt(0) == 13 && this.priority.charAt(0) == 23))
     {
         ours = false;
        if(!(other.priority.charAt(0) == 4 && other.priority.charAt(0) == 23 && other.priority.charAt(0) == 13))
        { 
            if (Integer.parseInt(this.priority) < Integer.parseInt(other.priority))
                return -1;
             else if (Integer.parseInt(this.priority) > Integer.parseInt(other.priority))
                return 1;
             else 
                return 0;
        }
     }
     else if(ours = true)
     {
        if(this.priority.charAt(0) == 13)
            return -1;
        else if (this.priority.charAt(0) == 4)
            {
                if(Integer.parseInt(other.priority) == 1)
                    return -1;
                else if(Integer.parseInt(other.priority) == 2)
                    return 1;
            }
        else if(this.priority.charAt(0) == 23)
            {
                if(Integer.parseInt(other.priority) == 2)
                    return -1;
                else if(Integer.parseInt(other.priority) == 4)
                    return 1;

            }
     }
        return 0;
    }

}// end of work order
