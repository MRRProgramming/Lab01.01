import java.util.Scanner;

/**
 * Asks user for some data and outputs text based on that input
 * @version 09.17.2025
 * @ author mradhakrishnan
 * Flint session:
 */
public class SimpleIOMath {
    private String name;
    private int age;
    private int favNumber;

    /**
     * Asks the user questions using Scanner class
     */
    public void promptUser()    {
        System.out.print("Question 1: What is your name? ");
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        // TODO: Make sure JC can't break the program
        System.out.print("Question 2: How old are you? ");
        age = in.nextInt();
        System.out.print("Question 3: What is your favorite number? ");
        favNumber = in.nextInt();




    }

    private boolean isPrime(int n)  {
        for (int i = 2; i <= Math.sqrt(n)+1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private int firstPrimeFactor () {
        for (int i = 2; i <= Math.sqrt(age); i++) {
            if (isPrime(i) && age % i == 0) {
                return i;
            }
        }
        return age;
    }
    /**
     * Summarize the inputs and prints text using inputs
     */
    public void printInfo() {
        System.out.println("I'm gonna teach you how to sing it out\n" +
                "Come on, come on, come on\n" +
                "Let me tell you what it's all about\n" +
                "Reading, writing, arithmetic\n" +
                "Are the branches of the learning tree");
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("At your next birthday, you will turn " + (age + 1));
        System.out.println("The first prime factor of " + age + " is: " + firstPrimeFactor());
        System.out.println("Your favorite number is: "  + favNumber);
        System.out.println("Your favorite number squared is: " + (int)(Math.pow(favNumber, 2)));



    }

    /**
     * main method for class SimpleIOMath
     * @param args command line arguments, if needed
     */
    public static void main(String[] args) {
        SimpleIOMath app = new SimpleIOMath();
        System.out.println("* Sit yourself down, take a seat *\n" +
                "* All you gotta do is repeat after me *");
        app.promptUser();
        app.printInfo();
        System.out.println("* end of program *");

    }
}
