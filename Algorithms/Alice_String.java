import java.util.Scanner;

public class Alice_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String bob=sc.next();
        String Alice=sc.next();

        boolean result=true;
        if(bob.length()==Alice.length())
        {
            for(int i=0;i<bob.length();i++)
            {
                int diff=Character.compare(Alice.charAt(i),bob.charAt(i));

                if(diff<0)
                {
                    result=false;
                    break;
                }
            }
            if(result)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            
        }
        else
        {
            System.out.println("NO");
        }
    }
    
}
