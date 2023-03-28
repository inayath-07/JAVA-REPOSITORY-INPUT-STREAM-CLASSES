//to get square root of 2 numbers using methods
import java.io.*;
class square
{
    int i;
   int squareRoot ()
    {
      return i*i;
    }
}


public class Class_with_method
{
    public static void main(String args[]) throws IOException
    {
        // creating ISR object 
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("enter number of which you want to get square ");
        int a = Integer.parseInt(in.readLine());
        //creating object of square class
        square square2 = new square();
        square2.i = a;

        System.out.println(square2.squareRoot());
    }    
}