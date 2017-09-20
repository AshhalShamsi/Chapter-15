import java.util.*;
public class Grid
{
   private static final int SIZE = 10;
   int[][] pixels = new int[SIZE][SIZE];

   /**
      Flood fill, starting with the given row and column.
   */
   public void floodfill(int row, int column)
   {
       int i = 0;
       Stack<Integer[]> rows = new Stack<>();
       rows.push(new Integer[] {row,column});
      while (i < SIZE * SIZE)
        {
            i++;
            Integer [] rekt =rows.pop();
            int x = rekt[0];
            int y = rekt[1];
            pixels[x][y] = i;
            if(x<SIZE-1 && pixels[x+1][y] == 0)
               rows.push(new Integer[] {x+1,y});
            if(y<SIZE-1 && pixels[x][y+1] == 0)
               rows.push(new Integer[] {x,y+1});
            if(x>0 && pixels[x-1][y] == 0)
               rows.push(new Integer[] {x-1,y});   
            if(y>0 && pixels[x][y-1] == 0)
               rows.push(new Integer[] {x,y-1});
            
            
            
        }
   }

   @Override
   public String toString()
   {
      String r = "";
      for (int i = 0; i < SIZE; i++)
      {
         for (int j = 0; j < SIZE; j++)
            r = r + String.format("%4d", pixels[i][j]);
         r = r + "\n";
      }
      return r;
   }
}
