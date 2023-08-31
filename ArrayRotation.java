import java.util.*;

public class ArrayRotation {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter array size");
     int a=s.nextInt();
     System.out.println("Enter array element");
     int arr[]=new int[a];
     int arr1[]=new int[a];
     for(int i=0;i<a;i++)
    {
        arr[i]=s.nextInt();
        arr1[i]=arr[i];
    }
    System.out.println("Enter the number of rotation");
    int b=s.nextInt();
    System.out.println("before left Rotation");
    System.out.println(Arrays.toString(arr));
   leftrotation(arr,b);
   for(int sy:arr)
   {
    System.out.print(sy+" ");
   }
    System.out.println("\n"+"before right Rotation");
    System.out.println(Arrays.toString(arr1));
   rightroation(arr1,b);
   for(int sy:arr1)
   {
    System.out.print(sy+" ");
   }
    }
    public static void leftrotation(int arr[],int b)
    {
        for(int i=0;i<b;i++)
        {
          int temp=arr[0];
          for(int j=0;j<arr.length-1;j++)
          {
              arr[j]=arr[j+1];
          }
          arr[arr.length-1]=temp;
        }
    }
    public static void rightroation(int arr1[],int b)
    {
        for(int i=0;i<b;i++)
        {
            int temp=arr1[arr1.length-1];
            for(int j=arr1.length-1;j>0;j--)
            {
               arr1[j]=arr1[j-1];
            }
            arr1[0]=temp;
        }
    }
}
