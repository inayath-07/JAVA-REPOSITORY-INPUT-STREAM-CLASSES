/*@wpr class
 *this program is use to conver String to primitive data type 
*/
//importing packages
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class String_to_primitive 
{
    public static void main(String[] args)throws Exception
    {
        //decleration of variable
        String S_integer;
        //creating object of ISR 
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("this program is use to convert String ");        
        System.out.println("to primitive data type ");

        System.out.println("---------------------------------");
        System.out.println("String to int using valueOf()");

        System.out.println("enter any string ");
        S_integer = in.readLine();

        System.out.println("converting ");
        Thread.sleep(1000);

        System.out.println(Integer.valueOf(S_integer));
    }    
}