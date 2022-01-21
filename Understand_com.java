/*Problem:https://www.hackerearth.com/practice/basic-programming/operators/basics-of-operators/practice-problems/algorithm/let-us-understand-computer-78476e7a/
Mr. ABC was recently learning about computer division. Considering the basic model of the computer suppose we wish to divide a number X by D i.e X/D and obtain the result (Note that it is integer division i.e result of 7/2 will be 3).

Now the computer will give the divide overflow error if:

The number of bits in the binary representation(without appending any leading zeroes) of the resulting number(quotient) is greater than the number of bits in the binary representation of divisor(D) (Without appending any leading zeroes).

Now Mr. ABC is given an integer X for T testcases .He wishes to find number of such divisors D(1<=D<=X) for which divide overflow will not occur.

CONSTRAINTS :



INPUT:

The first line contains the integer T , the number of test cases.

In next T lines, each line contains an integer X.

OUTPUT: 

Print the required output for each testcase in new line. 
*/
import java.util.Scanner;

    class TestClass {

        static int findNumberOfBitsWithoutLeadingZeroes(long n) {
   
            int bitCount = 0;
   
            while(n > 0) {
   
                ++bitCount;
   
                n >>= 1;
   
            }
   
            return bitCount;
   
        }
   
        static long binarySearch(long x) {
   
            long l = 1, r = (long)Math.ceil(Math.sqrt(x)), res = -1;
   
            while (l <= r) {
   
                long m = l + (r - l) / 2;
   
                int divisorBitCount = findNumberOfBitsWithoutLeadingZeroes(m);
   
                int quotientBitCount = findNumberOfBitsWithoutLeadingZeroes(x / m);
   
                if(divisorBitCount >= quotientBitCount) {
   
                    res = m;
   
                    r = m - 1;
   
                }
   
                else {
   
                    l = m + 1;
   
                }
   
            }
   
            return (x - res + 1);
   
        }
   
        public static void main(String args[] ) throws Exception {
   
            // Write your code here
   
            Scanner sc = new Scanner(System.in);
   
            int t = sc.nextInt();
   
            while(t-- > 0) {
   
                sc.nextLine();
   
                long x = sc.nextLong();
   
                System.out.println(binarySearch(x));
   
            }
   
        }
   
   }
    

