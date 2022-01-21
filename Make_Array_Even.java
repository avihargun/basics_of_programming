/*
Problem:https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/make-even-8ced0d4b/
You are given an array A of N integers. If you make the array whole using the following operation, then what is the minimum number of operations required to make the entire array even?

Note: It can be proved that this is always possible.

Operation

Select an index    and perform operation:

P=Ai+Ai+1; Q=Ai-Ai+1;

Ai=P; Ai+1=Q;

Input format

The first line contains an integer T denoting the number of the test cases.
In each test case:
The first line contains an integer N denoting the number of elements in the array.
The second line contains N space-separated integers of array A.
Output format

For each test case print a single line denoting the minimum number of operations required to make the whole array even.
*/
import java.util.Scanner;

public class Make_Array_Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test>0)
        {
            
            int n=sc.nextInt();
            long[] a=new long[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextLong();
            }
            long count=0;
            int i=0;
            while(i<n)
            {   
                if((a[i]%2!=0) & (a[i+1]%2!=0))
                {
                    count++;
                    i=i+2;
                }
                else if((a[i]%2!=0) & (a[i+1]%2==0))
                {
                    count=count+2;
                    i=i+1;
                }
                else
                {
                    i++;
                }

            }
            System.out.println(count);
            test--;
            
        }

    }
    
}
