import java.util.Scanner;
import java.util.Random;
import java.lang.StringBuilder;

public class Assignment1Program1 {
  public static void main(String[] args) {
    String message;
    double temp;
    int randomNum;
    final int BASE = 32;
    final double CONVERSION_FACTOR = (9.0/5.0);
    
    Scanner input = new Scanner(System.in);
    Random generator = new Random();
    StringBuilder builder;

    System.out.println("  SSSS          SSSS  ");
    System.out.println("SS    SS      SS    SS");
    System.out.println("SSS           SSS     ");
    System.out.println("  SSS           SSS  ");
    System.out.println("    SSS           SSS  ");
    System.out.println("      SS            SS");
    System.out.println("SS     SS       SS     SS");
    System.out.println("   SSS             SSS  ");

    System.out.println("Enter a 5 character String:");
    message = input.nextLine();
    message = message.substring(1,4);

    builder = new StringBuilder(message);
    message = builder.reverse().toString();


    System.out.println("Enter a temperture in Farhenheit:");
    temp = input.nextFloat();
    temp = CONVERSION_FACTOR *(temp - BASE);
    
    message = temp + message;

    System.out.println("Generating Numbers....");
    randomNum = generator.nextInt(16385) + BASE;

    message = message + randomNum;

    System.out.println("Your new string is: " + message);
    input.close();
  }
}
