import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer value (a): ");
        int a = sc.nextInt();

        System.out.print("Output: ");
        for (int i = 1; i <= a; i++) {
            System.out.print(2 * i - 1); // Formula for the i-th odd number
            if (i < a) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}