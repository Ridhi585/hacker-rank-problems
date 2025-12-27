import java.util.*;
    public class missingnumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // Input size of first array and elements
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            // Input size of second array and elements
            int m = sc.nextInt();
            int[] brr = new int[m];
            for(int i = 0; i < m; i++){
                brr[i] = sc.nextInt();
            }// Frequency maps
            Map<Integer, Integer> count1 = new HashMap<>();
            Map<Integer, Integer> count2 = new HashMap<>();
            for(int num : arr){
                count1.put(num, count1.getOrDefault(num, 0) + 1);
            }
            for(int num : brr){
                count2.put(num, count2.getOrDefault(num, 0) + 1);
            }// Find missing numbers
            List<Integer> missing = new ArrayList<>();
            for(int num : count2.keySet()){
                if(count2.get(num) > count1.getOrDefault(num, 0)){
                    missing.add(num);
                }
            }
            Collections.sort(missing); // Output result
            for(int num : missing){
                System.out.print(num + " ");
            }
            sc.close();
        }
    }

