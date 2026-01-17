import java.io.*;
import java.util.*;
public class leftrotation {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();  // size of array
            int d = sc.nextInt();  // number of rotations
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            d = d % n; // handle rotations greater than array size
            int[] rotated = new int[n];
            for (int i = 0; i < n; i++) {
                rotated[i] = arr[(i + d) % n];
            }
            for (int i = 0; i < n; i++) {
                System.out.print(rotated[i] + " ");
            }
            sc.close();
        }
    }

