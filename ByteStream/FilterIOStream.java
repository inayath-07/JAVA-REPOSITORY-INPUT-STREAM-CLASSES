/*The program to demonstrate FilterInputStream and FilterOutputStream 
 * --- the use of filter Stream is that it filter the Data
 * which is transforing from source to destination 


//importing packages
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilterIOStream 
{
    protected FilterIOStream(InputStream in){super(in);}

    public static void main(String[] args)throws IOException
    {
        System.out.println("---\"FilterIStream.main()\"---");
        FilterInputStream FIS = new FilterInputStream(System.in);
    }
}*/