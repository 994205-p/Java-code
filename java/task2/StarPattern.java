import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = n - i; j > 0; j--) {
                System.out.print(" "); 
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");  
            }

            System.out.println();
        }

        scanner.close();
    }
}
