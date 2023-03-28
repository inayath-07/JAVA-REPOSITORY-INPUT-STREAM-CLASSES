/*these program use to divide elements of two array using  class*/

//importing packages
import java.io.InputStreamReader;
import java.io.BufferedReader;

//creating class that contain arrays
class div_array
{
    //decleration of variable
    double div_arr[] = new double[5];
    double div_arr_1[] = new double[5];
    double div_arr_div[] = new double[5];
}

public class ARRAY_05
{
    public static void main(String[] args)throws Exception
    {
        //creating ISR object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        //creating class object 
        div_array DA = new div_array();

        System.out.println("enter number of elements");
        int num = Integer.parseInt(in.readLine());

        for(int i = 1;i<=num;i++)
        {
            System.out.println("enter elements of 1st array");
            System.out.print(i+".");

            DA.div_arr[i] = Integer.parseInt(in.readLine());

            System.out.println("enter elements of 2nd array");
            System.out.print(i+".");

            DA.div_arr_1[i] = Integer.parseInt(in.readLine());
            Thread.sleep(1000);

            DA.div_arr_div[i] = DA.div_arr[i]/ DA.div_arr_1[i];
        }

        System.out.println("it contain divided array");
        for(int i = 1;i<=num;i++)
        {
            System.out.print(i+".");
            System.out.println(DA.div_arr_div[i]);
        }
    }
}