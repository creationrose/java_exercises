import java.io.Console;

public class MealTime {

  public static void main(String[] args) {
    Console myConsole = System.console();

    askForMeal("breakfast");
    String breakfast = myConsole.readLine();
    System.out.println("You had " + breakfast + " for breakfast.");

    askForMeal("lunch");
    String lunch = myConsole.readLine();
    System.out.println("You had " + lunch + " for lunch.");

    askForMeal("dinner");
    String dinner = myConsole.readLine();
    System.out.println("You had " + dinner + " for dinner.");

  }


  public static void askForMeal(String meal) {

    System.out.println("What did you eat for " + meal + "?");

  }

}


