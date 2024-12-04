import java.util.HashMap;
import java.util.Map;

public class Program4 {
    public static void main(String[] args) {
        int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        Map<Integer, Integer> multiplesCount = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            multiplesCount.put(i, 0);
        }
        for (int num : input) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    multiplesCount.put(i, multiplesCount.get(i) + 1);
                }
            }
        }

        System.out.println(multiplesCount);
    }
}
