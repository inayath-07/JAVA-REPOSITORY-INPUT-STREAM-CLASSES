/*The following program to demonstrate FileInputStream 
 and FIleOutputStra
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FStream
{
    public static void main(String[] args)throws Exception
    {
        System.out.println("---\"FStream.main()\"---");

        FileOutputStream FOS = new FileOutputStream("G:\\A PORGRAMMING ZONE\\File recursion");
        FOS.write((int)System.currentTimeMillis());

        System.out.println("Reading the current time since 1970");

        FileInputStream FIS = new FileInputStream("G:\\A PORGRAMMING ZONE\\File recursion");
        int i = 0;

        while((i=FIS.read())!=-1)
        {
            System.out.print((char)i);            
        }
        //all closing statement
        FOS.close();
        FIS.close();
    }
}