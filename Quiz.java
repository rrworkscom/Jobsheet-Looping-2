import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        char menu = 'Y';
        do {
            int number = rand.nextInt(10) + 1; // random number 1–10
            boolean success = false;

            do {
                System.out.print("Guess the number (1-10): ");
                int answer = input.nextInt();
                input.nextLine();

                if (answer == number) {
                    System.out.println("Correct! The number is " + number + ".");
                    success = true;
                } else if (answer < number) {
                    System.out.println("Too low! Try a higher number.");
                } else { 
                    System.out.println("Too high! Try a smaller number.");
                }

            } while (!success);

            System.out.print("Do you want to repeat the game (Y/N)? ");
            menu = input.next().charAt(0);
            input.nextLine(); 

        } while (menu == 'Y' || menu == 'y');
    }
}
