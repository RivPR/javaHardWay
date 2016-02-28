import java.util.Scanner;
  public class RudeQuestions {
    public static void main( String[] args ) {

      String name, sizesh;
      int age;
      double weight, income;

      Scanner keyboard = new Scanner(System.in);

      System.out.print( "Hello. What is your name? ");
      name = keyboard.next();

      System.out.print( "Hi, " + name + "! How old are you? " );
      age = keyboard.nextInt();

      System.out.println( "So you are " + age + ", eh? That's not very old." );
      System.out.print( "How much do you weigh, " + name + "? " );
      weight = keyboard.nextDouble();

      System.out.println( weight + "! Better keep that quiet!!" );
      System.out.print( "Finally, what's your income, " + name + "? " );
      income = keyboard.nextDouble();

      System.out.print( "Hopefully that is " + income + " per hour" );
      System.out.println( " and not per year!" );
      System.out.println( name + "." );
      //Putting an Integer instead od a Double will not wreck the program since double can store int
      //Strings can hold any characters in them, even numbers.
      System.out.print( "What is your shoe size? " );
      sizesh = keyboard.next();
      System.out.println( "That is a small shoe size, " + name + ". " + sizesh + " really?" );
            System.out.print( "Well, thanks for answering my rude questions, " );
  }
}
