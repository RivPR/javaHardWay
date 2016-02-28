import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, inch, feet, pounds, m2, m3;

    System.out.print( "Your height in feet(only): ");
    feet = keyboard.nextInt();
    System.out.print( "Your height (inches): " );
    inch = keyboard.nextDouble();

    m2 = feet * 0.3048;
    m3 = inch * 0.0254;
    //used m2 and m3 to change feet and inches into meters first and then I added them
    m = m2 + m3;


    System.out.print( "Your weight in pounds: " );
    pounds = keyboard.nextDouble();

    kg = pounds / 2.2046;
    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );
}
}
