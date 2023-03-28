/*these class perform all arithamatic operation */

//imprting packages
import java.io.InputStreamReader;
import java.io.BufferedReader;

//creating class 
class arthamatics
{
    int add;
    int sub;
    int mul;
    int div;
    int mod;

    //creating method
    public void addr(int a,int b)
    {
        add = a+b;
        System.out.println("returning added answer");
        System.out.println(add);
        System.out.println("-----------------------\n");
    }

    public void subt(int a,int b)
    {
        sub = a-b;
        System.out.println("returning subtracted answer");
        System.out.println(sub);
        System.out.println("-----------------------\n");

    }

    public void multi(int a,int b)
    {
        mul = a*b;
        System.out.println("returning producte");
        System.out.println(mul);
        System.out.println("-----------------------\n");

    }

    public void divs(int a,int b)
    {
        div = a/b;
        System.out.println("returning divided answer");
        System.out.println(div);
        System.out.println("-----------------------\n");

    }

    public void modulous(int a,int b)
    {
        mod = a%b;
        System.out.println("returning reminderr answer");
        System.out.println(mul);
        System.out.println("-----------------------\n");

    }

}
public class practice_class 
{
    public static void main(String[] args)throws Exception
    {
        //creating ISR object        
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        //creating object of arthamatics
        arthamatics A = new arthamatics();

        System.out.println("enter two numbers to perform all arthamatics operation");
        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());

        A.addr(a,b);
        A.subt(a,b);
        A.divs(a,b);
        A.multi(a,b);
        A.modulous(a,b);

        
    }    
}
