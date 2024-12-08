class CustomExceptionDemo1
{
    public static void main(String[] args)
    {
        System.out.println("Main Starts");
        try
        {
            System.out.println("Hello");
            System.out.println(10/0);
            try
            {
            System.out.println(10/0);
            }
            catch(Exception e)
            {
                System.out.println("Bye");
            }
        }
        catch(Exception e)
        {
            System.out.println("error");
        }
        System.out.println("Hi");
    }
}