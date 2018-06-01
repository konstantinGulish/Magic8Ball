import java.util.Scanner;
import java.util.Random;
public class Magic8Ball {
    public static void main (String [] args) {

        // Initiate scanner and random
        Scanner in = new Scanner (System.in);
        Random rnd = new Random();

        // Add all of the potential answers to the array
        String [] answers = {"It is certain",
                              "It is decidedly so",
                              "Without a doubt",
                              "Yes definitely",
                              "You may rely on it",
                              "As I see it, yes",
                              "Most likely",
                              "Outlook good",
                              "Yes",
                              "Signs point to yes",
                              "Reply hazy try again",
                              "Ask again later",
                              "Better not tell you now",
                              "Cannot predict now",
                              "Concentrate and ask again",
                              "Don't count on it",
                              "My reply is no",
                              "My sources say no",
                              "Outlook not so good",
                              " Very doubtful"
                        };
        // Initialize the variables
        boolean moreQuestions = true;
        String question = "";
        String answer = "";
        String reply = "";

        // Keep asking the user questions until the user enters "n" or "N"
        while (moreQuestions) {
            System.out.print("Enter your question: ");
            question = in.nextLine();
            answer = answers[rnd.nextInt(21)];
            System.out.println("YOU ASKED: " + question);
            System.out.println("MAGIC 8-BALL SAYS: " + answer);
            System.out.print("Do you have another question for the Magic 8-Ball? (y/n) ");
            reply = in.nextLine();
            if (reply.equals("n") || reply.equals ("N")) moreQuestions = false;
        }

        // Close out the scanner to release resources
        in.close();
    }

}
