/*thes is the most basic file */
//importing packages
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
public class FILE_01 
{
    public static void main(String[] args)throws Exception
    {
        //creating a file
        File first_File = new File("G:\\my file.txt");
        first_File.createNewFile();

        if(first_File.exists())
        {
            System.out.println("congrats your new file is created at ");
            System.out.println(first_File.getAbsolutePath());
        }
        else
        {
            System.err.println("an error occured during file creation");
        }

        //writing in my file
        FileWriter FWR = new FileWriter(first_File);
        FWR.write("asalamualaikum");
        if(first_File!=null)
        {
            System.out.println("something is there in your file");
        }

        //reading file
        FileReader FR = new FileReader("G:\\my file.txt");
        int i;
        while((i=FR.read())!=-1)    
        {
        System.out.print((char)i); 
        }

        FWR.close();
        FR.close();
    }
}
