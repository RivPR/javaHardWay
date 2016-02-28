public class CreatingVariables {
  public static void main( String[] args ) {
    int x, y, age, height;
    double seconds, e, checking, balance;
    String firstName, lastName, title, notenough, comeagain;

    x = 10;
    y = 400;
    age = 39;
    height = 51;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    balance = 1.07;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    notenough = " ***We apologize but you are not tall enough and do not have enough funds.*** ";
    comeagain = "Please, do come back again!";

    System.out.println( " The variable x contains " + x );
    System.out.println( " The value " + y + " is stored in the variable y." );
    System.out.println( " The experiment took " + seconds + " seconds." );
    System.out.println( " A favorite irrational # is Euler's number: " + e );
    System.out.println( " My name's " + title + " " + firstName + " " + lastName + "and I'm " + height + " inches tall." );
    System.out.println( " Hopefully you have more than $" + checking + "!" );
    System.out.println( " Your balance is " + balance + "." );
    System.out.println( notenough );
    System.out.println( comeagain );
  }
}
