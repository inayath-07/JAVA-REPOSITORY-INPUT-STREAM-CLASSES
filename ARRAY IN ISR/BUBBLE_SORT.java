/*this program uses BUBBLE SORT technique to sort 
 * my trick
*/

//importing packages
import java.io.*;

public class BUBBLE_SORT
{
    public static void main(String[] args)throws Exception
    {
        //creating ISR object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        //declaration of varaible
        int i,j,temp;
        int a[] = new int[10];
        System.out.println("this program uses BUBBLE SORT technique to sort");

        System.out.println("enter array element under 10");
        for(i =0;i<10;i++)
        {
            System.out.print((i+1)+".");
            a[i] = Integer.parseInt(in.readLine());
        }   

        //bubble sorting
        for(int k=0;k<10;k++)//this loop is for
        for(i=0;i<a.length-1;i++)//-1 because 1 element will be sorted automatically
        {
            //this loop is use for puting heavy element at last
            for(j=0;j<a.length-i;j++)//-i because we should not sort sorted element
            {
                if(a[i]>a[i+1])
                {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
        System.out.println("--------------------------");
        for(i=0;i<a.length;i++)
        {
            Thread.sleep(1000);
            System.out.println((i+1)+". "+a[i]);
        }
    }
}