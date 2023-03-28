//for now ISR =  INPUT STREAM READER 
//all input and out put function in input stream reader class
import java.io.*;
public class input_and_output_statements_of_ISR
{
    public static void main(String args[]) throws IOException
    {
        //creating ISR object 
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        //decleration of variable int
        int a,b,c;
        System.out.println("enter value of two number :");
        a = Integer.parseInt(in.readLine());
        b = Integer.parseInt(in.readLine());

        c = a+b;

        System.out.println(c);

        //for float 
        float d,e,f;
        System.out.println("enter value of two floating numbers :");
        d = Float.parseFloat(in.readLine());
        e = Float.parseFloat(in.readLine());
        f = d/e;
        System.out.println(f);

        //for string 
        String name;
        System.out.println("enter your name :");
        name = in.readLine();

        System.out.println("your name is "+name);

        //for character 
        char name2;
        System.out.println("enter any character");
        name2 = (char)(in.read());

        System.out.println(name2);

        String hello = "asalamualaikum";

        System.out.println(hello.length());

    }    
}
