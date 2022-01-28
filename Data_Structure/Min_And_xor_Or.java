//Problem:https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/minimum-and-xor-or-6a05bbd4/
import java.util.Arrays;
import java.util.Scanner;

public class Min_And_xor_Or {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();

        while(test-->0)
        {
            int n=sc.nextInt();
            int[] input=new int[n];
            for(int i=0;i<n;i++)
            {
                input[i]=sc.nextInt();

            }
            Arrays.sort(input);
            int min=Integer.MAX_VALUE;
            for(int i=1;i<n;i++)
            {
                    
                 int temp=((input[i]) ^ (input[i-1]));
                 if(temp<min)
                 {
                     min=temp;
                 }
                    
            }

            System.out.println(min);


        }
        sc.close();
        
    }
    
}
