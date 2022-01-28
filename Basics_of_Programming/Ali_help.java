//problem:https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/cartag-948c2b02/
/*Problem
Arpasland has surrounded by attackers. A truck enters the city. The driver claims the load is food and medicine from Iranians. Ali is one of the soldiers in Arpasland. He doubts about the truck, maybe it's from the siege. He knows that a tag is valid if the sum of every two consecutive digits of it is even and its letter is not a vowel. Determine if the tag of the truck is valid or not.

We consider the letters "A","E","I","O","U","Y" to be vowels for this problem.

Input Format

The first line contains a string of length 9. The format is "DDXDDD-DD", where D stands for a digit (non zero) and X is an uppercase english letter.

Output Format

Print "valid" (without quotes) if the tag is valid, print "invalid" otherwise (without quotes)*/
import java.util.Scanner;



public class Ali_help
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input=sc.next();
        sc.close();
        
        if(input.charAt(2)=='A'|| input.charAt(2)=='E'|| input.charAt(2)=='I'|| input.charAt(2)=='O'|| input.charAt(2)=='U'|| input.charAt(2)=='Y')
        {
            System.out.println("invalid");
            return;
        }
        else if((Character.getNumericValue(input.charAt(0)) + Character.getNumericValue(input.charAt(1)))  % 2 == 0 &&  (Character.getNumericValue(input.charAt(3)) + Character.getNumericValue(input.charAt(4))) % 2 == 0 
                && (Character.getNumericValue(input.charAt(4)) + Character.getNumericValue(input.charAt(5))) % 2 == 0 && (Character.getNumericValue(input.charAt(7)) + Character.getNumericValue(input.charAt(8)))  % 2 == 0 )
        {
            System.out.println("valid");
            return;
        }
        else
        {
            System.out.println("invalid");
            return;
        }
        
    }
}