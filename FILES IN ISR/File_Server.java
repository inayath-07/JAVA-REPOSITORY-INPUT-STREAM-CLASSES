/*In these program first server connection is there
 * and then sending file
*/

//importing packages
import java.io.*;
import java.net.*;
import java.util.*;

public class File_Server
{
  public static void main(String args[])throws Exception
  {
    //creating ServerSocket object
    ServerSocket SS = new ServerSocket(0707);
    Socket S = SS.accept();

    //OIS 
    ObjectInputStream OIS = new ObjectInputStream(S.getInputStream());

    System.out.println("hello founder iam connected to the following IP");
    System.out.println(OIS.readObject());

    //all closing statements
    SS.close();
  }
}

//thread that manage file
class file_handler extends Thread
{
  //decleration of variable 
  static String fileName;
  static String fileC[];
  static int lines;
  static int i = 1;
  public void run()
  {
    Scanner in = new Scanner(System.in);

    System.out.println("enter file name");
    fileName = in.nextLine();

    System.out.println("enter how many liens are there :");
    lines = in.nextInt();

    File nFile = new File("G:\\",fileName);
    try
    {
     nFile.createNewFile();
     System.out.println("a new file is created at "+nFile.getAbsolutePath()+"\n");

     System.out.println("enter content of your file");

    try (//writing in my file
    FileWriter FWr = new FileWriter(nFile)) 
    {
      while(i<=lines)
     {
        fileC[i] = in.nextLine();
        System.out.print(i+".");
        
        FWr.write(fileC[i]+"\n");
        i++;
      }
    }
    }catch(IOException IOE)
    {
      System.err.println("an error is caught at file_handler");
    }

    //all closing statementd
    in.close();
  }
}