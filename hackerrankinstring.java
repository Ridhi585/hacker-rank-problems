import java.util.*;
public class hackerrankinstring {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        sc.nextLine(); // consume newline
        String target = "hackerrank";
        while (q-- > 0) {
            String s = sc.nextLine();
            int j = 0;
            for (char ch : s.toCharArray()) {
                if (j < target.length() && ch == target.charAt(j)) {
                    j++;
                }
            }
            if (j == target.length()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
