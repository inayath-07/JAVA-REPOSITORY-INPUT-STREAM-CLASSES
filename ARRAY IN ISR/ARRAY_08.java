/*this program is use to bubble sort the element of array 
 * error is there
*/
//importing packages
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.IOException;
public class ARRAY_08 
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        //decleration of variable
        int num;
        int array[] = new int[100];

        System.out.println("enter numbers of array element");
        num = Integer.parseInt(in.readLine());

        System.out.println("enter elements of array");
        for(int i = 0;i<num;i++)
        {
            System.out.print((i+1)+".");
            array[i] = Integer.parseInt(in.readLine());
            System.out.println();
        }

        //sotring phase 1 
        //comparision
        for(int i = 0;i<num;i++)
        {
            for(int j = 0;j<num-i;j++)
            {
             if(array[i]>array[i+1])
             {
                int x = array[j];
                array[j] = array[j+1];
                array[j+1] = x;                
             }
            }
        } 

        System.out.println("printing sorted array");

        for(int i = num -1 ;i>=0;i--)
        {
            System.out.println(array[i]);
        }
    }
}