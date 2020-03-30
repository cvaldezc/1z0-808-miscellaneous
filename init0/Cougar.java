interface HasTail { int getTailLength(); } // modified access default is public
abstract class Puma implements HasTail {
  protected int getTailLength() {
    return 4;
  } // this point cannot assign weaker access privileges; was public
}
public class Cougar extends Puma { // class Puma cannot implement method getTailLength
  public static void main(String[] args) {
    Puma puma = new Puma(); // Abstract classes cannot be instantiated
    System.out.println(puma.getTailLength());
  }

  public int getTailLength(int length) { return 2; }
}