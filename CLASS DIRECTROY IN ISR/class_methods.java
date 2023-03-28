/*this program use to send values to a class using methods */
//importing packages
import java.io.BufferedReader;
import java.io.InputStreamReader;

//creating class
class sum
{
    int a;
    int b;
    int c;

    void mr()
    {
        c = a+b;
        System.out.println("your sum is "+c);
    }
}

//creating main class
public class class_methods
{
    public static void main(String[] args)throws Exception
    {
        //creating ISR object 
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        //creating object for class
        sum obj = new sum();

        //IO manipulators
        System.out.println("enter 2 numbers");
        int x = Integer.parseInt(in.readLine());
        int y = Integer.parseInt(in.readLine());

        //sending values to a class
        obj.a = x;
        obj.b = y;        

        obj.mr();

    }
}