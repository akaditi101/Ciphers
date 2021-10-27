import java.util.Scanner;
public class Runner
{
    public static void main (String [] args) throws InterruptedException
    {
        String userChoice = "";
        String message = "";
        String newMessage = "";
        Scanner scan = new Scanner(System.in);
        // this first part is just where I talk about the story
        System.out.println("\u000C");
        System.out.println("Hello Secret Agent!");
        Thread.sleep(2500); // all of these just pause the computer
        System.out.println("\u000C");
        System.out.print("You have been selected to be a secret spy of the CIA!");
        Thread.sleep(3500);
        System.out.println("\u000C");
        System.out.print("When communicating with other agents, make sure to use the code that we taught you.");
        Thread.sleep(3500);
        System.out.println("\u000C");
        System.out.println("Here is your special communication device.");
        do
        {
            // this part introduces the menu
            System.out.println("\u000C");
            Thread.sleep(500);
            System.out.println("Enter the name of the action you would like it to perform and then input your message");
            System.out.println("1) Encode a message");
            System.out.println("2) Decode a message");
            System.out.println("3) Quit the program");
            userChoice = scan.nextLine();
            if (userChoice.equalsIgnoreCase("Encode a message"))// this statement tests to see if the user wanted to encode their message
            {
                // this is just where it will encode the method
                Thread.sleep(500);
                System.out.println(".");
                Thread.sleep(500);
                System.out.println("..");
                Thread.sleep(500);
                System.out.println("...");
                System.out.println("Enter your message");
                message = scan.nextLine();
                Thread.sleep(500);
                System.out.println(".");
                Thread.sleep(500);
                System.out.println("..");
                Thread.sleep(500);
                System.out.println("...");
                System.out.println("Here is your message: " + Cipher.encode(message));
                Thread.sleep(3000);
            }
           
            else if (userChoice.equalsIgnoreCase("Decode a message"))//this statement is to see if the user wanted to decode their message
            {
               // here it will decode the method
               Thread.sleep(500);
               System.out.println(".");
               Thread.sleep(500);
               System.out.println("..");
               Thread.sleep(500);
               System.out.println("...");
               System.out.println("Enter your message");
               message = scan.nextLine();
               newMessage = Cipher.decode(message);
               Thread.sleep(500);
                System.out.println(".");
                Thread.sleep(500);
                System.out.println("..");
                Thread.sleep(500);
                System.out.println("...");
               System.out.println("Here is your message: " + newMessage);
               Thread.sleep(3000);
            }
            else // this is for if the user just put something else and it will clear the screen
            {
                System.out.println("\u000C");
            }
        } while (!userChoice.equalsIgnoreCase("Quit the program"));
    }
}