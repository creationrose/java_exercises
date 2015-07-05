import java.io.Console;

public class AlwaysOne {

  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me any number!\nI will magically change this number to one.");
    String stringNum = myConsole.readLine();

    Integer number = Integer.parseInt(stringNum);

    Integer changedNum = number/number;

    String stringNum1 = Integer.toString(changedNum);

    System.out.println("Here is the number: " + stringNum1);

  }
}