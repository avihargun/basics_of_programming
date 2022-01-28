/*
Problem:https://www.hackerearth.com/practice/basic-programming/recursion/recursion-and-backtracking/practice-problems/algorithm/jumpingjack-488ce744/
Consider an array A of size N. You start from the index 0 and your goal is to reach index  in exactly M moves.

At any index, you can move forward or backward by a number of steps that is equal to a prime divisor of the value which exists at that index. You cannot go beyond the array while going forward or backward.

Write a program to determine whether it is possible to reach index  in M moves.

Input format

First line: T (number of test cases)
First line in each test case: N
Second line in each test case: N space-separated integers (denoting the array A)
Third line in each test case: M
Output format

For each test case, print YES or NO depending upon the result.
*/
import java.util.Scanner;

public class Movement_Array {

    static int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37 };
    static boolean solve(long a[], int start, long moves, long target) {
        if (moves == 0 && start == target) {
            return true;
        } 
        else if (moves == 0 && start != target) {
            return false;
        }
        if (start < 0 || start > target) {
            return false;
        }
         else {

            for (int i = 0; i < 12; i++)
             {
                if (a[start] % primes[i] == 0) 
                {
                    return (solve(a, start + primes[i], moves - 1, target)|| solve(a, start - primes[i], moves - 1, target));
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long test=sc.nextLong();
        while(test-->0)
        {
            int n=sc.nextInt();
            long[] a=new long[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextLong();
            }
            long m=sc.nextLong();
            if (solve(a, 0, m, n - 1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }
}
