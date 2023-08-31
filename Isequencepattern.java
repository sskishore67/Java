import java.util.Scanner;

public class Isequencepattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>0;j--)
            {
               System.out.print(j);
        
            }
                for(int k=i+1;k<=n;k++)
                {
                    System.out.print(k-i+1);
                  
                }
            System.out.println();
        }
    }
}
