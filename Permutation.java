import java.util.Scanner;

public class Permutation {
    public static void main(String args[])
    {
         Scanner s=new Scanner(System.in);
         String a=s.next();
         perm(a,"");
    }
    public static void perm(String a,String b)
    {
        if(a.length()==0)
        {
        System.out.println(b+" ");
        return;
        }
        for(int i=0;i<a.length();i++)
        {
            perm(a.substring(0,i)+a.substring(i+1),b+a.charAt(i));
        }
    }
}