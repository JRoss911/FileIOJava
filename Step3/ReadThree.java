package Step3;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadThree
{
    public static void main(String[] args)
    {
        try{
            System.out.print("Writing to file ... ");
            // Create the file to write to
            PrintWriter fileOut = new PrintWriter("Hello?");
            // Write text just like we would to the console
            fileOut.println("Hi, my name is");
            // Clode out file
            fileOut.close();  

            System.out.println("fricky-");
            
            // Read in file to verify it
            Scanner fileIn = new Scanner(new File("output.txt"));
            
            System.out.println("fricky");
            while (fileIn.hasNext()) 
            {
                String lineIn = fileIn.nextLine(); 
                System.out.println(lineIn);
            }
            System.out.println("Slim shady!");
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
