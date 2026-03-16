import java.util.Scanner;

public class Subarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        // check the subarrays negative
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += A[j];
                if (sum < 0) count++;
            }
        }
        System.out.println(count);
}
}

