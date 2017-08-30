
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
   This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
   public static void main(String[] args)
   {
       //create Map: favoriteColo   rs
       Map<String, Color> favoriteColors = new HashMap<>();
       favoriteColors.put("Juliet", Color.BLUE);
       favoriteColors.put("Romeo", Color.GREEN);
       favoriteColors.put("Adam", Color.RED);
       favoriteColors.put("Eve", Color.BLUE);
       //favoriteColors.put("Eve", Color.YELLOW); MAKES THIS REPLACE THE OLD VALUE
       
      //create Set<String> keySet

      Set<String> keySet = favoriteColors.keySet();
      // Print all keys and values in the map


      for (String key: keySet)
      {
          if (favoriteColors.get(key) == (Color)Color.BLUE)
                favoriteColors.remove(key);
          Color value = favoriteColors.get(key);
          System.out.println(key + " : " + value);
      }
   }
}
