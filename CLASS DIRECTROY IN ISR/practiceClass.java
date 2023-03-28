//incliding packages in java
import java.io.*;
//creating class
class addition
{
    int a,b;
    int add()
    {
       int c = a+b;
       System.out.println("the sum of "+a+" and "+b+" is "+c);
       return c;
    }
}

class subtraction{
    int a,b;
    int sub()
    {
        int c = a -b;
        System.out.println("the differec=nce of "+a+" and "+b+" is "+c);
        return c;
    }
}

class mutliplication{
    int a,b;

    int multi()
    {
        int c = a*b;
        System.out.println("the product of "+a+" and "+b+" is "+c);
        return c;
    }
}

class division
{
    int a,b,c;
    int divis()
    {
        c = a/b;
        System.out.println("the division of "+a+" and "+b+" is "+c);
        return c;
    }
}

class modulas
{
    int a,b,c;
    int mod()
    {
        c = a%b;
        System.out.println("the modulas division of "+a+" and "+b+" is "+c);
        return c;
    }
}
public class practiceClass
{
    public static void main(String args[]) throws IOException{
        //creating ISR objrct
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int num1,num2;
        String operator;

        System.out.println("enter short form of your arithamatic operators");
        System.out.println("for example add for addition ETC below ");

        operator = in.readLine();
        //creating instatance of class
        addition addition2 = new addition();
        subtraction sub1 = new subtraction();
        mutliplication mul = new mutliplication();   
        division div = new division();
        modulas module = new modulas(); 

        switch (operator)
        {
            case "add" :
            System.out.println("enter two numbers for addition below");
        num1 = Integer.parseInt(in.readLine());
        num2 = Integer.parseInt(in.readLine());

        addition2.a = num1;
        addition2.b = num2;
        addition2.add();

        break;

        case "sub" :
        {
            System.out.println("enter two numbers for subtraction below");
        num1 = Integer.parseInt(in.readLine());
        num2 = Integer.parseInt(in.readLine());

        sub1.a = num1;
        sub1.b = num2;

        sub1.sub();

        }

        break;

        case "multi" :
        {
            System.out.println("enter two numbers for mutliplication below");
        num1 = Integer.parseInt(in.readLine());
        num2 = Integer.parseInt(in.readLine());

        mul.a = num1;
        mul.b = num2;

        mul.multi();
        }
        break;

        case "div" :
        {
            System.out.println("enter two numbers for division below");
        num1 = Integer.parseInt(in.readLine());
        num2 = Integer.parseInt(in.readLine());

        div.a = num1;
        div.b = num2;

        div.divis();
        }
        break;

        case "mod" :
        {
            System.out.println("enter two numbers for modulas division below");
        num1 = Integer.parseInt(in.readLine());
        num2 = Integer.parseInt(in.readLine());            

        module.a = num1;
        module.b = num2;

        module.mod();
        }

        break;

        default :
        System.out.println("enter correct short cut");
        }        
    }
}