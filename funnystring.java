import java.util.*;
public class funnystring {
    public static String funnyString(String s) {
        int n = s.length();
        for (int i = 1; i < n; i++) {
            int diff1 = Math.abs(s.charAt(i) - s.charAt(i - 1));
            int diff2 = Math.abs(s.charAt(n - i) - s.charAt(n - i - 1));
            if (diff1 != diff2) {
                return "Not Funny";
            }
        }
        return "Funny";
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String s = sc.nextLine();
            System.out.println(funnyString(s));
        }
    }
}
