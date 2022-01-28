// Problem:https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/all-equal-tree-401d4399/
// You are given a rooted tree with  vertices. There is a number written on each leaf (a vertex contains degree 1 and the root node can be a leaf if it has just one child). The interest degree of each vertex is the sum of numbers written on leaves in subtree on this vertex. In each step, you can change the number written on a leaf by 1. How many steps are required to make the interest degree of all of the nodes equal?

// Note: You can change the number written on a leaf to negative values.

// Input format

// First line: 
// Next line:  numbers where the  number is  denoting the parent of  node 
// Note: Node 1 is the root
// Third line:  numbers where the  of them is  denoting the number that is written on vertex .
// Note: It is guaranteed that if  is not a leaf, then .
// Output format

// Print the minimum number of steps that are required to make the interest degree of all of the nodes equal.

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class interest {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long N=sc.nextLong();
        Set<Long> hashset=new HashSet<>();
        for(int i=0;i<N-1;i++)
        {
            hashset.add(sc.nextLong());
        }
        long ans=0;
        for(long i=0;i<N;i++)
        {
            long x=sc.nextLong();
            ans=ans+x;
        }
        if(hashset.size()==N-1)
        {
            System.out.println("0");
        }
        else
        {
            System.out.println(ans);
        }
     
    }
    
}
