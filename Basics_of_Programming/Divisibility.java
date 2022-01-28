/*Problem:https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/divisible-or-not-81b86ad7/
You are provided an array  of size  that contains non-negative integers. Your task is to determine whether the number that is formed by selecting the last digit of all the N numbers is divisible by .

Note: View the sample explanation section for more clarification.

Input format

First line: A single integer  denoting the size of array 
Second line:  space-separated integers.
Output format

If the number is divisible by , then print . Otherwise, print .*/
import java.util.Scanner;

public class Divisibility {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = 0;
        N = s.nextInt();
        
        int[] data = new int[N];
        for(int i=0; i<N; i++){
            data[i] = s.nextInt();
        }

        
        // // Write your code here
        // // ans = 
        // int ans=0;
        // for(int i=0;i<N;i++)
        // {
        //     ans= (ans *10) + (data[i]%10);
        // }
        if((data[N-1]%10)==0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
        
      
    }
    
}
