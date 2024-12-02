class MethodOverloading 
{
    public static void add(int a) 
    {
        System.out.println("Single parameter: " + a);
    }

    public static void add(int a, int b) 
    {
        System.out.println("Two parameters: " + (a + b));
    }

    public static void add(int a, int b, int c) 
    {
        System.out.println("Three parameters: " + (a + b + c));
    }
}

class MethodOverriding extends MethodOverloading 
{
    public static void add(int a) 
    {
        System.out.println("Overridden single parameter: " + a);
    }
}

class Polymorphism 
{
    public static void main(String[] args) 
    {
        System.out.println("Main Starts");
        
        MethodOverloading ml = new MethodOverloading();
        ml.add(5);
        ml.add(5, 3);
        ml.add(5, 3, 6);
        
        MethodOverriding mr = new MethodOverriding();
        mr.add(3);
        mr.add(4);

        System.out.println("Main Ends");
    }
}
