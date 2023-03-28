/*This prgoram is use to reverse given String */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Printing_reverse
{
    public static void main(String args[])throws IOException
    {
        //creating ISR Object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("---\"PRINTING STRING REVERSE\"---");

        System.out.println("enter any string that you want to reverse it");
        StringBuffer string = new StringBuffer(in.readLine());
        
        System.out.print("by using predefine method --> ");
        System.out.println(string.reverse());
        
    }
}