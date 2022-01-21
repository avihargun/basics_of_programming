/*Problem:https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/is-zoo-f6f309e7/
You are required to enter a word that consists of  and  that denote the number of Zs and Os respectively. The input word is considered similar to word zoo if .

Determine if the entered word is similar to word zoo.

For example, words such as zzoooo and zzzoooooo are similar to word zoo but not the words such as zzooo and zzzooooo.

Input format

First line: A word that starts with several Zs and continues by several Os.
Note: The maximum length of this word must be .
Output format

Print Yes if the input word can be considered as the string zoo otherwise, print No.*/
import java.util.Scanner;

public class zoo {

    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        if(input.charAt(0)!='z')
        {
            System.out.println("No");
            sc.close();
            return;
        }
        sc.close();
        int countz=0;
        int counto=0;
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)=='z')
            {
                countz++;
            }
            else
            {
                counto++;
            }
        }
        if(counto==(countz*2))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
    
}
