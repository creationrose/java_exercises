import java.io.Console;

public class Noun {

  public static void main(String[] args) {

    Console myFakeTerminal = System.console();

    System.out.println("Enter a noun: ");
    String noun1 = myFakeTerminal.readLine();

    System.out.println("Enter an adjective: ");
    String adjective1 = myFakeTerminal.readLine();


    System.out.println("You chose " + noun1 + " for a noun and "
                       + adjective1 + " for an adjective. Nice work!");


  }
}