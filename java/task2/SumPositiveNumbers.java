import java.util.Scanner;

public class SumPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int number;

        do {
            System.out.print("Enter a positive number (or a negative number to stop): ");
            number = scanner.nextInt();

            if (number >= 0) {
                sum += number;
            } else {
                System.out.println("Negative number entered. Stopping...");
            }

        } while (number >= 0);

        System.out.println("The total sum of positive numbers is: " + sum);

        scanner.close();
    }
}
