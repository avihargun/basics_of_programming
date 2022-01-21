/*
Problem:https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/recursive-function/
Implement the recursive function given by the following rules and print the last 3 digits:

F(x, y) = {
y + 1 when x = 0,
F(x - 1, 1) when x > 0 and y = 0,
F(x - 1, F(x, y - 1)) when x > 0 and y > 0
}

Input Format
A single line containing two integers X,Y
1 <= X,Y <= 100000

Output Format
The last three digits

Input Constraints
X and Y are non-negative integers. Problem Setter: Practo Tech Team
*/
import java.util.Scanner;


class Method{


    public int rec(int x,int y)
        {
            if(x==0)
            {
                return (y+1)%1000;
            }
            else if(x>0 && y==0)
            {
                return ((rec(x-1,1))%1000);
            }
            else if(x>0 && y>0)
            {
                return  rec(x-1,rec(x,y-1));
            }
            else
            {
                return 0;
            }
           
        }
}
public class recursiv {
    public static void main(String[] args) {

        
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    sc.close();
    Method m =new Method();
    long ans= m.rec(x, y);
    //ans=ans%1000;
    System.out.println( String.format("%03d" , ans));

        
    }

}
