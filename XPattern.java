import java.util.Scanner;

/**
 * XPattern
 */
public class XPattern {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),b=a;;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                if((i==j||i+j==b-1) && !(i==j&&i+j==b-1 ))
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}