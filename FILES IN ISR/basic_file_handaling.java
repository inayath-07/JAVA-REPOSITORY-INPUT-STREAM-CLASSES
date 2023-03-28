/*the most basic file to create and write in a file */

//importing packages
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class basic_file_handaling 
{
    public static void main(String[] args)throws IOException
    {
        //creating a file
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("enter file name");
        String file_name = in.readLine();

        //creating a file
        File revF = new File("G:\\ALL PROGRAMMING FOLDERS\\"+file_name);
        revF.createNewFile();

        System.out.println("your file is success fully created ");

        //writitng in a file
        System.out.println("enter content for your file ");
        String content =in.readLine();

        FileWriter FWR = new FileWriter(revF);
        FWR.write(content);

        //all closing statement
        in.close();
        FWR.close();
    }    
}