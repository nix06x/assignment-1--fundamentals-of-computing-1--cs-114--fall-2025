import java.util.Scanner;

public class Assignment1Program2 {

  public static void main(String[] args){

    System.out.println("Base Conversion Program");

    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter a base (2–9):");

    final int BASE_NUM = scan.nextInt();
    final int BASE_MAX = (BASE_NUM - 1);

    int maxNumber = (int) ((BASE_MAX * (Math.pow(BASE_NUM, 3))) + (BASE_MAX * (Math.pow(BASE_NUM, 2))) + (BASE_MAX * (Math.pow(BASE_NUM, 1))) + (BASE_MAX * (Math.pow(BASE_NUM, 0))));

    System.out.println("The maximum, 4-digit, base 10 number in base " + Integer.toString(BASE_NUM) + " is " + Integer.toString(maxNumber) + ".");

    System.out.println("Now, enter a base 10 number in the range 0 to " + Integer.toString(maxNumber) + " to convert:");

    int INPUT_NUM = scan.nextInt();
    int quotient = 0;
    int remainder = 0;

    scan.close();

    int digitOne = 0;
    int digitTen = 0;
    int digitHundred = 0;
    int digitThousand = 0;

    remainder = (INPUT_NUM % BASE_NUM);
    quotient = (INPUT_NUM / BASE_NUM);

    digitOne = remainder;

    remainder = (quotient % BASE_NUM);
    quotient = (quotient / BASE_NUM);

    digitTen = remainder;

    remainder = (quotient % BASE_NUM);
    quotient = (quotient / BASE_NUM);

    digitHundred = remainder;

    remainder = (quotient % BASE_NUM);
    quotient = (quotient / BASE_NUM);

    digitThousand = remainder;

    int convertedNum = ((digitThousand * 1000) + (digitHundred * 100) + (digitTen * 10) + (digitOne));

    String formattedConvNum = (String.format("%04d", convertedNum));

    System.out.println(Integer.toString(INPUT_NUM) + " (base 10) = " + formattedConvNum + " (base " + Integer.toString(BASE_NUM) + ")");

  }
}
