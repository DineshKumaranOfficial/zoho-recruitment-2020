import java.util.Scanner;

class NumericPattern {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nInput:");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + (n - j) + " ");
            }
            for (int k = i + 1; k < n; k++) {
                System.out.print(" " + (n - i) + " ");
            }
            System.out.println();
        }
    }
}