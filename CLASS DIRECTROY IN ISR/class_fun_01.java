import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class num_gen
{
    private int n;
    //creating setter
    void set_n(int n)
    {
        this.n = n;
    }
    //creating function
    void gen()
    {
        for(int i =0;i<=n-1;i++)
        {
            System.out.println(i+1);
            try
            {
             Thread.sleep(1000);
            }catch(Exception E)
            {
                System.err.println("an error occured from line 16-20");
            }
        }
    }
}
public class class_fun_01 
{
    public static void main(String[] args)throws IOException
    {
        //creating ISR object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        //declaration of variable
        int i;
        //creating object
        num_gen OB = new num_gen();

        System.out.println("enter till what number you want to print");
        i = Integer.parseInt(in.readLine());

        //passing values
        OB.set_n(i);

        //printing numbers
        OB.gen();
    }    
}
