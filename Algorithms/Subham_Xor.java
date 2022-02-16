import java.util.Arrays;
import java.util.Scanner;

public class Subham_Xor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long input[]=new long[n];
        for(int i=0;i<n;i++)
        {
            input[i]=sc.nextInt();
        }
        Arrays.sort(input);
        long k=0;
        long ans=0;
        for(int i=0;i<n-1;)
        {
            k=1;
            if(input[i]!=input[i+1])
            {
                i++;
                continue;
            }
            else
            {
                while(input[i]==input[i+1]&& i<n-1)
                {
                    i++;
                    k++;
                }
            }
            ans=ans+((k)*(k-1))/2;
            
        }
        System.out.println(ans);
        sc.close();
    }
    
}
