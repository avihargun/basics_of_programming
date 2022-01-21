/*
Problem:https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/debts-429c5441/
There are  people living in a neighborhood. When in debt, neighbors borrow money from each other to clear their debts. A neighbor has already borrowed money from another neighbor for  times to clear a debt. 

All the neighbors want to clear what they owe each other. Their plan is to clear their debts in such a way that the total number of transactions is minimized because the fee per transaction is very high. For example, if the  person pays the  person  dollars, then the amount of this particular transaction is . 

You are required to minimize the sum of the transaction amount.

Input format

First line: Two integers  and 
Next  lines: Three integers , , and  which means that the  person has lent the  person  amount of dollars
Output format

Print only one integer that represents the minimum sum of the transaction amount.
*/
import java.util.Scanner;

public class min_transaction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no_of_people=sc.nextInt();
        int no_of_debt=sc.nextInt();
        long[] trasaction=new long[no_of_people+1];
        for(int i=1;i<=no_of_debt;i++)
        {
            int v=sc.nextInt();
            int u=sc.nextInt();
            long w=sc.nextLong();

            trasaction[v] += w;
            trasaction[u] -=w;


        }
        long ans=0;
        for(int i=1;i<no_of_people+1;i++)
        {
            if(trasaction[i]>0)
            {
                ans=ans+trasaction[i];
            }
        }
        System.out.println(ans);
    }
    
}
