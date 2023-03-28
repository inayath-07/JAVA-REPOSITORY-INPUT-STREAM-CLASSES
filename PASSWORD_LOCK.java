//program to create lock on some information
import java.io.*;
class THREAD_LOCK implements Runnable
{
    public void run()
    {
        String name = "inayath ullah ";
        System.out.println(name);
    }
}

class PASSWORD_LOCK
{
    public static void main(String args[]) throws Exception
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
                       
        THREAD_LOCK BUllet = new THREAD_LOCK();
        Thread GUN = new Thread(BUllet);

        int i = 0;
        
        do
        {
            System.out.println("enter password to display your secrate string ");
            String accept =in.readLine();

            
         if(accept.equals("asalamualaikum"))
           {
            GUN.start();
            break;
           } 
         else
           {
            System.out.println("enter correct password"); 
                   
           }
           
           i++;
           Thread.sleep(1000);
        }while(i<3);
    
    }  
}