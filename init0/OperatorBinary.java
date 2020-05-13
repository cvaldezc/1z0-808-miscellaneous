/**
 * OperatorBinary
 */
public class OperatorBinary {

  public static void main(String[] args) {
    byte a = 5;

    byte b = 127;

    System.out.println("a&b: " + (a & b));

    System.out.println("a|b: " + (a | b));

    System.out.println("a^b: " + (a ^ b));
    System.out.println("~a: " + (~a));

  }
}