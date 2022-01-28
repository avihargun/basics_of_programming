import java.util.HashMap;
import java.util.Scanner;

public class Scoreboard_Queries
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0)
        {
            int n=sc.nextInt();
            int q=sc.nextInt();
            int[] a=new int[n];
            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                Integer count = hm.get(a[i]);
 
                if (count == null) {
                    hm.put(a[i], 1);
                }
                else {
                    hm.put(a[i], count + 1);
                }
            }
            while(q-->0)
            {
                int l=sc.nextInt();
                int r=sc.nextInt();
                int ele=a[l-1];
                a[l-1]=r;
                int v=hm.get(ele);
                if(v>0)
                {
                    hm.put(ele,v-1);
                    if(v-1==0)
                    {
                        hm.remove(ele);
                    }
                }
                Integer count = hm.get(r);
 
                if (count == null) {
                    hm.put(r, 1);
                }
                else {
                    hm.put(r, count + 1);
                }
                System.out.println(hm.size()+1);
            }
    }


}
}