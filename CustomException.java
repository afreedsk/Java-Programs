class CustomException
{
    public static void main(String[] args)
    {
        System.out.println("Statement 1");
        try
        {
            System.out.println("Statement 2");
            System.out.println(10/0);
            System.out.println("Statement 3");
        }
        catch(Exception e)
        {
            System.out.println("Statement 4");
        }
        System.out.println("Statement 5");
    }
}