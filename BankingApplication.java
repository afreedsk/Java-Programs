import java.util.Scanner;

class User 
{
    private Scanner sc = new Scanner(System.in);

    public void myUser()
    {
        System.out.println("1. LoginUp");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.print("Select an option: ");
        int userselect = sc.nextInt();

        switch (userselect) 
        {
            case 1:
                System.out.println("Enter your username: ");
                String username = sc.next();
                System.out.println("Enter your password: ");
                String password = sc.next();
                System.out.println("Welcome, " + username);
                break;
            case 2:
                System.out.println("Enter the Username: ");
                String username1 = sc.next();
                System.out.println("Enter Your Password: ");
                String password1 = sc.next();
                System.out.println("Enter the Email ID: ");
                String email = sc.next();
                System.out.println("Enter the Phone Number: ");
                long phone = sc.nextLong();
                System.out.println("Welcome, " + username1);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

class Main 
{
    private Scanner sc = new Scanner(System.in);
    private double balance = 0.0; 

    public void myBankingApplication() 
    {
        while (true) 
        {
            System.out.println("\n1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int userselect = sc.nextInt();

            switch (userselect) 
            {
                case 1:
                    System.out.println("Enter the amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw > balance) 
                    {
                        System.out.println("Insufficient balance!");
                    } 
                    else 
                    {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful. Current balance: " + balance);
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Deposit successful. Current balance: " + balance);
                    break;
                case 3:
                    System.out.println("Your current balance is: " + balance);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter valid data.");
            }
        }
    }
}

public class BankingApplication 
{
    public static void main(String[] args) 
    {
        System.out.println("--------- Welcome to the Banking Application ---------");
        User u = new User();
        u.myUser();
        Main m = new Main();
        m.myBankingApplication();
        System.out.println("----------- Thank You for using the Banking Application -----------");
    }
}
