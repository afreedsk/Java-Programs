import java.util.Scanner;
class PalindromeString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your String : ");
        String str = sc.next();
        String rev = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev = rev+str.charAt(i);
        }
		if(rev==str)
		{
        System.out.println("Its a Palindrome String : "+str);
		}
		else {
		System.out.println("It a not Palindrome String: "+str);
		}
    }
}