import java.util.Scanner;
import java.util.Random;

public class numberguesser {

    public static void main(String[] args) {

        int number = 1;
        int input = 0;
        int score = 0;

        if (args.length == 0) {
            number = 100;
        } else {
            number = Integer.parseInt(args[0]);
        }

        Random r = new Random();
        int target = r.nextInt((number - 1) + 1) + 1;
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.print("Enter a number between 1 and " + number + " (inclusive)\n: ");
            input = keyboard.nextInt();
            score++;
            if (input < target) {
                System.out.println("You need to guess higher");
            } else if (input > target) {
                System.out.println("You need to guess lower");
            }
        } while (input != target);
        System.out.printf("Correct the answer is: %d, you took %d attempt(s)\n", target, score);
        keyboard.close();
    }
}
