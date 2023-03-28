/*this is the simple program to demostrate type casting to char */
//importing packages
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class type_casting_01 
{
    public static void main(String[] args)throws Exception
    {
        //creating ISR object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        //decleradtion of variable 
        int a,cast_int;
        char char_cast,cast;

        System.out.println("this program is use to convert integer to char ");
        System.out.println("and vise versa");

        System.out.println("converting integer to char \n");
        System.out.println("enter a integer value to cast it to char");
        a = Integer.parseInt(in.readLine());

        //type casting
        cast = (char)(a);

        System.out.println("your casted value of "+a+" is "+cast);
        System.out.println("\n");        

        System.out.println("converting char to integer ");
        System.out.println("enter character to convert it into integer");

        char_cast = (char)(in.read());

        //type casting
        cast_int = (int)(char_cast);
        System.out.println("the casted value of "+char_cast+" is ");     
        System.out.println(cast_int);
    }    
}
