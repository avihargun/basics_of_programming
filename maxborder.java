import java.util.Scanner;

public class maxborder
{
  
    public static void main(String[] args) {
        int max=0;
        int k=0;
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        int n=test;
        int[] arr=new int[n];
        while(test--!=0)
        {
            int row=sc.nextInt();
            int coloumn=sc.nextInt();
            for(int i=0;i<row;i++)
            {
                int black=0;
                String s=sc.next();
                for(int j=0;j<s.length();j++)
                {
                    char c=s.charAt(j);
                    if(c=='#')
                    {
                        black++;
                    }
                }
                if(max<black)
                {
                    max=black;
                }
            }
            
     
        arr[k++]=max;
        max=0;

        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
}