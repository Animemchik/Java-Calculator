package me.Animemchik.Calculator;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        boolean run = true;
        System.out.print("Hello!");
        Scanner scanner = new Scanner(System.in);
        while (run) {
            System.out.print("\nChoose the operation:\n1) +\n2) -\n3) *\n4) /\n5) ^\n0) Exit\nOperation: ");
            int op = scanner.nextInt();
            System.out.println();
            switch (op) {
                case 1 -> {
                    int[] numbers = getNumbers(scanner);
                    System.out.printf("%d + %d = %d\n", numbers[0], numbers[1], numbers[0] + numbers[1]);
                }
                case 2 -> {
                    int[] numbers = getNumbers(scanner);
                    System.out.printf("%d - %d = %d\n", numbers[0], numbers[1], numbers[0] - numbers[1]);
                }
                case 3 -> {
                    int[] numbers = getNumbers(scanner);
                    System.out.printf("%d * %d = %d\n", numbers[0], numbers[1], numbers[0] * numbers[1]);
                }
                case 4 -> {
                    int[] numbers = getNumbers(scanner);
                    System.out.printf("%d / %d = %d\n", numbers[0], numbers[1], numbers[0] / numbers[1]);
                }
                case 5 -> {
                    int[] numbers = getNumbers(scanner);
                    System.out.printf("%d ^ %d = %f\n", numbers[0], numbers[1], Math.pow(numbers[0], numbers[1]));
                }
                case 0 -> {
                    System.out.println("Bye!");
                    run = false;
                }
                default -> System.out.println("Unexpected value: " + op);
            }
        }
    }

    private static int[] getNumbers(Scanner scanner) {
        System.out.print("First number: ");
        int a = scanner.nextInt();
        System.out.print("\nSecond number: ");
        int b = scanner.nextInt();
        return new int[] {a, b};
    }
}