/*program to create a file at location G:\A PORGRAMMING ZONE*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FIStream
{
    public static void main(String[] args)throws IOException
    {
        try(Scanner in = new Scanner(System.in))
        {
            //declaration of variable
            int i = 0;
            System.out.println("---\"FOStream.main()\"---");
            File F = new File("G:\\A PORGRAMMING ZONE\\File recursion");
            F.createNewFile();

            if(F.exists())
            {
                System.out.println("your file is ready to write ");
                String file_input = in.nextLine();

                try (FileWriter FW = new FileWriter(F))
                {
                    FW.write(file_input);
                }
            }
            else
            {
                throw new FileNotFoundException("unable to find your file to perform write operation");
            }

            //reading what we had write in our File
            FileInputStream FIS = new FileInputStream(F);

            System.out.println("You wrote ");
            while ((i = FIS.read())!=-1)
            {
                System.out.print((char)i);
            }
            FIS.close();
        }
    }    
}