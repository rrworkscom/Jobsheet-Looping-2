import java.util.Scanner;

public class NumericTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N (minimum 3): ");
        int N = sc.nextInt();

        if (N < 3) {
            System.out.println("N must be at least 3!");
        } else {
            for (int i = 1; i <= N; i++) {
                for (int s = i; s < N; s++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
