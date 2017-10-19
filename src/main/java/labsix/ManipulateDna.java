package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


/**
 * This class finds a dna String.
 * The program will find the complement of the string and input more values.
 *
 * <p>Bugs: This program has no known bugs, but is missing code.
 *
 * @author Gregor M. Kapfhammer
 */

public class ManipulateDna {

  /**
  *  The main method will input values from a file and display the complement.
  *  The program will display the dna String, using some methods that are 
  *  provided by
  *  another Java class.
  *
  *  @author Gregory M. Kapfhammer
  */
  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Lamar Todd " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string
    String dna = scanner.nextLine();
    System.out.println("Okay, I am going to manipulate the Dna string " + dna);
    // Step Two: Compute the complement of the DNA String
    String sequence = dna;
    sequence = sequence.replace('A' , 't');
    sequence = sequence.replace('C' , 'g');
    sequence = sequence.replace('T' , 'a');
    sequence = sequence.replace('G' , 'c');
 
    sequence = sequence.toUpperCase();    


    System.out.println("Enter a string containing only C, G, T, and A: " + dna);
    System.out.println("Complement of: " + dna + " is " + sequence);

    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    Random random = new Random();
    char randomCharacter = dna.charAt(random.nextInt(4));
    int randomInt = random.nextInt(4);
    String first = dna.substring(0, randomInt) + randomCharacter 
        + dna.substring(randomInt);
    System.out.println("Inserting " + randomCharacter + " at position " 
        + randomInt + " gives " + first);



    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    String two = ("" + dna.substring(0, randomInt) + dna.substring(randomInt + 1, dna.length()));
   

    System.out.println("Deleting from position " + randomInt
        + " gives " + two);

    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
    char randomReplace = dna.charAt(random.nextInt(4));
    int randomIntegerTwo = random.nextInt(4);
    String three = ("" + dna.substring(0, randomIntegerTwo) + randomReplace 
        + dna.substring(randomInt + 1));

    System.out.println("Changing position " + randomInt 
        + " gives " + three);
    
    // Step Six: Display a final thankyou message
    System.out.println("Thanks for using the Manipulation program. ");
    System.out.println("Have an great day. ");
  }

}
