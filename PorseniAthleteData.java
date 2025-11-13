import java.util.*;

public class PorseniAthleteData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sports = {"Badminton", "Table Tennis", "Basketball", "Volleyball"};

        System.out.println("=== PORSENI 2024 Athlete Data ===");

        for (String sport : sports) {
            String[] names = new String[5];
            System.out.println("Enter 5 athlete names for " + sport + ":");

            for (int i = 0; i < 5; i++) {
                System.out.print("Athlete " + (i + 1) + ": ");
                names[i] = sc.nextLine();
            }

            Arrays.sort(names);
            
            System.out.println("\n" + sport + " Athletes (Sorted):");
            for (String name : names) {
                System.out.println(" - " + name);
            }
        }
    }
}
