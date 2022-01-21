/*
Problem:https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/simon-cant-sleep-3beb3241/

*/
import java.util.Scanner;

public class simon_cannot_sleep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        sc.close();
        int hour=Integer.parseInt(input.substring(0, 2));
        int min=Integer.parseInt(input.substring(3,5));
        int total_min=(hour*60)+ min;
        double output=(total_min*11)/720 +1;
        System.out.println((int)output);
    }
    
}
