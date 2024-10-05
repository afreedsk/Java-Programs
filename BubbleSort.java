import java.util.Scanner;
class BubbleSort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int arr[] = new int[sc.nextInt()];
		int temp =0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the " +(i+1)+" element : ");
			arr[i] = sc.nextInt(); 
		}
		for(int i =0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
				    temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		printArray(arr);
	}
	public static void printArray(int arr[])
	{
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
} 