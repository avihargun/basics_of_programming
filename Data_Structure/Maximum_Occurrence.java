import java.util.Scanner;

public class Maximum_Occurrence {
    public static void main(String[] args) {
        
        int ascii=256;
        int count[]=new int[ascii];
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        for(int i=0;i<input.length();i++)
        {
            count[input.charAt(i)]++;
        }
        int max=Integer.MIN_VALUE;
        char r1=' ';
        char r2=' ';
        for(int i=0;i<input.length();i++)
        {
            if(max<count[input.charAt(i)])
            {
                max=count[input.charAt(i)];
                r1=input.charAt(i);
            }
            if(max==count[input.charAt(i)])
            {
                r2=input.charAt(i);
            }
        }
        int v1=(int)r1;
        int v2=(int)r2;
        if(v1<v2)
        {
            System.out.println(r1+ " "+max);
        }
        else
        {
            System.out.println(r2+ " "+max);
        }
    }
    
}
