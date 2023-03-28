/*these code belongs to Normal_File_05 which is used to read it*/
//importing packages
import java.io.FileReader; 
public class Reading_File_USG_FileReader
{
    public static void main(String args[])throws Exception
    {    
        FileReader FR =new FileReader("G:\\myf.txt");    
        int i;    
        while((i=FR.read())!=-1)    
        {
        System.out.print((char)i); 
        }
        //closing statements   
        FR.close();    
    }
}