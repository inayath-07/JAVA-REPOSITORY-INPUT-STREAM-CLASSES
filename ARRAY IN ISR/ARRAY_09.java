/*this program used for linear searching in 1d array 
 * it uses linear or sequential settings
*/
//importing packages
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ARRAY_09 
{
    public static void main(String[] args)throws Exception
    {
        //Creating ISR object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        //decleration of varaible
        int linear_Search[] = new int[10];
        int search;

        System.out.println("enter 10 element of array");

        for(int i = 0;i<10;i++)
        {
            System.out.print((i+1)+".");
            linear_Search[i] = Integer.parseInt(in.readLine());
        }

        if(linear_Search!=null)
        {
            System.out.println("your element is successfully inserted");
        }

        System.out.println("------------------------------");

        System.out.println("enter number that you want to search");
        search = Integer.parseInt(in.readLine());
        
        
        for(int i =0;i<10;i++)
        {

         if(linear_Search[i] == search)
         {
            System.out.println("your searched number is "+linear_Search[i]);
            System.out.println("successfully exited with status 0");
            System.exit(0);

         }
        }
        System.out.println("als your number is not there");
    }
}
