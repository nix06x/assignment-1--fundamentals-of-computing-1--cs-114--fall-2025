import java.util.Scanner;

public class Assignment1Program2 {

  public static void main(String[] args){

    System.out.println("Base Conversion Program");

    String userInput;
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter a base (2–9):");

    userInput = scan.nextLine();

    scan.close();

    final int BASE_NUM = (Integer.parseInt(userInput));
    final int BASE_MAX = (BASE_NUM - 1);

    double maxNumber = ((BASE_MAX * (Math.pow(BASE_NUM, 3))) + (BASE_MAX * (Math.pow(BASE_NUM, 2))) + (BASE_MAX * (Math.pow(BASE_NUM, 1))) + (BASE_MAX * (Math.pow(BASE_NUM, 0))));

    System.out.println("The maximum, 4-digit, base 10 number in base " + Integer.toString(BASE_NUM) + " is " + Double.toString(maxNumber) + ".");

  }
}
