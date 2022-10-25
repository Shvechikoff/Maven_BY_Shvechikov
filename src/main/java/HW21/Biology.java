package HW21;

import java.util.Scanner;

public class Biology implements Question {

    Scanner scanner = new Scanner(System.in);
    int result = 0;
    int counter = 0;

    @Override
    public void test() {

        System.out.println("Question 1. Who can fly?");
        System.out.println("Answers:" + "\n" +
                "1. Dog;" + "\n"
                + "2. Penguin;" + "\n"
                + "3. Eagle;");
        result = scanner.nextInt();
        if (result == 3) {
            counter++;
        }
        System.out.println("Question 2. Who have 4 paws?");
        System.out.println("Answers:" + "\n" +
                "1. Dog;" + "\n"
                + "2. Kangaroo;" + "\n"
                + "3. Ostrich;");
        result = scanner.nextInt();
        if (result == 1) {
            counter++;
        }
        System.out.println("Question 3. Who is fish ?");
        System.out.println("Answers:" + "\n" +
                "1. Dog;" + "\n"
                + "2. Karp;" + "\n"
                + "3. Eagle;");
        result = scanner.nextInt();
        if (result == 2) {
            counter++;
        }
        System.out.println("You have " + counter + " right answers!");
    }
}
