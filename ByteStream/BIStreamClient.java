/* BIStream --> BufferInputStream
 * Following program demonstrate the use of BufferInputStream Class
 * of IO  --- usually we use BufferedInputStream with other input classes
 * 
 * --- program to demonstrate BIS using net ---
 *==== It is client ====
*/
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;
import java.io.IOException;

public class BIStreamClient
{
    public static void main(String[] args)throws IOException
    {
        Scanner in = new Scanner(System.in);

        System.out.println("---\"BIStream.main()\"---");

        InetAddress IP = InetAddress.getLocalHost();
        Socket S = new Socket(IP,1);

        System.out.print("enter a number to find it's naturla logarithm :");
        byte num = in.nextByte();

        DataOutputStream DOS = new DataOutputStream(S.getOutputStream());
        DOS.writeByte(num);
        BufferedOutputStream BOS = new BufferedOutputStream(DOS);
        
        DataInputStream DIS = new DataInputStream(S.getInputStream());
        BufferedInputStream BIS = new BufferedInputStream(DIS);

        System.out.println("The natural logarith of "+num+" is "+BIS.read());

        //clreaing the Buffer memeory
        BOS.flush();   

        //all closing statement
        S.close();
        in.close();
    }
}