import java.io.Console;

public class MealTime {

  public static void main(String[] args) {

    askForMeal("breakfast");
    askForMeal("lunch");
    askForMeal("dinner");

  }

  public static void askForMeal(String meal) {

    Console myConsole = System.console();

    System.out.println("What did you eat for " + meal + "?");
    String yourMeal = myConsole.readLine();
    System.out.println("You had " + yourMeal + " for " + meal + ".");

  }

}


