interface Vehicle 
{
    void start();
    void stop();
}

interface Electric 
{
    void charge();
}

class ElectricCar implements Vehicle, Electric 
{
    public void start() 
    {
        System.out.println("Electric car is starting...");
    }

    public void stop() 
    {
        System.out.println("Electric car is stopping...");
    }

    public void charge() 
    {
        System.out.println("Electric car is charging...");
    }
}

class MultipleInheritanceWithInterfaces
{
    public static void main(String[] args) 
    {
        ElectricCar myCar = new ElectricCar();
        myCar.start();
        myCar.charge();
        myCar.stop();
    }
}
