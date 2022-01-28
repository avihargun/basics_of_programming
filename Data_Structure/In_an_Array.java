import java.util.Scanner;

public class In_an_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int[] ary=new int[1001];
        for(int i=0;i<n;i++)
        {
            int ele=sc.nextInt();
            ary[ele]++;
        }
        long result=0;
        for(int i=1;i<1001;i++)
        {
            if(ary[i]!=0)
            {
                for(int j=i;j<1001;j++)
                {
                    if(((i+j)%k==x) && ((i*j)%k==y))
                    {
                        if(i==j)
                        {
                            result+=((ary[i]*(ary[i]-1))/2);
                        }
                        else
                        {
                            result+=(ary[i]*ary[j]);
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
    
    
}
