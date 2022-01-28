import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Remove_Friend {
    // Node head;
    // static class Node{
    //     int data;
    //     Node next;
    //     Node(int i)
    //     {
    //         data=i;
    //         next=null;
    //     }
    // }
    // public  void insert(int d)
    // {
    //     Node new_node=new Node(d);
    //     if(head==null)
    //     {
    //         head=new_node;
    //         return;
    //     }
    //     Node curr=head;
    //     while(curr.next!=null)
    //     {
    //         curr=curr.next;
    //     }
    //     curr.next=new_node;

    // }
    // public void delete(int d)
    // {
    //     Node curr=head;
    //     if(curr.data==d)
    //     {
    //         head=head.next;
    //         return;
    //     }
    //     while(curr.next.data!=d)
    //     {
    //         curr=curr.next;
    //     }
    //     curr.next=curr.next.next;
    // }
    // public void print()
    // {
    //     Node curr=head;
    //     while(curr!=null){
    //         System.out.print(curr.data+" ");
    //         curr=curr.next;
    //     }
    // }

    public static void main(String[] args) {
        //LinkedList<Integer> list= new LinkedList<>();
        //Queue<Integer> q=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        Stack<Integer> s=new Stack<>();
        while(test-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] input=new int[n];
            for(int i=0;i<n;i++)
            {
                input[i]=sc.nextInt();
                
            }
            for(int score : input)
            {
               while(k>0 && !s.empty() && (s.peek()<score))
               {
                   s.pop();
                   k--;
               }
               s.add(score);
               
            }
            Stack<Integer> s1=new Stack<>();
            while(!s.empty())
            {
                s1.push(s.pop());
            }
            while(!s1.empty())
            {
                System.out.print(s1.pop()+" ");
            }
            System.out.println();
        }
        
    }
    
}
