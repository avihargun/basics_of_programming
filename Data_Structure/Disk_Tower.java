
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Disk_Tower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=n;
        int[] disk=new int[n];
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            public int compare(Integer a, Integer b)
            {
                if (a < b)
                    return 1;
                if (a > b)
                    return -1;
                return 0;
            }
        });
        for(int i=0;i<n;i++)
        {
            disk[i]=sc.nextInt();
            pQueue.add(disk[i]);
            while(!pQueue.isEmpty() && pQueue.peek()==max)
            {
                System.out.print(pQueue.poll()+" ");
                max--;
            }
            System.out.println();
        }
        sc.close();
    }
    
}
