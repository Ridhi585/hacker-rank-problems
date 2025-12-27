import java.util.*;
public class sherlockandarray {
    public static String balancedSums(List<Integer> arr) {
        int totalSum = 0;
        for(int num : arr)
            totalSum += num;
        int leftSum = 0;
        for(int num : arr){
            int rightSum = totalSum - leftSum - num;
            if(leftSum == rightSum){
                return "YES";
            }
            leftSum += num;
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while(t-- > 0){
            int n = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            for(int i = 0; i < n; i++){
                arr.add(sc.nextInt());
            }
            System.out.println(balancedSums(arr));
        }
        sc.close();
    }
}

