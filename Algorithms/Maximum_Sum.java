//Problem: https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/maximum-sum-4-f8d12458/
import java.util.Scanner;

public class Maximum_Sum {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(), elements = 0;
        long sum = 0, highestNumber = Long.MIN_VALUE;
        int[] input = new int[n];

        for(int i=0;i<n;i++)
        {
            input[i]=sc.nextInt();
        }

        for (int no : input) {
            if (no > highestNumber)
            {
                highestNumber = no;

            }
               
            if (no < 0)
                continue;

            sum += no;
            elements++;
        }

        if (sum == 0) {
            sum = highestNumber;
            elements = 1;
        }

        System.out.println(sum + " " + elements);
    }

}
