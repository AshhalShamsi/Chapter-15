public class FloodFillDemo 
{
   public static void main(String[] args)
   {
      Grid gr = new Grid();
      gr.floodfill(0, 9);
      System.out.println(gr.toString());
   }
}
