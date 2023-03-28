/*the most advance ascii conversion */

//importing packages
import java.util.Scanner;

public class ASCII_CODE_ADVANCE 
{
    public static void main(String[] args)throws Exception
    {
        //declaration of variable
        char store;
        int convert;
        //creating object of SCR
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter character to find its ASCII");
        System.out.println("code ");
        store = in.next().charAt(0);
        
        //converting
        convert = (int)(store);

        System.out.println("it'S ascii is "+convert);

        //checking it's case
        if(Character.isUpperCase(store))
        {
            System.out.println("you enter a upper case character");
            System.out.println("converting to lower case");

            Thread.sleep(1000);
            System.out.println("the lowercase is "+Character.toLowerCase(store));

            System.out.println("the ascii of lowercase number is "+(convert+32));

        }
        if(Character.isLowerCase(store))
        {
            System.out.println("you enter a lower case character");
            System.out.println("converting to upper case");

            Thread.sleep(1000);
            System.out.println("the uppercase is "+Character.toUpperCase(store));

            System.out.println("the ascii of uppercase number is "+(convert-32));

        }
        //all closing statement
        in.close();
    }    
}
