/*this program is use to take your name in it using constructor*/
//importing packages
class name
{
    private String x;
    public name(String x)
    {
        this.x =x;
        System.out.println(x);
    }

    void set()
    {
        System.err.println(x);
    }
}
public class Constructors_P_02
{
    public static void main(String[] args) 
    {
        name printName = new name("hello");
        printName.set();
    }
}