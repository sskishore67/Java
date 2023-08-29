import java.util.Scanner;

public class Combination {
    public static void main(String args[])
    {
         Scanner s=new Scanner(System.in);
         String a=s.next();
         for(int i=0;i<a.length();i++)
         {
          for(int j=i+1;j<a.length();j++)
          {
            System.out.println(a.substring(i,j));
          }
         }
    }
}
