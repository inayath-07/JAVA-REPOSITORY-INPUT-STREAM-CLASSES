/*this program deal with selecftion sort with respect to Thread */

//importing packages
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

//creating class for ascending
class ascending extends Thread
{
    public void run()
    {
        try
        {
            //creating ISR Object
            InputStreamReader read = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(read);

            //declaration of variable
            int temp,s,i,min,j;
            System.out.println("--- ASCENDING ---");
            System.out.println("enter how many numbers are there :");
            s = Integer.parseInt(in.readLine());

            //force declaraiton
            int array[] = new int[s];

            System.out.println("enter your numbers ");            
            for(i=0;i<s;i++)
            {
                System.out.print((i+1)+".");
                array[i] = Integer.parseInt(in.readLine());
            }

            //selection sorting
            for(i=0;i<s-1;i++)
            {
                min = i;
                for(j=i+1;j<s;j++)
                {
                    if(array[j]<array[min])
                    {
                        min=j;
                    }
                }
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }

            System.out.println("---------------------------");
            //printing
            for(i=0;i<s;i++)
            {
                System.out.println((i+1)+"."+array[i]);
            }
        }catch(IOException IOE)
        {
            System.err.println("an error occured at 26");
        }
    }
}
public class SELECTION_SORT 
{
    public static void main(String args[])throws IOException
    {
        //creating ISR Object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        //declaration of variable
        String option;

        System.out.println("--- SELECTION SORTING ---");
        System.out.println("enter what you want to perform ");
        System.out.println("ascending -- asd");
        System.out.println("descending -- dsd");

        option = in.readLine();

        if(option.equalsIgnoreCase("ASD"))
        {
            ascending AT = new ascending();
            AT.start();
        }
    }
}
