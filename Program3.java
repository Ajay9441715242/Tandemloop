import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer value (a): ");
        int a = sc.nextInt();

        System.out.print("Output: ");
        int limit = (a % 2 == 0) ? a - 1 : a; // Adjust limit to the largest odd number <= a
        for (int i = 1; i <= limit; i += 2) { // Generate odd numbers
            System.out.print(i);
            if (i + 2 <= limit) {
                System.out.print(", ");
            }
        }

       sc.close();
    }
}