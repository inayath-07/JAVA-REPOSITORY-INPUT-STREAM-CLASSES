/*this constructor is use to take character
 * and print the message
 */
//importing packages
import java.io.BufferedReader;
import java.io.InputStreamReader;
//creating thread
class thread extends Thread
{
    public void run() 
    {    
        System.out.println("hello you are in");    
    }
}
//creating class
class constructor 
{
    
    public constructor(char alpha)
    {
        try
        {
         Thread.sleep(1000);
        }catch(InterruptedException IOE)
        {
            System.err.println("an error occur at line 27");
        }
        if(alpha == 'O')
        {
            thread thrd = new thread();
            thrd.run();
        }
        else
        {
            System.out.println("please enter correct character");
        }
    }
}
public class Constructors_P_03 
{
    public static void main(String[] args)throws Exception
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("please enter secrate character");
        char x = (char)(in.read());

        //creating object
        constructor cons = new constructor(x);

        System.out.println("address of your object is \n"+cons);
    }    
}