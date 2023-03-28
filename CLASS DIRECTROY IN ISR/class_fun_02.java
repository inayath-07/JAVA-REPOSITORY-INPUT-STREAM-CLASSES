//importing packages
import java.io.BufferedReader;
import java.io.InputStreamReader;
class alpha
{
    public char ch;
    void des()
    {
        switch (ch)
        {
            case 'a':
            {
                System.out.println("a for apple");
            }
            break;
    
            case 'b':
            {
                System.out.println("b for ball");
            }
            break;
            case 'c':
            {
                System.out.println("c for cat");
            }
            break;
            default :
            System.out.println("please enter alphabets uder d");
        }
    }
}
public class class_fun_02
{
    public static void main(String args[])throws Exception
    {
        //creating ISR object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("enter any alphabet under d  but in lower case");
        char x = (char)(in.read());

        //creating object
        alpha al = new alpha();

        al.ch = x;
        al.des();

    }    
}