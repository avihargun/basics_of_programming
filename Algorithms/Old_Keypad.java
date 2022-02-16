import java.util.*;
import java.util.Collections;
import java.util.Scanner;

public class Old_Keypad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] frequency= new Integer[n];
        for(int i=0;i<n;i++)
        {
            frequency[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int[] keypad=new int[k];
        long total_strokes=0;
        for(int i=0;i<k;i++)
        {
            keypad[i]=sc.nextInt();
            total_strokes+=keypad[i];
        }
        Arrays.sort(frequency,Collections.reverseOrder());
        ArrayList<Integer> total=new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            int v=keypad[i];
            for(int j=1;j<v+1;j++)
            {
                total.add(j);
            }
        }
        Collections.sort(total);
        if(n>total_strokes)
        {
            System.out.println("-1");
        }
        else
        {
            long sum=0;
            for(int i=0;i<n;i++)
            {
                sum=sum+ frequency[i]*total.get(i);
            
            }
            System.out.println(sum);
        }
    }
    
}
