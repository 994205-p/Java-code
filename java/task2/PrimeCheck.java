import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                System.out.println("Not Prime");
                break;  
            }
        }

        if (isPrime && number > 1) {
            System.out.println("Prime");
        } else if (number <= 1) {
            System.out.println("Not Prime");  
        }

        scanner.close();
    }
}
