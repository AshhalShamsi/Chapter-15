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
     boolean ours = (this.priority.charAt(0) == 'D' || this.priority.charAt(0) == 'M' || this.priority.charAt(0) == 'W');
     boolean theyrs = (other.priority.charAt(0) == 'D' || other.priority.charAt(0) == 'W' || other.priority.charAt(0) == 'M');
     if(!ours)
     {
        if(!theyrs)
        { 
            if (Integer.parseInt(this.priority) < Integer.parseInt(other.priority))
                return -1;
             else if (Integer.parseInt(this.priority) > Integer.parseInt(other.priority))
                return 1;
             else 
                return 0;
        }
     }
     else if(ours && !theyrs)
     {
        if(this.priority.charAt(0) == 'M')
            return 1;
        else if (this.priority.charAt(0) == 'D')
            {
                if(Integer.parseInt(other.priority) > 1)
                    return -1;
                else if(Integer.parseInt(other.priority) < 2)
                    return 1;
            }
        else if(this.priority.charAt(0) == 'W')
            {
                if(Integer.parseInt(other.priority) > 2)
                    return -1;
                else if(Integer.parseInt(other.priority) < 3)
                    return 1;

            }
     }
     
     else if(!ours && theyrs)
     {
        if(other.priority.charAt(0) == 'M')
            return -1;
        else if (other.priority.charAt(0) == 'D')
            {
                if(Integer.parseInt(this.priority) > 1)
                    return -1;
                else if(Integer.parseInt(this.priority) < 2)
                    return 1;
            }
        else if(other.priority.charAt(0) == 'W')
            {
                if(Integer.parseInt(this.priority) > 2)
                    return 1;
                else if(Integer.parseInt(this.priority) < 2)
                    return -1;

            }
     }
     else
     {
        if(this.priority.charAt(0) == 'M')
            return -1;
        else if (this.priority.charAt(0) == 'D')
            {
                if(other.priority.charAt(0) == 'D')
                    return 0;
                else if(other.priority.charAt(0) == 'W')
                    return -1;
                else 
                    return 1;
            }
        else if(this.priority.charAt(0) == 'W')
            {
                if(other.priority.charAt(0) == 'D')
                    return 1;
                else if(other.priority.charAt(0) == 'W')
                    return 0;
                else 
                    return -1;

            }
     }
        return 0;
    }

}// end of work order
