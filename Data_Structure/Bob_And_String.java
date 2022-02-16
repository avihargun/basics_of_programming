import java.util.HashMap;
import java.util.Scanner;

public class Bob_And_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0)
        {
            String S=sc.next();
            String T=sc.next();

            HashMap<Character,Integer> hash_S=new HashMap<>();
            HashMap<Character,Integer> hash_T=new HashMap<>();

            for(int i=0;i<S.length();i++)
            {
                Character c= S.charAt(i);
                if(hash_S.containsKey(c))
                {
                    hash_S.replace(c, hash_S.get(c)+1);
                }
                else
                {
                    hash_S.put(c, 1);
                }
            }
            for(int i=0;i<T.length();i++)
            {
                Character c= T.charAt(i);
                if(hash_T.containsKey(c))
                {
                    hash_T.replace(c, hash_T.get(c)+1);
                }
                else
                {
                    hash_T.put(c, 1);
                }
            }

            int sum=0;
            for(Character key : hash_S.keySet())
            {
                if(hash_T.containsKey(key))
                {
                    sum=sum+Math.abs(hash_S.get(key)-hash_T.get(key));
                }
                else
                {
                    sum=sum + hash_S.get(key);
                }

            }
            for(Character key: hash_T.keySet())
            {
                if(!hash_S.containsKey(key))
                {
                    sum=sum+hash_T.get(key);
                }
            }
            System.out.println(sum);
            
        }
    }
    
}
