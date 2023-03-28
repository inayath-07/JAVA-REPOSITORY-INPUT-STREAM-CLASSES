/*this program is use to deal with class and object of real world*/
//importing packages
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//creating class
class animals
{
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
    //creating member variable
    private String name;
    //creating member method
    void PET_DOG()
    {
        System.out.println("enter name of your Dog :");
        try
        {
         this.name = in.readLine();
        }catch(IOException IOE)
        {
            System.err.println("an error occured from line 14 to 22 ");
        }
    }

    //creating member () to display dog name
    String DispDog()
    {
        return this.name;
    }
}
public class class_fun_04 
{
    public static void main(String[] args)throws IOException
    {
        //creating object of class animal
        animals ani = new animals();
        ani.PET_DOG();
        System.out.println(ani.DispDog());
    }
}
