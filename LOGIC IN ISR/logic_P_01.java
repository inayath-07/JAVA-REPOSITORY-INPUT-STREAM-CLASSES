/*write a program to enter a number .if the number is the
number is positive even display 3 succedding even numbers 
if the number is negative odd then display 3 preceding 
ood numbers otherwise display the numbers is nether positive
even nor negative odd*/

import java.io.*;
public class logic_P_01
{
    public static void main(String args[]) throws IOException
    {
        // creating ISR object
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        //decleration of variable
        int number;
        System.out.print("enter number :");
        number = Integer.parseInt(in.readLine());

        if (number%2 == 0 && number > 0)
        {
            System.out.println((number+2)+" "+(number+4)+" "+(number+6));          
        }

        if(number%2 !=0 && number <0)
        {
            System.out.println((number-2)+" "+(number-4)+" "+(number-6));
        }

        else
        {
            System.out.println("number is nether positive even nor negative odd");
        }
    }    
}
