/*
Problem:https://www.hackerearth.com/practice/basic-programming/recursion/recursion-and-backtracking/practice-problems/algorithm/binary-palindrome-4-035e5ad6/
You are given a number . In one operation, you can either increase the value of  by 1 or decrease the value of  by 1.

Determine the minimum number of operations required (possibly zero) to convert number  to a number  such that binary representation of  is a palindrome.

Note: A binary representation is said to be a palindrome if it reads the same from left-right and right-left.

Input format

The first line contains an integer  denoting the number of test cases.
For each test case, the first line contains an integer .
Output format

For each test case in a new line, print the minimum number of operations required. 
*/
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
public class Binary_Palindrome {
    static int countinc=0;
    static int countdec=0;
//     static boolean countPalindromePos(long n) {
//         if(isPalindrome(n)) return true;
//         countinc++;
// //      System.out.println(countinc);
//         if(countPalindromePos(n+1)==true) return true;
//         return false;
//     }
//     static boolean countPalindromeNeg(long n) {
//         if(isPalindrome(n)) return true;
//         countdec++;
// //      System.out.println(countdec);
//         if(countPalindromeNeg(n-1)==true) return true;
//         return false;
//     }
        // function to reverse bits of a number
        public static long reverseBits(long n)
        {
            long rev = 0;
            // traversing bits of 'n' 
            // from the right
            while (n > 0) 
            {
                // bitwise left shift 'rev' by 1
                rev <<= 1;
                // if current bit is '1'
                if ((n & 1) == 1)
                    rev ^= 1;
                // bitwise right shift 'n' by 1
                n >>= 1;
            }
            // required number
            return rev;
        }
        // function to check a number
        // is palindrome or not
        public static boolean isPalindrome(long n)
        {
            // get the number by reversing
            // bits in the  binary
            // representation of 'n'
            long rev = reverseBits(n);
            return (n == rev);
        }
    public static void main(String args[] ) throws Exception {
//input array and count
        /*
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int testcase = Integer.parseInt(br.readLine()); //Length of Array
      while(testcase>0){
        int xo;
      int totalNumbers = Integer.parseInt(br.readLine());*/
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         long testcase = Long.parseLong(br.readLine()); //Length of Array
          //  Scanner sc=new Scanner(System.in);
           // testcase=sc.nextInt();
         while(testcase>0) {
           
             long n = Long.parseLong(br.readLine());
             long m=n;
            while(n< Long.MAX_VALUE)
            {
                if(isPalindrome(n))
                {
                    break;
                }
                countinc++;
                n++;
            }
              while(m>0)
            {
                if(isPalindrome(m))
                {
                    break;
                }
                countdec++;
                m--;
            }
            // countPalindromeNeg(n);
            // countPalindromePos(n);
            System.out.println(Math.min(countdec, countinc));
        testcase--;
    countinc=0;
    countdec=0;
    }
    }
}
