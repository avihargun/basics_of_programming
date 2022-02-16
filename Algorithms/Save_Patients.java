import java.lang.Character.Subset;
import java.util.Scanner;

public class Save_Patients {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] count_vaccine=new int[n];
        int[] count_patient=new int[n];

        boolean ans=true;
        for(int i=0;i<n;i++)
        {
            count_vaccine[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            count_patient[i]=sc.nextInt();
            if(count_vaccine[i]<count_patient[i])
            {
                ans=false;
            }
        }
        if(ans==true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
    
}
