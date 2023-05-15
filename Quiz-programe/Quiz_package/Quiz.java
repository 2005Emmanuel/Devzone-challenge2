package Quiz_package;

/*imports*/
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Quiz {
    public static void main(String[] args) {
        Main_Quiz obj = new Main_Quiz();
        obj.user_welcome();
    }

}

class Main_Quiz {
    Scanner obj1;
    Scanner obj2;
    Scanner obj3;
    Scanner obj4;
    Scanner obj5;
    Scanner obj6;
    Scanner obj7;
    Scanner obj8;
    Scanner obj9;
    Timer timer;
    int timer_;
    int counter;
    int opt;
    String username;
    String option_1;
    String option_2;
    String option_3;
    String option_4;
    String option_5;
    ArrayList<String> Answer = new ArrayList<>();

    public void user_welcome() {
        System.out.println("YT Quiz\n");
        System.out.println("Enter your name to begin:\n");
        obj1 = new Scanner(System.in);
        username = obj1.nextLine();
        System.out.println("\nwelcome " + username);
        System.out.println("\nSet a countdown time");
        try {
            obj3 = new Scanner(System.in);
            timer_ = obj3.nextInt();
        } catch (Exception e) {
            System.out.println("\ninvalid input!!\n");
            user_welcome();
        }
        System.out.println("\n You seted " + timer_ + " Seconds as the time\n");
        timer_m(timer_);
        question_1();
        question_2();
        question_3();
        question_4();
        question_5();

    }

    /*@param seconds */
    /*instantiated the Timertask class in the schedule method */
    /* passed the instance of the Task class as one of the parameters */
    public void timer_m(int seconds) {
        timer = new Timer(); 
        timer.schedule(new Task(), seconds * 1000);
    }

    /*This subclass inherits the TimerTask class and also Overrides the run method of TimerTask */
    class Task extends TimerTask {
        @Override
        public void run() {
            timer.cancel();
            calculate_score();
            Answer.clear();
            System.out.println("your specified Time has Ended Thank you for using YT Quiz " + username);
            last_menu();
        }
    }

    public void question_1() {
        System.out.println("\n1. Which of This is a programming Language\n");
        String[] First_Question_Options = { "a. Java", "b. Pyqt", "c. Goland\n" };
        for (String i : First_Question_Options) {
            System.out.println(i);
        }

        obj4 = new Scanner(System.in);
        option_1 = obj4.nextLine();

        switch (option_1) {
            case "a":
                Answer.add("java");
                break;

            case "b":
                break;

            case "c":
                break;

            default:
                System.out.println("invalid input");
                question_1();
                break;
        }

    }

    public void question_2() {
        System.out.println("\n2. What is SQL\n");
        String[] Second_Question_Options = { "a. structural query Language", "b. structured query Langugae",
                "c. structure query Langugae\n" };
        for (String i : Second_Question_Options) {
            System.out.println(i);
        }

        obj5 = new Scanner(System.in);
        option_2 = obj5.nextLine();

        switch (option_2) {
            case "a":
                break;

            case "b":
                Answer.add("Structured query Language");
                break;

            case "c":
                break;

            default:
                System.out.println("invalid input!!");
                question_2();
                break;
        }

    }

    public void question_3() {
        System.out.println("\n3. Which of the following is a Primary colour \n");
        String[] Third_Question_Options = { "a. gold", "b. yellow", "c. pink\n" };
        for (String i : Third_Question_Options) {
            System.out.println(i);
        }

        obj6 = new Scanner(System.in);
        option_3 = obj6.nextLine();

        switch (option_3) {
            case "a":
                break;

            case "b":
                Answer.add("yellow");
                break;

            case "c":
                break;

            default:
                System.out.println("invalid input!!");
                question_3();
                break;
        }

    }

    public void question_4() {
        System.out.println("\n4. What is Recursion \n");
        String[] Fourth_Question_Options = { "a. a method calling itself", "b. ivokation of the super class method ",
                "c. method overloading\n" };
        for (String i : Fourth_Question_Options) {
            System.out.println(i);
        }

        obj7 = new Scanner(System.in);
        option_4 = obj7.nextLine();

        switch (option_4) {
            case "a":
                Answer.add("a method calling itself");
                break;

            case "b":
                break;

            case "c":
                break;

            default:
                System.out.println("invalid input!!");
                question_4();
                break;
        }

    }

    public void question_5() {
        System.out.println("\n5. Full meaning of http \n");
        String[] Fifth_Question_Options = { "a. hyper test transfer protocol", "b. hyper text transfer proctocol ",
                "c. hyper text transfer  protocol\n" };
        for (String i : Fifth_Question_Options) {
            System.out.println(i);
        }

        obj8 = new Scanner(System.in);
        option_5 = obj8.nextLine();

        switch (option_5) {
            case "a":
                System.out.println("\nYour Scores is processing.....");
                break;

            case "b":
                System.out.println("\nYour Scores is processing.....");
                break;

            case "c":
                Answer.add("a method calling itself");
                System.out.println("\nYour Scores is processing.....");
                break;

            default:
                System.out.println("invalid input!!");
                question_5();
                break;
        }

    }

    public void calculate_score() {
        if (Answer.size() == 5) {
            System.out.println("\ncongratulation you scored 10/10\n");

        }

        else if (Answer.size() == 4) {
            System.out.println("\ncongratulation you scored 5/10\n");

        }

        else if (Answer.size() == 3) {
            System.out.println("\nOops you scored  3/10\n");

        }

        else if (Answer.size() == 2) {
            System.out.println("\nOops you scored 2/10\n");

        }

        else if (Answer.size() == 1) {
            System.out.println("\nOops you scored  1/10\n");

        } else {
            System.out.println("\nSorry you failed the Quiz\n");

        }

    }

    public void last_menu() {
        String[] menu = { "1. Quit Quiz", "2. Retake Quiz" };
        for (String i : menu) {
            System.out.println(i);
        }

        try {
            obj9 = new Scanner(System.in);
            opt = obj9.nextInt();
        } catch (Exception e) {
            System.out.println("invalid input!!");
            last_menu();
        }

        switch (opt) {
            case 1:
                System.exit(0);
                break;

            case 2:
                user_welcome();
                break;

            default:
                System.out.println("invalid case");
                break;

        }

    }

}
