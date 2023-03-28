package Generics_Packages; //package declaration

public class main_program
{
    public static void main(String[] args)
    {
        System.out.println("--- GENERICS ---");

        //creating object of class Generics_program
        Generics_program<Integer> GP = new Generics_program<> (10);
        System.out.println(GP);
    }    
}