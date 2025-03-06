package app;

import java.util.Scanner;

public class Main {
    private static final double MILES_TO_KM = 1.60934;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Проста консольна програма для конвертації миль у кілометри та навпаки");

        System.out.print("Введіть значення в милях: ");
        double miles = scanner.nextDouble();
        System.out.printf("%.2f миль = %.2f км\n", miles, miles * MILES_TO_KM);

        scanner.close();
    }
}
