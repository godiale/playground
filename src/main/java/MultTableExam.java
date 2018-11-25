package main.java;

import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;

public class MultTableExam {

    private enum ExamType {
        MULTIPLY,
        DIVIDE
    }

    private static final int PROBLEMS_NUM = 30;
    private static final ExamType examType = ExamType.MULTIPLY;

    public static void main(String[] args) {
        final Random randomGenerator = new Random();
        final Scanner scanner = new Scanner(System.in);
        final long startTime = System.currentTimeMillis();
        final String className = "main.resources." + MultTableExam.class.getSimpleName();
        final ResourceBundle rb = ResourceBundle.getBundle(className);
        int correctAnswersCnt = 0;

        for (int problemID = 1; problemID <= PROBLEMS_NUM; ++problemID) {
            final int n1 = randomGenerator.nextInt(9) + 1;
            final int n2 = randomGenerator.nextInt(9) + 1;

            int correctAnswer;
            String entry;

            if (examType == ExamType.MULTIPLY) {
                entry = String.format("%s: %s * %s = ", problemID, n1, n2);
                correctAnswer = n1 * n2;
            } else { // ExamType.DIVIDE
                entry = String.format("%s: %s / %s = ", problemID, n1 * n2, n1);
                correctAnswer = n2;
            }

            int answer = -1;
            while (answer < 0) {
                System.out.print(entry);
                final String input = scanner.nextLine();
                try {
                    answer = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println(String.format(rb.getString("invalidFormat"), input));
                }
            }
            if (answer == correctAnswer) {
                System.out.println(rb.getString("Correct"));
                ++correctAnswersCnt;
            } else {
                System.out.println(String.format(rb.getString("Wrong"), correctAnswer));
            }
        }
        final int elapsedTime = (int)((System.currentTimeMillis() - startTime) / 1000.0);
        System.out.println(String.format(rb.getString("Result"), correctAnswersCnt, PROBLEMS_NUM, elapsedTime));
    }
}
