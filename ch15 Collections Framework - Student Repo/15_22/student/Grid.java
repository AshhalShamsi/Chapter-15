import java.util.*;
public class Grid
{
   private static final int SIZE = 10;
   int[][] pixels = new int[SIZE][SIZE];
   . . .

   /**
      Flood fill, starting with the given row and column.
   */
   public void floodfill(int row, int column)
   {
       int i = 1;
       Stack<Integer[]> row = new Stack<>();
       while (pixels[row][column] == 0)
       {
            pixels[row][column] = i;
            row.push(pixels[row][column])
            
            i++;
            row
            
            
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
