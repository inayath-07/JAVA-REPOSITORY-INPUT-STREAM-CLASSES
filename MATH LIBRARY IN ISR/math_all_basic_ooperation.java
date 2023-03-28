/*this program is use to perform all mathamatic function ranging from pg 60 - 70 
 * in ICSE 10th reader
 * 
 * is you want to generate random number between 0 and n then multiply the Math.random()
 * by n
 */
//importing packages
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class math_all_basic_ooperation 
{
    public static void main(String[] args)throws Exception
    {
        //creating ISR object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        //decleration of variable 
        int a,b;

        //dynamic intializing of a and b
        System.out.println("enter 2 numbers below :");
        a = Integer.parseInt(in.readLine());
        b = Integer.parseInt(in.readLine());

        Thread.sleep(1000);

        //using math.max()        
        System.out.println("your maximum number enterd by you is ");
        System.out.println(Math.max(a,b));

        Thread.sleep(1000);

        //using Math.min()
        System.out.println("your minimum number enterd by you is ");
        System.out.println(Math.min(a,b));

        Thread.sleep(1000);

        //using Math.random()
        System.out.println("the random number between 0 and 10 is ");
        System.out.println(Math.random()*9+1);

        Thread.sleep(1000);

        //using Math.pow()
        System.out.println("your powered number is ");
        System.out.println(Math.pow(a,b));

        Thread.sleep(1000);

        //using Math.sqrt()
        System.out.println("Square root of "+a+" is");
        System.out.println(Math.sqrt(a));

        Thread.sleep(1000);

        //using Math.cbrt()
        System.out.println("cube root of "+a+" is");
        System.out.println(Math.cbrt(a));

        Thread.sleep(1000);

        //using Math.log()
        System.out.println("log value of "+a+" is");
        System.out.println(Math.log(a));

        Thread.sleep(1000);

        //using Math.abs() //return absalute value
        System.out.println("absalute value of "+a+" is");
        System.out.println(Math.abs(a));

        Thread.sleep(1000);

        //using Math.round()
        System.out.println("round of value of "+a+" is");
        System.out.println(Math.round(a));

        Thread.sleep(1000);

        //using Math.rint()//print nearest int value
        System.out.println("rint value of "+a+" is");
        System.out.println(Math.rint(a));

        Thread.sleep(1000);
        
        //using Math.ceil()
        System.out.println("upper round of value of "+a+" is");
        System.out.println(Math.ceil(a));

        Thread.sleep(1000);

        //using Math.floor()
        System.out.println("lower round of value of "+a+" is");
        System.out.println(Math.floor(a));

        Thread.sleep(1000);

        //using Math.exp()
        System.out.println("exponent value of "+a+" is");
        System.out.println(Math.exp(a));

        if(true)
        {
            System.out.print("exit by using exit code 0");
            System.exit(0);
        }
        System.out.println("dead code");
    }
}
