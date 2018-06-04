import java.util.Scanner;

public class Magic8BallClient {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);


        // Initialize the variables
        boolean moreQuestions = true;
        String [] answers = Magic8Ball.getAnswers();
        Answerable ans = new Magic8Ball ();
        Magic8Ball current8Ball = (Magic8Ball)ans;

        // Use the magic8Ball
        current8Ball.shake8Ball (in, answers, moreQuestions);
    }
}