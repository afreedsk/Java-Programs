import java.util.Scanner;
class SwitchDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Java Subject Marks : ");
		int marks = sc.nextInt();
		if(marks<35)
		{
			System.out.println("Your Fail better luck next time buddy....");
		}
		else if(marks>=35 && marks<=50)
		{
			System.out.println("D Grade Buddy");
		}
		else if(marks>=51 && marks<=70)
		{
			System.out.println("C Grade Buddy");
		}
		else if(marks>=71 && marks<=90)
		{
			System.out.println("B Grade Buddy");
		}
		else if(marks>=91 && marks<=100)
		{
			System.out.println("A Grade Buddy");
		}
	}
}