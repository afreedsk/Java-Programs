import java.util.Scanner;
class BubbleSortSimple
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size : ");
        int arr[] =  new int[sc.nextInt()];
        int temp = 0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter the Element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++)
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
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}