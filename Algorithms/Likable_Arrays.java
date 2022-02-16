import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Likable_Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0)
        {
            int n=sc.nextInt();

        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            if(!hash.containsKey(x))
            {
                hash.put(x, 1);
            }
            else
            {
                hash.replace(x,hash.get(x)+1);
            }
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> entry : hash.entrySet())
        {
            if(entry.getValue()>entry.getKey())
            {
                ans=ans+ entry.getValue()-entry.getKey();
            }
            else
            {
                ans=ans+ Math.min(entry.getValue(), entry.getKey()-entry.getValue());
            }
        }
        System.out.println(ans);

        }
        

    }
    
}
