/**
 * Evaluate
 */
public class Evaluate {
  public static void main(String[] args) {

    boolean outOfStock;
    int quantity = Integer.parseInt(args[0]);

    if (quantity > 0) {
      outOfStock = false;
    } else {
      outOfStock = true;
    }
    if (outOfStock) {
      System.out.println("Quantity item is: " + quantity + ", Item out of Stock");
    } else {
      System.out.println("Quantity item: " + quantity);
    }
  }
}