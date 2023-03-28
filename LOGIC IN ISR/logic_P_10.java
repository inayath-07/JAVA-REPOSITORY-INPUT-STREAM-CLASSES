/*this program is use to generate all ASCII code */
public class logic_P_10 
{
    public static void main(String[] args)throws Exception 
    {
        //declaration of variable
        int i;
        char convert;

        for(i = 0;i<129;i++)
        {
            //type casting to char
            convert = (char)(i);
            System.out.println((i+1)+"."+convert+" belongs to integer value "+i);
            Thread.sleep(100,10);
        }
    }    
}