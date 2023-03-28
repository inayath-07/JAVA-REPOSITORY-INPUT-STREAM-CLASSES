/*these code belongs to Advance_File_06  these code read the file*/
//importing packages
import java.util.*;
import java.io.*;
public class Reading_My_Advance_File 
{
    //decleration of variable
    static String File_path;
    static int i;
    public static void main(String args[])throws Exception
    {
        //creating SCR object 
        Scanner in = new Scanner(System.in);

        System.out.println("enter your file path");
        File_path= in.nextLine();
        
        //reading file
        FileReader FR = new FileReader(File_path);
        while((i=FR.read())!=-1)
        {
            System.out.println((char)i);
        }


        //all closing statements
        in.close();
        FR.close();
    }        
}
