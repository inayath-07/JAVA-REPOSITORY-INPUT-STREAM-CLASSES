/*these client belongs to File_server program 
 * it is used to send ip using DOS
 * and
 * accept a file using OIS
*/
//importing packages
import java.io.*;
import java.net.*;
public class File_Client 
{
    //Decleration of variable
    static InetAddress IP;
    static File rec_File;
    public static void main(String[] args)throws Exception
    {
        //getting IP
        IP = InetAddress.getLocalHost();                
        System.out.println("my IP is "+IP);

        //Socket code
        while(true)
        {
          try( Socket S = new Socket(IP,0707))
          {
           //sending IP to Server
           ObjectOutputStream OOS = new ObjectOutputStream(S.getOutputStream());
           OOS.writeObject(IP);

           ObjectInputStream OIS = new ObjectInputStream(S.getInputStream());

           //receiving file
           rec_File = (File) OIS.readObject();

           
           THREAD TD = new THREAD();
           Thread itd = new Thread(TD);

           itd.start();


          }//end of try block 1

        } //end of while loop


    }        
}
//thread that read rec_File
class THREAD extends Thread
{
    //decleration of variable and object
    int i;
    File_Client FCO = new File_Client();
    public void run()
    {
        //accessing file
        File copyFile = File_Client.rec_File;
        //creating file reader
        try
        {
         try (FileReader FR = new FileReader(copyFile)) {
            while((i=FR.read())!=-1)
             {
                System.out.println((char)i);
             }
        }
        }catch(Exception e)
        {
            System.out.println("an error is caught at thread block");
        }
    }
}