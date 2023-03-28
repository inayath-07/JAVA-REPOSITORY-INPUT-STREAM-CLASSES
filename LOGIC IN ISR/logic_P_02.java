/* W.A.P. to enter 3 numbers and a character if character = s display sum of those 3 number else
and character = p diplay product of 3 number*/
import java.io.*;
public class logic_P_02
{
    public static void main(String args[]) throws IOException
    {
        //creating ISR object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        //declaeartion of variable
        int a,b,c;
        char d;

        System.out.println("enter three  number :");
        a = Integer.parseInt(in.readLine());
        b = Integer.parseInt(in.readLine());
        c = Integer.parseInt(in.readLine());

        System.out.println("---------------------------");

        System.out.print("enter s if u want to add those 3 number or enter p if you want product of those numbers ");
        d = (char)(in.read());

        switch (d)
        {
            case 's':
            System.out.println(a+b+c);
            break;

            case 'p':
            System.out.println(a*b*c);
            break;

            default:
            System.out.println("please enter correct character");
        }


    }    
}