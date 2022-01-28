//problem:https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/make-all-equal-90a21ab2/
import java.util.Scanner;

public class nosteps {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] in_a=new int[n];
        int[] in_b=new int[n];
        for(int i=0;i<n;i++)
        {
            in_a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            in_b[i]=sc.nextInt();
        }
        sc.close();
        int min=in_a[0];
        for(int i =0;i<n;i++)
        {
            if(min>in_a[i])
            {
                min=in_a[i];
            }
        }

        int index=0;
        for(int i=0;i<n;i++)
        {
            if(min==in_a[i])
                continue;

            while(in_a[i]!=min)
            {
                in_a[i]=in_a[i]-in_b[i];
                index++;
                if(in_a[i]<min)
                    {
                       min=in_a[i];
                       i=0;
                    }
                if(in_a[i]<0)
                {
                    System.out.println("-1");
                    return;
                }

            }
        }

        System.out.println(index);
    }
    
}
