/*program to send result of natural Logarithm to BIStreamClient*/

import java.io.BufferedOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class BIStreamServer
{
    public static void main(String[] args)throws IOException
    {
        ServerSocket SS = new ServerSocket(1);
        //establishing connection
        Socket S = SS.accept();

        System.out.println("BIStreamServer.main()");

        DataInputStream DIS = new DataInputStream(S.getInputStream());
        byte lognum = DIS.readByte();

        //performing logarith calculation
        byte result = (byte) Math.log(lognum);

        DataOutputStream DOS = new DataOutputStream(S.getOutputStream());
        DOS.writeByte(result);
        BufferedOutputStream BOS = new BufferedOutputStream(DOS);

        //clreaing the Buffer memeory
        BOS.flush();

        //all closing statement
        SS.close();
    }
}