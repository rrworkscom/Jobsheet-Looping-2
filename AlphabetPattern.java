public class AlphabetPattern {
    public static void main(String[] args) {
        char letter = 'a';
        int count = 1;
        int totalLines = 5; 

        while (letter <= 'y' && count <= totalLines) {
            for (int space = totalLines - count; space > 0; space--) {
                System.out.print(" ");
            }

            for (int i = 0; i < count * 2 - 1 && letter <= 'y'; i++) {
                System.out.print(letter);
                letter++;
            }

            System.out.println(); 
            count++;
        }
    }
}
