import java.util.Scanner;

public class Jhool_Magical_Jewels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();

        while(test-->0)
        {
            int[] count=new int[26];
            String input=sc.next();
            for(int i=0;i<input.length();i++)
            {
                count[input.charAt(i)-'a']++;
            }

            int m1=Math.min(count[17], count[20]); //ASCII of r and u
            int m2=Math.min(count[1], count[24]);  //ASCII of b and y
            System.out.println(Math.min(m1,m2));
        }
    }
    
}
