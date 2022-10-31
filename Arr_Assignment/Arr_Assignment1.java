import java.util.Scanner;
public class Arr_Assignment1
{

    public static void main(String[] args) {

        int []a=new int[5];
        int [] b=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter the Value for First Array");
            a[i]= sc.nextInt();
            b[i]=a[i];
        }


        System.out.println("Elements of Second Array are: ");
      for(int i=0;i<b.length;i++)
      {
       System.out.print(b[i]+" ");
      }

    }
}
