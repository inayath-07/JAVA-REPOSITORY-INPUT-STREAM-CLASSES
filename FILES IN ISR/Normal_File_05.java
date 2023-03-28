//these is the Java program to perform file handaling by using normal () 
/*importing packages */
import java.io.*;
public class Normal_File_05
{
    public static void main(String args[])throws Exception
    {
        //creation of file 
        File myfile = new File("G:\\myf.txt");
        myfile.createNewFile();//creation of a file

        if(myfile.exists())
        {
            System.out.print("a new file is created at ");
            System.out.println(myfile.getCanonicalPath());
        }
        else
        {
            System.out.println("file already exist");
        }

        //writing in a file
        FileWriter FWr = new FileWriter("G:\\myf.txt");
        FWr.write("");
        System.out.println("Is file writeable: " + myfile.canWrite());

        //reading a file
        /*@5
         * you can read the file out side of these file
         * when these file is run it delete all old information 
         */
                      
        //all closing statements
        FWr.close();                     
    }
}