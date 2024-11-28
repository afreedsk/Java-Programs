import java.util.Scanner;

class Family {
    public void famliy() {
		Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to My family");
        System.out.println("We have 4 members");
        System.out.println("1. Father");
        System.out.println("2. Mother");
        System.out.println("3. Brother");
        System.out.println("4. Me");
        System.out.print("Who's Information you needed  : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You have Selected Father");
                System.out.println("Father's Name : " + "SM. Basha");
                System.out.println("Father's Age : " + "  45");
                System.out.println("Father's Occupation : " + "Real State");
                break;

            case 2:
                System.out.println("You have Selected Mother");
                System.out.println("Mother's Name : " + "Shaik. Faizun");
                System.out.println("Mother's Age : " + "  40");
                System.out.println("Mother's Occupation : " + "Asha Worker");
                break;

            case 3:
                System.out.println("You have Selected Brother");
                System.out.println("Mother's Name : " + "Shaik.Afzal");
                System.out.println("Mother's Age : " + "  20");
                System.out.println("Brother is Studying : " + "BIPC");
                break;

            case 4:
                System.out.println("You have Selected Me");
                System.out.println("My Name : " + "Shaik Afreed");
                System.out.println("My Age : " + "  22");
                System.out.println("My Occupation : " + "Bewarse");
                break;

            default:
                System.out.println("Invalid Choice");

        }
    }
}

class MyEducation {
    public void MySchool() {
        System.out.println("From Nuresy to 6th Class I am in Srestha Model School");
        System.out.println("From 7th Class to 10th Class I am in Sri Poojitha Public School");
        System.out.println("I got 10GPA");
    }

    public void MyDiploma() {
        System.out.println("In Diploma I am Electrical Electronics and Engineering");
        System.out.println("I got 7.2GPA");
        System.out.println("I Enjoyed Alot");
    }

    public void MyBtech() {
        System.out.println("In Btech I am Computer Science and Engineering");
        System.out.println("I got 8.0GPA");
        System.out.println("I Enjoyed Alot");
    }
}

class MySkills {
    public void mySkills() {
        System.out.println("My Skills are :");
        System.out.println("1. HTML");
        System.out.println("2. CSS");
        System.out.println("3. JavaScript");
        System.out.println("4. React.js");
        System.out.println("5. Java");
        System.out.println("6. SpringBoot");
        System.out.println("7. JDBC");
        System.out.println("8. MySQL");
        System.out.println("9. MongoDB");
        System.out.println("10. RestAPI's");
        System.out.println("11. Git, GitHub");
        System.out.println("I am a Full Stack Developer");
    }
}

class MyCareer {
    public void myCareer() {
        System.out.println("My Career Goal is to be a Full Stack Developer");
        System.out.println("I want to work in a MNC Company");
        System.out.println("I want to earn a good salary");
    }
}

class Afreed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Family f = new Family();
        f.famliy();
        System.out.println("-------------------------------------------");
        MyEducation e = new MyEducation();
        e.MySchool();
        e.MyDiploma();
        e.MyBtech();
		System.out.println("--------------------------------------------");
        MySkills s = new MySkills();
        s.mySkills();
		System.out.println("--------------------------------------------");
        MyCareer c = new MyCareer();
        c.myCareer();
		System.out.println("Thank You Buddy");
    }
}
