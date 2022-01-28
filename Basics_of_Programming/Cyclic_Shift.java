/*
Problem:https://www.hackerearth.com/practice/basic-programming/bit-manipulation/basics-of-bit-manipulation/practice-problems/algorithm/lets-shift-2-36d90caa/
You are given a number  represented as a binary representation of  bits. You are also given a number  and a character .

Determine a number  that is generated after cyclically shifting the binary representation of  by  positions either left if  or right is .

Input format 

The first line contains an integer  representing the number of queries.
The next  lines contain  as mentioned in the problem statement.
Output format

Print  integers in a separate line representing the answer to each query.

Constraints
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Cyclic_Shift{

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        String name = br.readLine();

        int T = Integer.parseInt(name);

        int n, m;

        String c;

        for (int i = 0; i < T; i++)

        {

            String[] arr = br.readLine().split(" ");

            n = Integer.parseInt(arr[0]);

            m = Integer.parseInt(arr[1]);

            c = arr[2];

            String str = Integer.toBinaryString(n);

            if (str.length() < 16)

            {

                int ad = 16 - str.length();

                for (int j = 0; j < ad; j++) {

                    str = "0" + str;

                }

            }

            if (c.equalsIgnoreCase("L"))

            {

                for (int j = 0; j < m; j++) {

                    str = str.substring(1, 16) + str.charAt(0);

                }

                sb.append(Integer.parseInt(str, 2) + "\n");

            }

            else

            {

                for (int j = 0; j < m; j++) {

                    str = str.charAt(15) + str.substring(0, 15);

                }

                sb.append(Integer.parseInt(str, 2) + "\n");

            }

        }

        System.out.println(sb);

    }

}

// public class Cyclick_Shift {
// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// int test=sc.nextInt();
// while(test-->0)
// {
// Long n=sc.nextLong();
// Long m=sc.nextLong();
// char c=sc.next().charAt(0);
// if(c=='L')
// {
// Long x=n<<m;
// Long y=n>>(16-m);
// n=x|y;
// }
// if(c=='R')
// {
// Long x=n>>m;
// Long y=n<<(16-m);
// n=x|y;
// }
// System.out.println(n);
// }
// }

// }
