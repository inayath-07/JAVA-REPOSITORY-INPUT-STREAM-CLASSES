/*this program use to deal with all methods related to 
 * threads
 * the way to take input in a file is correct but 
 * for perfect output go to the file flocation
 * G:\ALL PROGRAMMING FOLDERS\JAVA PROGRAMMING\All Input Stream Reader Program(ISR).java\FILE_DIRECTORY.JAVA\basic_file_handaling.java
*/

//importing packages
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

//creating a thred to open a file
class files extends Thread
{
    File crt_file;
    //creating a method that open a file
    public void run()
    {
        //creating a file
        crt_file = new File("G:\\ALL PROGRAMMING FOLDERS\\refres file.txt");
        
        try
        {
            crt_file.createNewFile();
            System.out.println("canonica path "+crt_file.getCanonicalPath());
        }catch(IOException IOE)
        {
            System.out.println("there is an error while creating a file");
        }
        finally
        {
            System.out.println("your file is created at "+crt_file.getAbsolutePath()+"\n");
        }
    }   
}

//thread that write in a file dynmically
class write extends Thread
{
    //decleration of variable
    static FileWriter writingFile;
    //creating isr object
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
    public void run()
    {
        //creating object of firt thread
        files fls = new files();        

        System.out.println("lets write in file ");

        try
        {
            //dynamically writing in a file
            System.out.println("enter a string to write in a file");
            String content = in.readLine();

            //creating object to write in a file
            writingFile = new FileWriter(fls.crt_file);
            writingFile.write(content);
        }catch(IOException IOE)
        {
            System.out.println(" an error occured wile writing in a ");
            System.out.println("file ");
        }
    }
}
public class file_and_Thread 
{
    public static void main(String[] args)throws Exception
    {
        //creating object of thread
        files files_obj = new files();
        write writeFile = new write();

        //running a thread to create a file
        files_obj.start();

        //stoping a thread
        Thread.sleep(10,50);

        //running a thread to create a file
        writeFile.start();
    }    
}