public class SumOfSquares {
    public static void main(String[] args) {
        int sum = 0; // untuk menyimpan jumlah kuadrat

        for (int n = 1; n <= 5; n++) {
            sum = 0; // reset untuk setiap nilai n
            System.out.print("n = " + n + " => sum of squares = ");
            
            for (int i = 1; i <= n; i++) {
                sum += i * i;
                System.out.print(i * i);
                if (i < n) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + sum);
        }
    }
}

