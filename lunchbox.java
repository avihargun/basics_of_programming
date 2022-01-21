import java.util.Arrays;
import java.util.Scanner;

public class lunchbox {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test = sc.nextInt();
        int[] answer=new int[test];
        int j=0;
        while(test!=0)
        {
            int box=sc.nextInt();
            int school=sc.nextInt();
            int[] a= new int[school];
            
            for(int i=0;i<school;i++)
            {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            int count=0;
            int i=0;
            while(i<school &&  box>=a[i] )
            {
                count++;
                box=box-a[i];
                i++;
            }
            answer[j]=count;
            j++;
            test--;
        }
        for(int i=0;i<answer.length;i++)
        {
            System.out.println(answer[i]);
        }
 
    }
    
}
