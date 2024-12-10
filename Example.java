import java.util.Scanner;
class LoginUp
{
    public void loginUp()
    {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Username : ");
        String username = sc.next();
        System.out.print("Enter the Password : ");
        String password = sc.next();
        if (username.equals("admin") && password.equals("admin"))
        {
            System.out.println("You Login Successfully");
        }
        else {
            System.out.println("Invalid Details Please check Again");
        }
    }
}
class SignUp
{
    public void signUp()
    {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Username : ");
        String username1 = sc.next();
        System.out.print("Enter the Password : ");
        String password1 = sc.next();
        System.out.print("Enter the Gender : ");
        char gender = sc.next().charAt(0);
        System.out.print("Enter the Moblie Number : ");
        String number = sc.next();
        System.out.println("Your Data Has been Stored");
    }
}
class Home
{
    public void home()
    {
		Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Home Page");
        System.out.println("1.Select your coursers ");
        System.out.println("2.Practices the Coding");
        System.out.println("3.videos");
        System.out.println("4.Feedback");
		System.out.print("Select Your Option : ");
        int select = sc.nextInt();
        switch(select)
        {
            case 1: System.out.println("You have Selected the coursers");
            System.out.println("1.Java Full Stack");
            System.out.println("2.Python Full Stack");
            System.out.println("3.Software Testing");
            System.out.println("4.AIML");
			System.out.print("Select Your Option : ");
            int select1 = sc.nextInt();
            switch(select1)
            {
                 case 1 : System.out.println("You have Selected Java Full Stack");
                 System.out.println("In Java You have Courses like : ");
                 System.out.println("1. HTML, CSS, JavaScript, React.JS");
                 System.out.println("2. Java, Java Advance, Spring, SpringBoot");
                 System.out.println("3. MySQL, MongoDB");
                break;
                case 2 : System.out.println("You have Selected Python Full Stack");
                System.out.println("In Python You have Courses like : ");
                System.out.println("1. HTML, CSS, JavaScript, React.JS");
                 System.out.println("2. Python, Python Advance, Django, Flask");
                 System.out.println("3. MySQL, MongoDB");
                 break;
                 case 3 : System.out.println("You have Selected Software Testing");
                 System.out.println("In Software Testing You have Courses like : ");
                 System.out.println("BlackBox Testing");
                 System.out.println("WhiteBox Testiing");
                 System.out.println("MySQL, Any DataBases");
                 break;
                 case 4 : System.out.println("You have Selected AIML Course");
                 System.out.println("In AIML You have Courses like : ");
                 System.out.println("Artifical Intelligence");
                 System.out.println("Machine Learning");
                 System.out.println("Deep Learning");
                 System.out.println("Natural Language Processing");
                 break;
                 default : System.out.println("Invalid Data");
            }
            break;
            case 2 :
            System.out.println("You have Selected the Coding Practices");
            System.out.println("1.LeetCode");
            System.out.println("2.Hackerrank");
            System.out.println("3.CodeForces");
            System.out.println("4.CodeRabbit");
			System.out.print("Select Your Option : ");
            int select2 = sc.nextInt();
            switch(select2)
            {
                case 1 : System.out.println("You have Selected LeetCode");
                System.out.println("In LeetCode You have Courses like : ");
                System.out.println("1. Java");
                System.out.println("2. Python");
                System.out.println("3. C++");
                System.out.println("4. JavaScript");
                System.out.println("5. MySQL");
				System.out.print("Select your Option : ");
                int coding = sc.nextInt();
                if(coding==1)
                {
                    System.out.println("You have Selected Java");
					System.out.println("All the Best");
                }
                else if(coding==2)
                {
                    System.out.println("You have Selected Python");
					System.out.println("All the Best");
                }
                else if(coding==3)
                {
                    System.out.println("You have Selected C++");
					System.out.println("All the Best");
                }
                else if(coding==4)
                {
                    System.out.println("You have Selected JavaScript");
					System.out.println("All the Best");
                }
                else if(coding==5)
                {
                    System.out.println("You have Selected MySQL");
					System.out.println("All the Best");
                }
                else 
                {
                    System.out.println("Invalid Data");
                }
                break;
                case 2 : System.out.println("You have Selected Hackerrank");
                System.out.println("In LeetCode You have Courses like : ");
                System.out.println("1. Java");
                System.out.println("2. Python");
                System.out.println("3. C++");
                System.out.println("4. JavaScript");
                System.out.println("5. MySQL");
				System.out.print("Select your Option : ");
                int coding1 = sc.nextInt();
                if(coding1==1)
                {
                    System.out.println("You have Selected Java");
					System.out.println("All the Best");
                }
                else if(coding1==2)
                {
                    System.out.println("You have Selected Python");
					System.out.println("All the Best");
                }
                else if(coding1==3)
                {
                    System.out.println("You have Selected C++");
					System.out.println("All the Best");
                }
                else if(coding1==4)
                {
                    System.out.println("You have Selected JavaScript");
					System.out.println("All the Best");
                }
                else if(coding1==5)
                {
                    System.out.println("You have Selected MySQL");
					System.out.println("All the Best");
                }
                else 
                {
                    System.out.println("Invalid Data");
                }
                break;
                case 3 : System.out.println("You have Selected CodeForces");
                System.out.println("In LeetCode You have Courses like : ");
                System.out.println("1. Java");
                System.out.println("2. Python");
                System.out.println("3. C++");
                System.out.println("4. JavaScript");
                System.out.println("5. MySQL");
                int coding2 = sc.nextInt();
                if(coding2==1)
                {
                    System.out.println("You have Selected Java");
					System.out.println("All the Best");
                }
                else if(coding2==2)
                {
                    System.out.println("You have Selected Python");
					System.out.println("All the Best");
                }
                else if(coding2==3)
                {
                    System.out.println("You have Selected C++");
					System.out.println("All the Best");
                }
                else if(coding2==4)
                {
                    System.out.println("You have Selected JavaScript");
					System.out.println("All the Best");
                }
                else if(coding2==5)
                {
                    System.out.println("You have Selected MySQL");
					System.out.println("All the Best");
                }
                else 
                {
                    System.out.println("Invalid Data");
                }
                break;
                case 4 : System.out.println("You have Selected CodeRabbit");
                System.out.println("In LeetCode You have Courses like : ");
                System.out.println("1. Java");
                System.out.println("2. Python");
                System.out.println("3. C++");
                System.out.println("4. JavaScript");
                System.out.println("5. MySQL");
                int coding3 = sc.nextInt();
                if(coding3==1)
                {
                    System.out.println("You have Selected Java");
					System.out.println("All the Best");
                }
                else if(coding3==2)
                {
                    System.out.println("You have Selected Python");
					System.out.println("All the Best");
                }
                else if(coding3==3)
                {
                    System.out.println("You have Selected C++");
					System.out.println("All the Best");
                }
                else if(coding3==4)
                {
                    System.out.println("You have Selected JavaScript");
					System.out.println("All the Best");
                }
                else if(coding3==5)
                {
                    System.out.println("You have Selected MySQL");
					System.out.println("All the Best");
                }
                else 
                {
                    System.out.println("Invalid Data");
                }
                break;
                default : System.out.println("Invalid Data");
            }
            break;
            case 3 : System.out.println("You have Selected Videos");
			System.out.println("Which Videos Do you want to Select : ");
			System.out.println("1.Java Course");
			System.out.println("2.Python Course");
			System.out.println("3.C++");
			System.out.println("4.MySQL");
			int coding4 = sc.nextInt();
			switch(coding4)
			{
				case 1 : System.out.println("You have Selected Java Full COurse");
				System.out.println("All the Best");
				break;
				case 2 : System.out.println("You have Selected Python Full COurse");
				System.out.println("All the Best");
				break;
				case 3 : System.out.println("You have Selected C++ Full COurse");
				System.out.println("All the Best");
				break;
				case 4 : System.out.println("You have Selected MySQL Full COurse");
				System.out.println("All the Best");
				break;
				default : System.out.println("Invalid Data");
			}
            break;
            case 4 : System.out.println("You have Selected Feedback");
			System.out.println("Can You Send Message for as directly through this afreedsk247@gmail");
			System.out.println("---------------OR----------------");
			System.out.println("You can Send now directly");
			String message = sc.next();
			System.out.println("Your Message is : "+message);
			
            break;
            default : System.out.println("Invalid Data");
        }

    }
}
class Example
{
    public static void main(String[] args) {
			while(true)
			{
            Scanner sc = new Scanner(System.in);
            System.out.println("-----------Welcome to LMS Portal---------------");
            SignUp su = new SignUp();
            su.signUp();
            LoginUp lu = new LoginUp();
            lu.loginUp();
            Home h = new Home();
            h.home();
            System.out.println("Thank you for using our LMS Portal");
			System.out.println("------------------------------------------------");
			}
    }
}