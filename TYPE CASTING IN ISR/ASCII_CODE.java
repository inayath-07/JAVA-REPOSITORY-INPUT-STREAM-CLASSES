/*this program is use to find Ascii code of 
 * particular character
*/

//importing packages
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class ASCII_CODE 
{
    public static void main(String args[])throws Exception
    {
        //declaration of variable
        char convert_to;
        int converted;
        //creating ISR object 
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("enter any character :");
        convert_to = (char)(in.read());

        System.out.println("converting to ASCII");
        Thread.sleep(1000);

        converted = (int)(convert_to);

        System.out.println("the ascii code of "+convert_to+" is ");
        System.out.println(converted);

        System.out.println("___________________________________");
    }
}
