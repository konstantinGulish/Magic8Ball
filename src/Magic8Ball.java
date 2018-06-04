import java.util.Scanner;
import java.util.Random;
public class Magic8Ball implements Answerable {

    //define constructor
    public Magic8Ball () {
    }

    //define static methods
    public static String[] getAnswers() {
        return new String[]{"It is certain",
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
    }

    //define instance methods
    @Override
    public String answer (String [] answers) {
        Random rnd = new Random ();
        return answers[rnd.nextInt(20)];
    }
    public void shake8Ball(Scanner in, String[] answers, boolean moreQuestions) {
        String question = "";
        String reply = "";
        while (moreQuestions) {
            System.out.print("Enter your question: ");
            question = in.nextLine();
            String answer = answer(answers);
            System.out.println("YOU ASKED: " + question);
            System.out.println("MAGIC 8-BALL SAYS: " + answer);
            System.out.print("Do you have another question for the Magic 8-Ball? (y/n) ");
            reply = in.next();
            if (reply.equals("n") || reply.equals ("N")) moreQuestions = false;
        }
    }
}
