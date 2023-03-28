/*these program subtractas value of array uing class*/

//importing package
import java.io.InputStreamReader;
import java.io.BufferedReader;

//creating class that perform sub action on array
class sub_array
{
    //decleration of array
    int sub_array_1[] = new int[5];
    int sub_array_2[] = new int[5];
    int sub_array_differene[] = new int[5];

}
public class ARRAY_01 
{
    public static void main(String[] args)throws Exception
    {
        //creating ISR object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        //creating object of class sub_array
        sub_array SA = new sub_array();

        System.out.println("enter how many numbers are there");
        int num = Integer.parseInt(in.readLine());

        for(int i=1;i<=num;i++)
        {
            //importing values in sub_array_1[]
            System.out.println("enter values in 1st array");
            System.out.print(i+".");
            SA.sub_array_1[i] = Integer.parseInt(in.readLine());
            System.out.println("");

            Thread.sleep(1000);

            //importing values in sub_array_1[]
            System.out.println("enter values in 2nd array");
            System.out.print(i+".");
            SA.sub_array_2[i] = Integer.parseInt(in.readLine());
            System.out.println("");

            Thread.sleep(1000);

            //saving
            SA.sub_array_differene[i] =SA.sub_array_1[i]- SA.sub_array_2[i];
        }

        System.out.println("the difference of 2 array = ");
        for(int i=1;i<=num;i++)
        {
         System.out.print(i+".");
         System.out.println(SA.sub_array_differene[i]);
        }
    }    
}
