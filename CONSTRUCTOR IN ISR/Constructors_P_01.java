/*this program perform all arithamatic operation using constructor*/
//importing packages
import java.io.InputStreamReader;
import java.io.BufferedReader;

//creating class for addition 
class addition
{
    int y;
    //creating constructo
    public addition(int a, int b)
    {
        int z = a;
        int x = b;
        y = z+x;
    }
    //creating getter for returning the value
    public int getadd()
    {
        return y;
    }
}

//creating class thath contain subtracction constructor
class subtracction
{
    int z;
    public subtracction(int a, int b)
    {
        int y = a;
        int x = b;

        z = x-y;
    }

    public int getsub()
    {
        return z;
    }
}

//constructor for multiplication 
class multiplication
{
    int z;
    public multiplication(int a, int b)
    {
        int x = a;
        int y = b;

        z = x*y;
    }

    public int getmul()
    {
        return z;
    }
}

//constructor for division 
class division
{
    int z;

    public division(int a, int b)
    {
        int y = a;
        int x = b;

        z = y/x;
    }

    public int getdiv()
    {
        return z;
    }
}

//creating constructor for modulous division

class modulous
{
    int z;
    public modulous(int a, int b)
    {
        int x = a;
        int y = b;

        z = x%y;
    }

    public int getmod()
    {
        return z;
    }
}

//creating main class
public class Constructors_P_01
{
    public static void main(String[] args)throws Exception
    {
        //creating class for ISR 
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("enter 2 numbers to perform arithamatic operation");
        int num = Integer.parseInt(in.readLine());
        int num1 = Integer.parseInt(in.readLine());

        //creating object 
        addition add = new addition(num,num1);
        subtracction sub = new subtracction(num,num1);
        multiplication multi = new multiplication(num,num1);
        division div = new division(num,num1);
        modulous mod = new modulous(num,num1);

        System.out.println(add.getadd()+" +");
        System.out.println(sub.getsub()+" -");
        System.out.println(multi.getmul()+" *");
        System.out.println(div.getdiv()+" /");
        System.out.println(mod.getmod()+" %");
    }
}