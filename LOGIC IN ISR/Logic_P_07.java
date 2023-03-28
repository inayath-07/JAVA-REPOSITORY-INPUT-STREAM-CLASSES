/*these program demonstrate use of Ternary operator 
 * by means of security lock
*/
//importing packages
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Logic_P_07
{
    public static void main(String[] args)throws Exception
    {
        //creating ISR object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        //decleration of secrate word
        String secrate_word = "SYED SHAH INAYATH ULLAH QUADRI";

        String password = "hello";

        System.out.println("enter password");
        String enter_pass = in.readLine();

        String save = (enter_pass ==password)?secrate_word:"a hacker is trying to crack inside";

        if(enter_pass==password)
        {
            System.out.println("your secrate word is ");
            Thread.sleep(1000000);

            System.out.println(save);
        }
        else
        {
            System.out.println("getlost mr.hacker \n");
            System.out.println(save);
        }
    }
}
