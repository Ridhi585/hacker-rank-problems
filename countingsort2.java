import java.util.*;
public class countingsort2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read size of array
        int n = sc.nextInt();
        // Frequency array (values range 0 to 99)
        int[] freq = new int[100];
        // Read elements and count
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            freq[val]++;
        }
        // Print sorted array
        for (int i = 0; i < 100; i++) {
            while (freq[i] > 0) {
                System.out.print(i + " ");
                freq[i]--;
            }
        }
        sc.close();
    }
}

