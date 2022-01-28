//Problem:https://www.hackerearth.com/practice/data-structures/linked-list/singly-linked-list/practice-problems/algorithm/reversed-linked-list-01b722df/
import java.util.Scanner;
import java.util.Stack;

public class Reversed_Linkedlist {

    Node head;
    static class Node{
        int data;
        Node next;
        Node(int i)
        {
            data=i;
            next=null;
        }
    }
    public  void insert(int d)
    {
        Node new_node=new Node(d);
        if(head==null)
        {
            head=new_node;
            return;
        }
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=new_node;

    }
    public void print()
    {
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> s=new Stack<>();
        Reversed_Linkedlist r=new Reversed_Linkedlist();
        while(n--!=0)
        {
            int d=sc.nextInt();
            if(d%2==0)
            {
                s.push(d);

            }
            else
            {
                while(!s.isEmpty())
                {
                    r.insert(s.pop());
                }
                r.insert(d);
            }
        }
      
        while(!s.isEmpty())
        {
            r.insert(s.pop());

        }
        r.print();
        sc.close();
    }
    
}
