//Ashhal Shamsi
//9/7/2017
//This creates a ToDo priority
//THIS IS TRY TWO TRY ONE IS ATTACHED TO THE BACK AND IT CRASHED AND BURNED

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
      // this if block turns the possible letter into numbers by converting them to numbers between the desired values
      if (priority.charAt(0)== 'M')
            priority = "10";//comes last so after 9
      else if (priority.charAt(0)== 'D')
            priority = "1.5";//comes after 1 but before 2
      else if (priority.charAt(0) == 'W')
            priority = "2.5";//comes after 2 but before 3
       this.priority = priority;
       this.description = description;
       
    }

   public String toString()
   {
       //this block converst the strings back to their proper letters
      if (this.priority.equals("10"))
            priority = "M";//returns 10 to M
      else if (this.priority.equals("1.5"))
            priority = "D";//returns 1.5 to D
      else if (this.priority.equals("2.5"))
            priority = "W";//returns 2.5 to W 
       return description + " : Priority " + priority +"\n";//displays the priority and its description

   }
  /**
    Compares objects by priority
    @param Object other work order
    @return -1,0,1 comparing priority var
   */
  public int compareTo(Object Obj)
  {
      //compares the objects together
     ToDo other = (ToDo)Obj; 
     //parses the double priorites and returns value depending on which has the higer priority
     if (Double.parseDouble(this.priority) < Double.parseDouble(other.priority))
        return -1;//this has a greater priority
     else if (Double.parseDouble(this.priority) > Double.parseDouble(other.priority))
        return 1;//other has a greater priority
     else 
        return 0;//they have the same priority
        }
     
        /*
         * Please Enter A command
            add M make a door blue-print
            Please Enter A command
            add 9 decide why doors are not a good idea to keep breaking
            Please Enter A command
            add 4 break 5 more doors
            Please Enter A command
            next
            Fix Door : Priority 1
            
            Please Enter A command
            next
            Break Door : Priority D
            
            Please Enter A command
            next
            Rebuild Door : Priority 2
            
            Please Enter A command
            next
            Destroy Door : Priority W
            
            Please Enter A command
            next
            Create Door : Priority 3
            
            Please Enter A command
            next
            break 5 more doors : Priority 4
            
            Please Enter A command
            next
            decide why doors are not a good idea to keep breaking : Priority 9
            
            Please Enter A command
            next
            make a door blue-print : Priority M
            
            Please Enter A command
            quit

         */
        
        
        
}// end of work order
