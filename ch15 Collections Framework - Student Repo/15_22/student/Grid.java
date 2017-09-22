//Ashhal Shamsi
//Grid Program
//9/21/2017
import java.util.*;
public class Grid
{
   private static int SIZE;
   //creates pixel array
   int[][] pixels;
   /**
      Flood fill, starting with the given row and column. and a size if the user wishes
   */
   public void floodfill(int row, int column)
   {
       //creates variables required fot the while loop
       int i = 0;//counter to set the values of the pixels to
       SIZE = 10;//sets it to the initial size
       pixels = new int[SIZE][SIZE];//creates the pixels arrays with values of 0 for all values
       Stack<Integer[]> rows = new Stack<>();//creats the stack which has everything pushed on it
       rows.push(new Integer[] {row,column});//pushes the initial value onto the stack
      while (i < SIZE * SIZE)//suns until i exceeds the grid size
        {
            // the integer array holds the xy coordinates. 
            Integer [] coor =rows.pop();
            
            //this pulls out the xy coordinates from the Integer array
            int x = coor[0];
            int y = coor[1];
            
            //checks if the pixel is filled and fills it if it isn't. 
            if (pixels[x][y] == 0)
                pixels[x][y] = ++i;
                
            //runs through all the pixels cardinal directions
            if(x>0 && pixels[x-1][y] == 0)
            {
             pixels[x-1][y] = ++i;//fills the pixel before pushing   
             rows.push(new Integer[] {x-1,y});//pushes the pixel onto the stack
            }
             if(y<SIZE-1 && pixels[x][y+1] == 0)
            {
               pixels[x][y+1] = ++i;
               rows.push(new Integer[] {x,y+1});
            }
            if(x<SIZE-1 && pixels[x+1][y] == 0)
            {
               pixels[x+1][y] = ++i; 
               rows.push(new Integer[] {x+1,y});
            }
            if(y>0 && pixels[x][y-1] == 0)
            {
               rows.push(new Integer[] {x,y-1});
               pixels[x][y-1] = ++i;
            }
            
            
            
        }
   }
   
   /**
      Flood fill, starting with the given row and column. and a size if the user wishes
   */
   public void floodfill(int row, int column, int SIZE1)
   {
       //creates variables required fot the while loop
       int i = 0;//counter to set the values of the pixels to
       SIZE = SIZE1;//sets the size if the user wishes to enter it
       pixels = new int[SIZE][SIZE];//creates the pixels arrays with values of 0 for all values
       Stack<Integer[]> rows = new Stack<>();//creats the stack which has everything pushed on it
       rows.push(new Integer[] {row,column});//pushes the initial value onto the stack
      while (i < SIZE * SIZE)//suns until i exceeds the grid size
        {
            // the integer array holds the xy coordinates. 
            Integer [] coor =rows.pop();
            
            //this pulls out the xy coordinates from the Integer array
            int x = coor[0];
            int y = coor[1];
            
            //checks if the pixel is filled and fills it if it isn't. 
            if (pixels[x][y] == 0)
                pixels[x][y] = ++i;
                
            //runs through all the pixels cardinal directions
            if(x>0 && pixels[x-1][y] == 0)
            {
             pixels[x-1][y] = ++i;//fills the pixel before pushing   
             rows.push(new Integer[] {x-1,y});//pushes the pixel onto the stack
            }
             if(y<SIZE-1 && pixels[x][y+1] == 0)
            {
               pixels[x][y+1] = ++i;
               rows.push(new Integer[] {x,y+1});
            }
            if(x<SIZE-1 && pixels[x+1][y] == 0)
            {
               pixels[x+1][y] = ++i; 
               rows.push(new Integer[] {x+1,y});
            }
            if(y>0 && pixels[x][y-1] == 0)
            {
               rows.push(new Integer[] {x,y-1});
               pixels[x][y-1] = ++i;
            }
            
        }
   }
   

   /*
    *       93    91    89    87    85    83    94    95    96   100
            92    90    88    86    84    82    80    97    98    99
            15    12     9     6     2    81    79    77    75    73
            14    11     8     5     1     3    78    76    74    72
            16    13    10     7     4    63    65    67    69    71
            17    18    59    60    61    62    64    66    68    70
            19    20    58    56    54    52    50    48    46    44
            21    22    57    55    53    51    49    47    45    43
            23    24    28    30    32    34    36    38    40    42
            25    26    27    29    31    33    35    37    39    41


    */

   @Override
   public String toString()
   {
      String r = "";
      for (int i = 0; i < SIZE; i++)
      {
         for (int j = 0; j < SIZE; j++)
            r = r + String.format("%6d", pixels[i][j]);
         r = r + "\n";
      }
      return r;
   }
}
