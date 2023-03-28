/*this program use to store names and then print it in reverse way */
//importing packages
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ARRAY_07
{
    public static void main(String args[])throws IOException
    {
        //creaitng ISR object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        //decleration of variable
        String names[] = new String[100];
        int number;

        System.out.println("enter how many parts of your name is there ");
        number = Integer.parseInt(in.readLine());

        for(int i = 0;i<=number-1;i++)
        {
            System.out.print((i+1)+".");
            names[i] = in.readLine();
            System.out.print("\n");
        }

        System.out.println("printing in reverse way");

        for(int i = number-1;i>=0;i--)
        {
            System.out.println((i+1)+"."+names[i]);
        }
    }
}