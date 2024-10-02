import java.util.Scanner;

class Question {
    String questionText;
    String[] options;
    int correctAnswerIndex;

    public Question(String questionText, String[] options, int correctAnswerIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public boolean isCorrect(int answerIndex) {
        return answerIndex == correctAnswerIndex;
    }
}

class Quiz {
    private Question[] questions;
    private int score;

    public Quiz() {
        questions = new Question[]{
                new Question("Which Country's Capital is Ottawa?", new String[]{"Germany", "Romania", "Canada", "Norway"}, 2),
                new Question("Who invented the Human Evolution Theory?", new String[]{"Louis Pastuer", "Charles Darwin", "Henry Rutherford", "Marie Curie"}, 1),
                new Question("Country with the most Olympic medals is?", new String[]{"USA", "U.K", "China", "Australia"}, 0),
                new Question("Who is known as the Father of Mathematics", new String[]{"Archimedes","Socrates", "Carl Linnaeus", "Aristotle"},0),
                new Question("Which country has the highest Life-Expectancy", new String[]{"Luxemburg","Japan", "Thailand", "Hong Kong"},3)
    };
    score = 0;
}

public void start() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to the Quiz App!");
    System.out.println();
    System.out.println("Enter Your Name:");
    String name = sc.nextLine();

    for (Question question : questions) {
        System.out.println(question.questionText);
        for (int j = 0; j < question.options.length; j++) {
            System.out.println((j + 1) + ": " + question.options[j]);
        }

        System.out.print("Your answer (1-" + question.options.length + "): ");
        int answerIndex = sc.nextInt() - 1; // Convert to zero-based index

        if (question.isCorrect(answerIndex)) {
            score++;
            System.out.println("Correct!\n");
        } else {
            System.out.println("Incorrect. The correct answer was: " + question.options[question.correctAnswerIndex] + "\n");
        }
    }

    displayResults(name);
}

private void displayResults(String name) {
    System.out.println(name +", You have completed the Quiz !");
    System.out.println("Your total score: " + score + "/" + questions.length);
}
}

public class Quiz_App {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.start();
    }
}