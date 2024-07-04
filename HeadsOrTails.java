import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Who are you? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        
        Random random = new Random();
        System.out.println("Tossing a coin...");
        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 1; i <= 3; i++) {
            if (random.nextBoolean()) {
                System.out.println("Round " + i + ": Heads");
                headsCount++;
            } else {
                System.out.println("Round " + i + ": Tails");
                tailsCount++;
            }
        }

        System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);
        if (headsCount > tailsCount) {
            System.out.println(userName + " won!");
        } else {
            System.out.println(userName + " lost!");
        }
    }
}