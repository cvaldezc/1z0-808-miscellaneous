/**
 * MathFunctions
 */
public class MathFunctions {

  public static void addToInt(int x, int amountToAdd) {
    x = x + amountToAdd; // the execution only occurs here
  }

  public static void main(String[] args) {
    int a = 15;
    int b = 10;
    MathFunctions.addToInt(a, b); // this function no return any value;
    System.out.println(a);
  }
}