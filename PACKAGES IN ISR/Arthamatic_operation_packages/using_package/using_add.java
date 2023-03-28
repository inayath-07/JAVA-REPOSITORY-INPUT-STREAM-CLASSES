package Arthamatic_operation_packages.using_package;

import java.io.*;

import Arthamatic_operation_packages.add_boilerPlate;

public class using_add 
{
    static InputStreamReader read = new InputStreamReader(System.in);
    static BufferedReader in = new BufferedReader(read);

    public static void main(String[] args)throws IOException
    {
        
        //calling sum operation
        add_boilerPlate AA = new add_boilerPlate();
        System.out.println(add_boilerPlate.sum());

        System.out.println(AA);
    }
}