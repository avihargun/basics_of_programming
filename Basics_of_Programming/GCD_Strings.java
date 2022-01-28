/*
Problem:https://www.hackerearth.com/practice/basic-programming/recursion/recursion-and-backtracking/practice-problems/algorithm/gcd-strings/

*/
import java.util.Scanner;

public class GCD_Strings {
  
    public static String find_gcd(long x,long y)
    {
        String ans="";
        if(x%y==0)
        {
            ans=ans + "1";
            for(int i=0;i<x-1;i++)
            {
                ans=ans+"0";
            }
            return ans;
        }
        String s=find_gcd(y,x%y);
        for(int i=0;i<x;i++)
        {
            ans=ans+s.charAt(i%s.length());
        }
        return ans;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0)
        {
            long x=sc.nextLong();
            long y=sc.nextLong();

            if(x<y)
            {
                return;
            }
            String result=find_gcd(x,y);
            long r=0;
            for(int i=0; i<result.length(); i++)
            {
                r = (r*2+(result.charAt(i)-'0')) % (1000000000+7);
            }

            System.out.println(r);
        }
    }
    
}
