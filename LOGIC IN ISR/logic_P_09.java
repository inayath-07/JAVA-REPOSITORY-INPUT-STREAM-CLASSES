/*this program  is use to generate 10 
 * character randomly
*/
public class logic_P_09
{
    public static void main(String args[])
    {
        //declaration of variable
        int random,i;
        char convert;
        System.out.println("generating 10 capitals alphabets");
        
        for(i=0;i<10;i++)
        {
            random = (int)(Math.random()*9+1);
            convert = (char)(random+64);

            System.out.println((i+1)+"."+convert);
        }

        System.out.println("generating 10 small alphabets");
        
        for(i=0;i<10;i++)
        {
            random = (int)(Math.random()*18+1);
            convert = (char)(random+96);

            System.out.println((i+1)+"."+convert);
        } 
    }
}