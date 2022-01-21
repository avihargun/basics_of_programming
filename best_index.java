/*Problem:https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/best-index-1-45a2f8ff/
You are given an array  of  elements. Now you need to choose the best index of this array . An index of the array is called best if the special sum of this index is maximum across the special sum of all the other indices.

To calculate the special sum for any index  , you pick the first element that is  and add it to your sum. Now you pick next two elements i.e.  and  and add both of them to your sum. Now you will pick the next  elements and this continues till the index for which it is possible to pick the elements. For example:

If our array contains  elements and you choose index to be  then your special sum is denoted by -
 , beyond this its not possible to add further elements as the index value will cross the value .

Find the best index and in the output print its corresponding special sum. Note that there may be more than one best indices but you need to only print the maximum special sum.

Input
First line contains an integer  as input. Next line contains  space separated integers denoting the elements of the array .
Output
In the output you have to print an integer that denotes the maximum special sum*/
import java.util.Scanner;

public class best_index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        long[] input=new long[n+1];
        for(int i=1;i<=n;i++)
        {
            input[i]=sc.nextLong();
            input[i]=input[i-1]+input[i];

        }
        // int max=input[0];
        // for(int i=1;i<=n;i++)
        // {
        //     int sum=0;
        //     int count=1;
        //     int j=i;
        //     while(j+count-1<=n)
        //     {
        //         int temp=count;
        //         while(temp!=0)
        //         {
        //             sum=sum+input[j];
        //             j++;
        //             temp--;
        //         }
        //         count++;
                
        //     }
        //     if(max<sum)
        //     {
        //         max=sum;
        //     }
            

        // }
        long max=Long.MIN_VALUE;
        for(int i=1;i<=n;i++)
        {
            long sum=0;
            int count=1;
            int j=i;
            while(j+count<n)
            {
                count++;
                j=j+count;
                
            }
            sum=input[j]-input[i-1];
            if(max<sum)
            {
                max=sum;
            }
            

        }
        System.out.println(max);
    }
    
}
