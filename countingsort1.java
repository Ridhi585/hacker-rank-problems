import java.io.*;
import java.util.*;
class Result {
    public static List<Integer> countingSort(List<Integer> arr) {
        int[] freq = new int[100];   // frequency array of size 100
        for (int num : arr) {
            freq[num]++;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            result.add(freq[i]);
        }
        return result;
    }
}
public class countingsort1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        // Take array size as input
        int n = sc.nextInt();
        // Read array elements
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        // Call counting sort
        List<Integer> result = Result.countingSort(arr);
        // Print frequency array
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
        sc.close();
    }
}

