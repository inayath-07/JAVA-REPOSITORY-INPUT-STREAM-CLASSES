//these program adds elements in array and make avarage of it
//importing packages
import java.io.*;

public class ARRAY_04
{
    public static void main(String[] args) throws IOException
    {
        //creating ISR object 
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);   
        
        //creating array
        System.out.println("enter how many numbers are there ");
        //decleration of variable and initializing it
        int a = Integer.parseInt(in.readLine());
        int num[] = new int[a];
        int i;
        int Sum=0;

        for(i = 0;i<a;i++)
        {
            System.out.println("enter numbers");
            num[i] = Integer.parseInt(in.readLine());
            Sum+=num[i];            
        }
        System.out.println("your average of array is "+Sum/a);

    }    
}
