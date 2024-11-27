/*class Main
{
    public static void myMain()
    {
        System.out.println("Hi");
    }
}
class Demo
{
    public static void main(String[] args)
    {
        Main m = new Main();
        m.myMain();
    }
}*/
abstract  class Demo1
{
    abstract void display();
}
class Demo2 extends Demo1
{
    public void display()
    {
        System.out.println("Hello");
    }
}
class AbstractDemo {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.display();
    }
}