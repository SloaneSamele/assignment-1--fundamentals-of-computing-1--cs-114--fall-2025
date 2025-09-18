import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {
    int base, maxium;
    int base, maxium, num, num2, outputNum;

    Scanner input = new Scanner(System.in);
    
    System.out.println("Base Conversion Calculator");
    System.out.println("Please enter a number between 2-9:");
    base = input.nextInt();
    num = base - 1;
    maxium = ((num* (base * base * base)) + (num * (base * base)) + (num * base) + (num));
    System.out.println("The maxium base 10 number in base "+ base + " is "+ maxium + "\nPlease enter a number between 0 - " + maxium);
    num = input.nextInt();
    input.close();
  }
}
