import java.util.Scanner;
class Day1TwoSum
{
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5};
        int target = 7;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}