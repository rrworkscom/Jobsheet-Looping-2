import java.util.Scanner;

public class NestedLoop20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] temps = new double[5][7]; 

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Day " + (j + 1) + " = ");
                temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        int cityIndex = 0;
        for (double[] city : temps) {
            System.out.println("City: " + cityIndex);

            double sum = 0; 
            for (double temp : city) {
                System.out.print(temp + " ");
                sum += temp; 

            double average = sum / city.length;

            System.out.println("\nAverage temperature: " + average);
            System.out.println();

            cityIndex++;
        }

        sc.close();
    }
}
}