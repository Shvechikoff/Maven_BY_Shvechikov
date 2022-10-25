package HW21;

import java.util.Scanner;

public class Math implements Question {

    Scanner scanner = new Scanner(System.in);
    int result = 0;
    int counter = 0;

    @Override
    public void test() {

        System.out.println("Question 1. 2+2 = :");
        System.out.println("Answers:" + "\n" +
                "1. 2;" + "\n"
                + "2. 4;" + "\n"
                + "3. 6;");
        result = scanner.nextInt();
        if (result == 2) {
            counter++;
        }
        System.out.println("Question 2. 2*3 = :");
        System.out.println("Answers:" + "\n" +
                "1. 2;" + "\n"
                + "2. 4;" + "\n"
                + "3. 6;");
        result = scanner.nextInt();
        if (result == 3) {
            counter++;
        }
        System.out.println("Question 3. 8/4 = :");
        System.out.println("Answers:" + "\n" +
                "1. 2;" + "\n"
                + "2. 4;" + "\n"
                + "3. 6;");
        result = scanner.nextInt();
        if (result == 1) {
            counter++;
        }
        System.out.println("You have " + counter + " right answers!");
    }
}