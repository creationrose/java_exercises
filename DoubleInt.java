import java.io.Console;

public class DoubleInt {
  public static void main(String[] args) {

    Console myConsole = System.console();
    System.out.println("Give me a number, I will duplicate it!");
    String stringNum =  myConsole.readLine();

    Integer number = Integer.parseInt(stringNum);
    Integer doubledNumber = number * 2;

    String stringDoubledNumber = Integer.toString(doubledNumber);
    System.out.println("Your doubled number is: " + stringDoubledNumber);
  }

}

