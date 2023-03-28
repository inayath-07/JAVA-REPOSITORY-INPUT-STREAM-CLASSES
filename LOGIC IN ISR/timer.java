/*these will be the program where i am gonna to impliment my all programming knowladge*/
//-->pending
import java.util.*;
public class timer 
{
    public static void main(String[] args) 
    {
        Timer timer = new Timer();        

        TimerTask TT = new TimerTask() 
        {
            @Override
            public void run()
            {
                System.out.println("time up!");
            }            
        };

        timer.schedule(TT,1000);
    }    
}
