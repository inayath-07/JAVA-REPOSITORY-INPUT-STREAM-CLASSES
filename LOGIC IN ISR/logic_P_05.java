/*this program deals with boolean literance  */

//importing java packages
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class logic_P_05
{
    public static void main(String[] args)throws Exception 
    {
        //creating ISR object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("'ente ages");
        int age = Integer.parseInt(in.readLine());

        //declaration of variable
        boolean TF;

        if(TF = age>18 && age <25)
        {
            System.out.println("from boolean "+TF);
            System.out.println("you are selected");
        }

        else
        {
            System.out.println(TF+" from boolean");
            System.out.println("you are not selected");
        }
    }   
}