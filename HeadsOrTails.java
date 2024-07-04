import java.util.Random;

public class HeadsOrTails {

    public static void main(String[] args) {
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
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
    }
}