/*this program is use to deal with insertion sorting in java  */

//importing packages
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

//creating class
class insertion_asd
{
    public void insert_asceding()throws IOException
    {
        //creating ISR Object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        //declaration of variable
        int NIA,i,j,current;
        System.out.println("--- ASCENDING --- ");

        System.out.println("enter  how many numbers are there ");
        NIA = Integer.parseInt(in.readLine());

        //force declaraiton 
        int arr[] = new int[NIA];

        System.out.println("enter your "+NIA+" numbers ");
        for(i = 0;i<NIA;i++)
        {
            System.out.print((i+1)+".");
            arr[i] = Integer.parseInt(in.readLine());
        }

        //insertion sorting
        for(i = 1;i<arr.length;i++)
        {
            current = arr[i];
            j = i-1;//⬇ use to track sorted part
            while(j>=0 && current<arr[j])
            {
                arr[j+1] = arr[j];//creating place to insert value & inserting values
                j--;//to nutralize the value of j
            }

            //placement /*if current >arr[j] then it works*/
            arr[j+1] = current;
        }

        System.out.println("----------------------------");
        for(i=0;i<NIA;i++)
        {
            System.out.println((i+1)+"."+arr[i]);
        }
    }
}

//creating class for descending order
class insertion_dsd
{
    public void descending()throws IOException
    {
        //creating ISR Object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        //declaration of variable
        int DS,i,j,current_key;

        System.out.println("--- DESCENDING ---");

        System.out.println("enter  how many numbers are there ");
        DS = Integer.parseInt(in.readLine());

        //force declaraiton 
        int arr[] = new int[DS];
        
        System.out.println("enter your "+DS+" numbers ");
        for(i = 0;i<DS;i++)
        {
            System.out.print((i+1)+".");
            arr[i] = Integer.parseInt(in.readLine());
        }

        //insertion sorting (descending)
        for(i=1;i<DS;i++)//i for picking next element
        {
            current_key = arr[i];//storing that pick element in current_key
            j = i-1;//tracking sorted part
            while(j>=0 && current_key>arr[j])
            {
                //allocating space i.e. ++
                arr[j+1] = arr[j];
                j--;
            }

            //placement /*it will work if current<arr[j] */
            arr[j+1] = current_key;
        }

        System.out.println("----------------------------");
        for(i=0;i<DS;i++)
        {
            System.out.println((i+1)+"."+arr[i]);
        }
    }
}
//main class
public class INSERTION_SORT
{
    public static void main(String args[])throws Exception
    {
        //creating ISR Object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        //declaration of variable
        String option;
        System.out.println("--- INSERTION SORT ---");

        System.out.println("enter asd fot ascending ");
        System.out.println("dscd for descending ");

        option = in.readLine();

        if(option.equalsIgnoreCase("ASD"))
        {
            insertion_asd OOIS = new insertion_asd();
            OOIS.insert_asceding();
        }
        if(option.equalsIgnoreCase("DSCD"))
        {
            insertion_dsd ID = new insertion_dsd();
            ID.descending();
        }
        else
        {
            System.out.println("please enter valid input");
        }
    }
}