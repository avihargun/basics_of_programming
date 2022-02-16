import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EasySum_SetProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> A=new HashSet<>();
    
        for(int i=0;i<n;i++)
        {
            A.add(sc.nextInt());
        }
        int m=sc.nextInt();
        HashSet<Integer> C= new HashSet<>();
        for(int i=0;i<m;i++)
        {
            C.add(sc.nextInt());

        }
        for(int i=0;i<Collections.max(C);i++)
        {
            int count=0;
            for(int v: A)
            {
                if(C.contains(i+v))
                {
                    count++;
                }
            }
            if(count==A.size())
            {
                System.out.print(i+" ");
            }
        }
    }
}
