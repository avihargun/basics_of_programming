import java.util.Scanner;

public class Monk_Encounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test =sc.nextInt();
        while(test-->0)
        {
            long a,b,c,k;
            a=sc.nextLong();
            b=sc.nextLong();
            c=sc.nextLong();
            k=sc.nextLong();

            long low=0,high=100000,mid;
            while(high-low>1)
            {
                mid=(high+low)/2;

                if(a*mid*mid+b*mid+c>=k)
                {
                    high=mid;

                }
                 else
                {
                    low=mid+1;

                }
            }

            if(a*low*low+b*low+c>=k)
             {   
                System.out.println(low);

             }

            else
            {
                System.out.println(high);

            }

            }
        }


}
