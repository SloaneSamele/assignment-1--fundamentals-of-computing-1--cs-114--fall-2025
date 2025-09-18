import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {
    int base, maximum, num, num2, outputNum;

    Scanner input = new Scanner(System.in);
    
    System.out.println("Base Conversion Calculator");
    System.out.println("Please enter a number between 2-9:");
    base = input.nextInt();
    num = base - 1;
    maximum = ((num* (base * base * base)) + (num * (base * base)) + (num * base) + (num));
    
    System.out.println("The maximum base 10 number in base "+ base + " is "+ maximum + "\nPlease enter a number between 0 - " + maximum);
    num = input.nextInt();
    
    num2 = num/base;
    outputNum = num % base;
    
    outputNum = ((num2 % base) * 10) + outputNum;
    num2 = num2/base;
    outputNum = ((num2 % base) * 100) + outputNum;
    num2 = num2/base;
    outputNum = ((num2 % base) * 1000) + outputNum;
    num2 = num2/base;

    System.out.println(num +"(base 10) = " + outputNum + "(base "+ base + ")");
    input.close();
  }
}
