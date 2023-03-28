/*The program to write my name 5 times in a file using BufferWriter */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WritingInFileUsingBufferWriter
{
    public static void main(String[] args)
    {
        try
        {
            //creating a file
            File new_file = new File("P:\\Z + THE DEPRICATED","5 times");
            new_file.createNewFile();

            //creating File Writer
            FileWriter FW = new FileWriter(new_file);
            BufferedWriter BW = new BufferedWriter(FW);

            for (int i=0; i<5; i++)
            {
                BW.write("Syed shah inayath ullah quadri\n");
            }
            BW.close();
        }catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}