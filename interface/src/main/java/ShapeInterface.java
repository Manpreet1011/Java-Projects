public interface ShapeInterface {
    int x = 10;
   void area();
  default void displayMain()
   {
      System.out.println("Main interface");
   }
}
