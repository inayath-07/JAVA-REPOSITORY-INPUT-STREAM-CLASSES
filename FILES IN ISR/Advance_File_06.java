/*these is the most andvance file which is used to take input*/
//importing packages
import java.io.*;
import java.util.*;

public class Advance_File_06 
{
  //declaration of variable 
  static int i = 1;
  static int lines;
  static String Storearray[] = new String[100000000];
  public static void main(String args[])throws Exception
 {
   //creating Scanner object
   try (Scanner in = new Scanner(System.in)) 
   {
     System.out.println("enter File name ");
     String File_name = in.nextLine();

      //creating file
      File bestFile = new File("G:\\",File_name);
      bestFile.createNewFile();
      System.out.println("a new File is created at "+bestFile.getAbsolutePath());

      //IO manipulators
      System.out.println("enter how many lines are  there in your document");
      lines = in.nextInt();

      System.out.println("what you want to write in your file and if you want to exit write complited");

      try (FileWriter myFileWriter = new FileWriter(bestFile)) {
        while(i<=lines)
        {
          Storearray[i]  = in.nextLine();
          System.out.println("write something at line number "+i);
          myFileWriter.write(Storearray[i]+"\n");

          if(Storearray[i].equals("complited"))
          {
            System.out.println("-------------------------");
            break;
          }
          i++;
        }
      }
    }      
  }
}
