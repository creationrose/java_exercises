import java.io.Console;

public class FavoriteColor {

  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("What is your favorite color?");
    String favoriteColor = myConsole.readLine();

    System.out.println("What is your favorite drink?");
    String favoriteDrink = myConsole.readLine();

    System.out.println("What is your favorite fruit?");
    String favoriteFruit = myConsole.readLine();


    System.out.println("Your favorite color is " + favoriteColor +
                       ", your favorite drink is " + favoriteDrink +
                       ", and your favorite fruit is " + favoriteFruit + ". That's great!");


  }
}


