/*
Problem:https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/sherlock-and-xor/
You are given an array A1,A2...AN. You have to tell how many pairs (i, j) exist such that 1 ≤ i < j ≤ N and Ai XOR Aj is odd.

Input and Output
First line T, the number of testcases. Each testcase: first line N, followed by N integers in next line. For each testcase, print the required answer in one line.
*/
import java.util.Scanner;

public class Sherlok_XOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            int n=sc.nextInt();                       
            long[] ary=new long[n];
            for(int i=0;i<n;i++)
            {
                ary[i]=sc.nextLong();
            }
            long count=0;
            for(int i=0;i<n;i++)
            {   
               if(ary[i]%2==0)
               {
                   count++;
               }
    
            }
            
            System.out.println(count*(n-count));
            test--;
        }
        sc.close();
    }
    
}
// odd ^ odd   =  even
// odd ^ even  =  odd
// even ^ odd  =  odd
// even ^ even =  even