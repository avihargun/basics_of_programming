import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Array_Formation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
        }
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> stack=new Stack<>();
        for(int j=0;j<n;j++)
        {
            boolean b=true;
            for(int i=2;i<=arr[j]/2;i++)
            {
            int temp=arr[j]%i;
                if(temp==0)
                {
                    b=false;
                    break;
                }
            }
            
            if(b){
                q.add(arr[j]);
            }
            else{
                stack.push(arr[j]);
            }
        }
    
        while(!q.isEmpty())
        {
            System.out.print(q.remove()+" ");
        }
      
        System.out.println();
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop()+ " ");
        }

    }
    
}
