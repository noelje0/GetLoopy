// java
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        boolean playAgain;

        do {
            int roll = 1;

            System.out.printf("%5s\t%8s\t%8s\t%8s\t%6s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            while (true) {
                int d1 = rnd.nextInt(6) + 1;
                int d2 = rnd.nextInt(6) + 1;
                int d3 = rnd.nextInt(6) + 1;
                int sum = d1 + d2 + d3;

                System.out.printf("%5d\t%8d\t%8d\t%8d\t%6d%n", roll, d1, d2, d3, sum);

                if (d1 == d2 && d2 == d3) {
                    System.out.println("You win!");
                    break;
                }
                roll++;
            }

            System.out.print("Play again? (y/n): ");
            String response = scanner.nextLine().trim().toLowerCase();
            playAgain = response.startsWith("y");
            System.out.println();
        } while (playAgain);

        scanner.close();
    }
}
