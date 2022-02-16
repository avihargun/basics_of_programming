import java.util.Scanner;

public class StackandQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();

        long[] arr = new long[n];
        long sum = 0, sumK = 0;

        for(int i = 0; i < n; i++){
            long ele = sc.nextLong();
            arr[i] = ele;
            if(i >= n-k) sumK += arr[i];
        }

        long max = Integer.MIN_VALUE;
        for(int i = 0; i < k; i++){
            sum += arr[i];
            sumK -= arr[n-k+i];
            max = Math.max(max,sum+sumK);
        }
        System.out.println(max);
        sc.close();
    }
    
}
