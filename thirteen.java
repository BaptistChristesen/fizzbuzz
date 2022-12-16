import java.io.*;
import java.util.*;

/**
 * Write a description of class thirteen here.
 *
 * @author (your name)
 * @version (today's date)
 */
public class thirteen extends ThirteenException
{
    
    
    public static void main (String[] args) throws ThirteenException{
    while (true){
        Scanner reader = new Scanner(System.in);
        System.out.println("enter a string");
        String string = reader.nextLine();
        if(string.length() == 13){
            throw new ThirteenException("jaden will throw clips at you now.");
        }
        else{
            System.out.println("String length is " + string.length() + " characters long");
        }
    }
}
    }

