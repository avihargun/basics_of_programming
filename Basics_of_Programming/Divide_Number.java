/*
Problem:https://www.hackerearth.com/practice/basic-programming/recursion/recursion-and-backtracking/practice-problems/algorithm/divide-number-a410603f/

*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Divide_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            long n = sc.nextLong();
            long ans = -1;
            long[] fact = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 18, 20, 24, 42 };
            List<Long> factors=new ArrayList<>();
            if (n % 2 != 0) {
                System.out.println(ans);
                continue;
            }
            for (int i = 0; i < 15; i++)
            {
                if (n % fact[i] == 0)
                {
                    
                    factors.add(n/fact[i]);

                }
            }
            for(int a=0;a<factors.size();a++)
            {
                for(int b=0;b<factors.size();b++)
                {
                    for(int c=0;c<factors.size();c++)
                    {
                        for(int d=0;d<factors.size();d++)
                        {
                            if((factors.get(a)+factors.get(b)+factors.get(c)+factors.get(d))==n)
                            {
                                if((factors.get(a)*factors.get(b)*factors.get(c)*factors.get(d))>ans)
                                {
                                    ans=factors.get(a)*factors.get(b)*factors.get(c)*factors.get(d);
                                    
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(ans);
        }

    }
}