public class Assignment1Program1 {

  static String userInput = ("");

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

    System.out.println("Please enter a 5-character string:");
    userInput = System.console().readLine();

    String changedInput = new StringBuilder(userInput)
      .reverse()
      .substring(1, userInput.length() - 1);

    System.out.println(changedInput);

  }
}
