/*these program use to multiply two arrays */

//improting packages
import java.io.InputStreamReader;
import java.io.BufferedReader;


//creating class that contain array decleration 
class mul_array
{;
    int mul_array_02[] = new int[10];
    int mul_array_01[] = new int[10];
    int mul_array_mul[] = new int[10];
    
}
public class ARRAY_06 
{
    public static void main(String[] args)throws Exception 
    {
        //creating ISR object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        //creating object of class mul_array
        mul_array MA = new mul_array();

        System.out.println("enter numbers are there");
        int num = Integer.parseInt(in.readLine());

        for(int i = 1;i<=num;i++)
        {
            System.out.println("enter element of 1 array");
            System.out.print(i+".");
            MA.mul_array_01[i] = Integer.parseInt(in.readLine());

            Thread.sleep(1000);

            System.out.println("enter elemnts of 2nd array");
            System.out.print(i+".");
            MA.mul_array_02[i] = Integer.parseInt(in.readLine());

            Thread.sleep(1000);

            //multilying both values
            MA.mul_array_mul[i] =  MA.mul_array_01[i]*MA.mul_array_02[i];
        }

        System.out.println("------------");
        
        //DISPLAYING OUTPUT
        for(int i = 1;i<=num;i++)
        {
            System.out.print(i+".");
            System.out.println(MA.mul_array_mul[i]);
        }
    }    
}
