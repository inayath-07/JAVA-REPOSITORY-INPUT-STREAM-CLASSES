/*these program deals accept multiplt lines and 
 * store them in an array
 */
//importing packages
import java.io.*;
public class String_Array 
{
    public static void main(String args[])throws Exception
    {
        //creating ISR object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        //decleration of variable 
        String array[] = new String[10000000];
        int i =1;
        int lines;
        //end of decleration of variable//

        System.out.println("how many lines are there");
        lines = Integer.parseInt(in.readLine());

        System.out.println("enter your passage if you want to exit type ---*---\n");

        while(i<=lines)
        {
            array[i] = in.readLine();
            
            if(array[i].equals("---*---"))
            {
             System.out.println("-----------------");

             for(i=1;i<=lines;i++)
              {
                System.out.println(array[i]);
                Thread.sleep(1000);
                if(array[i].equals("---*---"))
                {
                    break;                
                }
              }
            }       
            i++;
        }
    }
}
