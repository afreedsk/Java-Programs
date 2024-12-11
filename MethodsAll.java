class MethodParameterWithoutReturnType 
{
    public static void methodParameterWithoutReturnType(int age) 
	{
        System.out.println("Age received: " + age);
    }
}

class WithoutMethodParameterWithReturnType 
{
    public static int withoutMethodParameterWithReturnType() 
	{
        return 2; // Returning a value
    }
}

class WithMethodParameterWithReturnType 
{
    public static int withMethodParameterWithReturnType(int n) 
	{
        return n * 2; // Returning double the value of 'n' for demonstration
    }
}

class WithoutMethodParameterWithoutReturnType 
{
    public static void withoutMethodParameterWithoutReturnType() 
	{
        System.out.println("Hello, this is a method without parameters and return type.");
    }
}

class MethodsAll
{
    public static void main(String[] args) 
	{
        // Calling method with parameter but no return type
        MethodParameterWithoutReturnType.methodParameterWithoutReturnType(21);

        // Calling method without parameter but with a return type
        int valueFromM2 = WithoutMethodParameterWithReturnType.withoutMethodParameterWithReturnType();
        System.out.println("Returned value from m2: " + valueFromM2);

        // Calling method with parameter and return type
        int valueFromM3 = WithMethodParameterWithReturnType.withMethodParameterWithReturnType(5);
        System.out.println("Returned value from m3: " + valueFromM3);

        // Calling method without parameter and without return type
        WithoutMethodParameterWithoutReturnType.withoutMethodParameterWithoutReturnType();
    }
}
