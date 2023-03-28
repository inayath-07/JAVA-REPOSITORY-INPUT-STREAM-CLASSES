/* crating two objects that indicates same class
class_name object_name1 = new class_name();
class_name object_name2 = object_name1;

eg 
box b1 = new box();
box b2 = b1;
*/
// program to create two classes 
// importing packages in java 
import java.io.*;
class box
{
    double height;
    double width;
    double depth;
}
class classPower
{
    public static void main(String args[]) throws IOException
    {
        //creating ISR object  
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        // decleration of data type
        double a,b,c;

        System.out.println(" enter height width and depth of box");
        a = Double.parseDouble(in.readLine());
        b = Double.parseDouble(in.readLine());
        c = Double.parseDouble(in.readLine()); 
        
        // creating object of class box
        box mybox = new box();

        mybox.depth = b;
        mybox.height = a;
        mybox.width = c;

        System.out.println(mybox.depth*mybox.height*mybox.width);

    }
}