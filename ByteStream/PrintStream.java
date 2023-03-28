/*program to demonstrate PrintStream methods */
public class PrintStream
{
    public static void main(String[] args)
    {
        System.out.println("---\"PrintStream.main()\"---");
        System.out.println("The common Logarith value of 20 is "+(Math.log10(1)));
        System.out.println("The base 5 and the value 15 log is "+(Math.log(15)/Math.log(5)));

        for(int i = 1;i<10;i++)
        {
            System.out.printf("%d\t",i);            
        }

        System.out.println();

        for(int i = 1;i<10;i++)
        {
            System.out.format("%d\t",i*(i+1));
        }
    }
}