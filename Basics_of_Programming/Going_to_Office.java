//Problem:https://www.hackerearth.com/practice/basic-programming/operators/basics-of-operators/practice-problems/algorithm/going-to-office-e2ef3feb/
import java.util.Scanner;

public class Going_to_Office {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long distance=sc.nextLong();
        long[] online=new long[3];
        long[] classic=new long[4];

        for(int i=0;i<3;i++)
        {
            online[i]=sc.nextLong();
        }
        for(int i=0;i<4;i++)
        {
            classic[i]=sc.nextLong();
        }
        sc.close();
        long online_fair= online[0]+((distance-online[1])*online[2]);
        long classic_fair= classic[1]+(classic[2]*((long)Math.floor(distance/classic[0])))+(distance*classic[3]);

        if(online_fair<=classic_fair)
        {
            System.out.println("Online Taxi");
        }
        else
        {
            System.out.println("Classic Taxi");
        }

    }
    
}
