package HW21;

import java.util.Scanner;

public class HW21Main {
    public static void main(String[] args) {

        Question math = new Math();
        Question biology = new Biology();
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        System.out.println("Choose test:");
        System.out.println("1. Math test;" + "\n" + "2. Biology test;");
        result = scanner.nextInt();
        if (result == 1) {
            math.test();
        }
        if (result == 2) {
            biology.test();
        }
    }
}
