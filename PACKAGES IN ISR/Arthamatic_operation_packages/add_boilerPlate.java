package Arthamatic_operation_packages;

//importing packages
import java.io.*;

public class add_boilerPlate
{
    static InputStreamReader read =  new InputStreamReader(System.in);
    static BufferedReader in = new BufferedReader(read);

    public static void main(String[] args)throws IOException
    {
        sum();
    }

    public static int sum()throws IOException
    {
        System.out.println("enter your 2 numbers :");
        int num1 = Integer.parseInt(in.readLine());
        int num2 = Integer.parseInt(in.readLine());

        return num1+num2;
    }
}