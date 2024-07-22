import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create some questions
        Question q1 = new Question("What is the capital of France?",
                Arrays.asList("Paris", "London", "Berlin", "Madrid"), "Paris");
        Question q2 = new Question("What is 2 + 2?", Arrays.asList("3", "4", "5", "6"), "4");
        Question q3 = new Question("What is the color of the sky?", Arrays.asList("Blue", "Green", "Red", "Yellow"),
                "Blue");
        Question q4 = new Question("What is the capital of New Zealand?",
                Arrays.asList("Wellington", "New Delhi", "Bangkok,", "Madrid"), "Wellington");
        // Create a quiz
        Quiz quiz = new Quiz();
        quiz.addQuestion(q1);
        quiz.addQuestion(q2);
        quiz.addQuestion(q3);
        quiz.addQuestion(q4);

        // Start the quiz
        quiz.start();
    }
}
