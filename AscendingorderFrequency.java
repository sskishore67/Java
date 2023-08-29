import java.util.Scanner;

public class AscendingorderFrequency {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        int freq[]=new int[a.length()];
        for(int i=0;i<a.length();i++)
        {
            for(int j=0;j<a.length();j++)
            {
                if(a.charAt(i)==a.charAt(j))
                {
                    freq[i]++;
                }
            }
        }
        for(int i=0;i<a.length();i++)
        {
            int max=0;
            if(freq[i]!=-1)
             max=freq[i];
            for(int j=0;j<a.length();j++)
            {
                  if(freq[j]<max &&freq[j]!=-1)
                  max=freq[j];
            }
            for(int j=0;j<a.length();j++)
            {
                if(freq[j]==max)
                {
                    for(int k=0;k<a.length();k++)
                    {
                        if(a.charAt(j)==a.charAt(k))
                       {
                        System.out.print(a.charAt(k));
                        freq[k]=-1;
                       }
                    }
                }
            }
        }

    }
}
