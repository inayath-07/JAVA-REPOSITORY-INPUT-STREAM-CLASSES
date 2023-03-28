/*this program use to keep same name to memberr varaible and member () */
//importing packages
import java.io.BufferedReader;
import java.io.InputStreamReader;
//creating class
class TV
{
    //DECLERATION OF MEMBER VARIABLE
    float price;
    int guarentee;
    String type;
    String SonyTV;
    //CREATING MEMBER METHOD FOR SonyTV
    void Set_SonyTV(float price,int guarentee,String type)
    {
        this.price = price;
        this.guarentee = guarentee;
        this.type = type;
    }

    /*this is use to assign value to user define Data type  */
    public static TV parseTV(String readLine) 
    {
        return null;
    }
}
public class class_fun_03
{
    public static void main(String args[])throws Exception
    {
        //creating ISR object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        //creating object for TV class using array of objects
        TV tv[] = new TV[2];

        System.out.println("enter price of different sony tv");
        for(int i = 0;i<=tv.length-1;i++)
        {
            System.out.print((i+1)+".");
            tv[i] = TV.parseTV(in.readLine());
        }
    }
}
