import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
        this.questions = new ArrayList<>();
        this.score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question.getText());
            List<String> options = question.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }
            int answer = getUserInput(scanner, options.size());
            if (question.isCorrect(options.get(answer - 1))) {
                score++;
            }
        }
        displayScore();
    }

    private int getUserInput(Scanner scanner, int numOptions) {
        while (true) {
            try {
                System.out.print("Enter the number of your answer: ");
                int answer = Integer.parseInt(scanner.nextLine());
                if (answer >= 1 && answer <= numOptions) {
                    return answer;
                } else {
                    System.out.println("Please enter a number between 1 and " + numOptions + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    private void displayScore() {
        System.out.println("Your score is " + score + " out of " + questions.size() + ".");
    }
}
