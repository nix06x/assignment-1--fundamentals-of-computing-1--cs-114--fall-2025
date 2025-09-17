import java.util.Scanner;

public class Assignment1Program2 {

  public static void main(String[] args){

    System.out.println("Base Conversion Program");

    String userInput;
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter a base (2–9):");

    userInput = scan.nextLine();

    final int STARTING_NUM = 9999;
    final int BASE_NUM = (Integer.parseInt(userInput));
    int quotient = 0;
    int remainder = 0;
    int maxNumber = 0;

    int digitOne = 0;
    int digitTen = 0;
    int digitHundred = 0;
    int digitThousand = 0;

    remainder = (STARTING_NUM % BASE_NUM);
    quotient = (STARTING_NUM / BASE_NUM);

    digitOne = remainder;

    if (remainder != 0){

      remainder = (quotient % BASE_NUM);
      quotient = (quotient / BASE_NUM);

      digitTen = remainder;

      if (remainder != 0){

        remainder = (quotient % BASE_NUM);
        quotient = (quotient % BASE_NUM);

        digitHundred = remainder;

        if (remainder != 0){

          remainder = (quotient % BASE_NUM);
          quotient = (quotient % BASE_NUM);

          digitThousand = remainder;

        }

      }

    }

    maxNumber = ((digitThousand * 1000) + (digitHundred * 100) + (digitTen * 10) + (digitOne * 1));

    System.out.println("The maximum, 4-digit, base 10 number in base " + Integer.toString(BASE_NUM) + " is " + Integer.toString(maxNumber) + ".");

  }
}
