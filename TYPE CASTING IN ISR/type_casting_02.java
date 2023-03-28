/*@Wpr class
 *this program is use to convert String to int
 * but note that the strin shoukd be in number format example "20"
*/
//importing java package
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class type_casting_02 
{  
    public static void main(String[] args)throws Exception
    {
        //creating ISR object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        //declaration of variable
        String StringValue;
        int x;

        System.out.println("this program is use to convert String to int ");
        System.out.println("and vise verse ");
        System.out.println("------------------------------------------------");

        System.out.println("enter a String to convert it into integer");        
        StringValue = in.readLine();

        //just for time pass
        System.out.println("converting to integer please wait");
        Thread.sleep(1000,50);

        System.out.print(Integer.parseInt(StringValue)+"\n");

        System.out.println("converting integer to String ");
        System.out.println("enter integer value ");
        x = Integer.parseInt(in.readLine());

        System.out.println("loading ");
        Thread.sleep(1000,60);

        System.out.println("converted value of int to string is ");
        System.out.println(Integer.toString(x));
    }    
}