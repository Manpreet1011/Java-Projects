
    public class TryWithoutCatchMain {

        public static void  main(String args[])
        {
            System.out.println(print());
        }
        public static String print()
        {
            try
            {
                System.out.println("Executing try block");
                return "from try";
            }
            catch (Exception e)
            {
                System.out.println("all exceptions");
            }
            /*catch (ArithmeticException e)
            {
                System.out.println("Arithmetic exception");
            }*/
            finally
            {
                System.out.println("Executing finally block");
               return "From finally";
            }
        }
    }

