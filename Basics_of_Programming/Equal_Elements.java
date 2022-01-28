/*
Problem:https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/equal-elements-2-db70c1ae/
You are given an integer array  consisting of  elements. You can perform the following operations on array :

Choose any element and increase or decrease it by 3 for 1 coin.
Choose any element and increase or decrease it by 2 for free.
You are required to spend the minimum number of coins in order to make all the elements in array  equal.

Input format

The first line contains an integer  denoting the number of test cases. 
The first line of each test case contains an integer  denoting the number of elements in array .
The second line of each test case contains  space-separated integers of array .
Output format

Print  lines. For each test case, print a single line denoting the minimum number of coins to make all elements equal.
*/
import java.util.Scanner;

public class Equal_Elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0)
        {
            int n=sc.nextInt();
            long[] numbers=new long[n];
            long odd=0,even=0;
            for(int i=0;i<n;i++)
            {
                numbers[i]=sc.nextLong();
            }
            for(int i=0;i<n;i++)
            {
                if(numbers[i]%2==0)
                {
                    even++;
    
                }
                else
                {
                    odd++;
                }
            }
            System.out.println(Math.min(even, odd));
        }

    }
    
}
