import java.util.Random;
import java.util.Scanner;

public class Assignment1Program1 {

  public static void main(String[] args) {

    System.out.println("NNNNNNN        NNNNN     BBBBBBBBBBBBBBBB");
    System.out.println("NNNNNNNN       NNNNN     BBBBBBBBBBBBBBBBB");
    System.out.println("NNNNNNNNN      NNNNN     BBBBB        BBBBBB");
    System.out.println("NNNNNNNNNN     NNNNN     BBBBB         BBBBBB");
    System.out.println("NNNNNN NNNNN   NNNNN     BBBBB      BBBBBBBB");
    System.out.println("NNNNNN  NNNNN  NNNNN     BBBBBBBBBBBBBB");
    System.out.println("NNNNNN   NNNNNNNNNNN     BBBBB      BBBBBBBB");
    System.out.println("NNNNNN    NNNNNNNNNN     BBBBB         BBBBBB");
    System.out.println("NNNNNN     NNNNNNNNN     BBBBB        BBBBBB");
    System.out.println("NNNNNN      NNNNNNNN     BBBBBBBBBBBBBBBBB");
    System.out.println("NNNNNN       NNNNNNN     BBBBBBBBBBBBBBBB");

    String userInput;
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter a 5-character string:");

    userInput = scan.nextLine();

    scan.close();

    String changedInput = new StringBuilder(userInput)
      .reverse()
      .substring(1, userInput.length() - 1);

    System.out.println(changedInput);

    System.out.println("Please enter a number in Fahrenheit:");

    userInput = scan.nextLine();

    float origTemp = Float.parseFloat(userInput);

    float convertedTemp = ((origTemp - 32) * 0.555555556f);

    System.out.println(Float.toString(convertedTemp));

    Random random = new Random();

    int randomNum = random.nextInt(16,384|32);

    System.out.println("Random number generated. Continuing...");

    System.out.println("Your new string is " + Float.toString(convertedTemp) + changedInput + Integer.toString(randomNum));

  }
}
