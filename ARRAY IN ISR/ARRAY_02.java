/*this program perform addition of two array */
//importing packages
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class ARRAY_02
{
    public static void main(String[] args)throws Exception
    {
        //Creating ISR object 
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        //decleration of array
        int addarray_1[] = new int[5];
        int addarray_2[] = new int[5];
        int addarray_Sum[] = new int[5];

        int num;

        System.out.println("enter how many digits are there");
        num = Integer.parseInt(in.readLine());


        for(int i = 1;i<=num;i++)
        {
            System.out.println("please enter elements of 1st array");
            System.out.print(i+".");
            addarray_1[i] = Integer.parseInt(in.readLine());
            System.out.println("");

            System.out.println("enter elements of 2nd array");

            System.out.print(i+".");
            addarray_2[i] = Integer.parseInt(in.readLine());
            System.out.println("");

            //adding elements
            addarray_Sum[i] =addarray_Sum[i] + addarray_1[i]+addarray_2[i];

            Thread.sleep(1000);
        }   

        System.out.println("added values");
        for(int i = 1;i<=num;i++)
        {
            System.out.print(i+".");
            System.out.println(addarray_Sum[i]);
            System.out.println(' ');            
        }
        
    }    
}