/*this program calculates discount given to a customer on purchasing 
 * led television
*/
//improting java packages
import java.io.InputStreamReader;
import java.io.BufferedReader;
class television 
{
    //creating data member
    private float cost;
    private float discount;
    private float amount;

    //from calculateprivate 
    private float left_over;

    //creating member function
    public void Accept/*setter*/(float cost,float discount)
    {
        this.cost = cost;
        this.discount = discount;
    }

    public String Calculate()
    {
        left_over = (cost/100)*discount;

        System.out.println(left_over);
        amount = cost-left_over;       

        return amount + " " + left_over + "";
    }

    public void display()
    {
        System.out.println("your "+left_over+" rupees is your discount amount");

        System.out.println("you have to pay "+amount);
    }
}

public class Logic_P_04
{
    public static void main(String[] args)throws Exception
    {
        //creating ISR object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("enter cost and discount");
        int cost = Integer.parseInt(in.readLine());
        int DIS = Integer.parseInt(in.readLine());

        //creating object of class
        television tv = new television();
        //assining
        tv.Accept(cost, DIS);

        System.out.println("--------------");
        
        System.out.println(tv.Calculate());

        System.out.println("--------------");

        {
         System.out.println("processing");
         Thread.sleep(1000);
        }

        tv.display();
    }
}