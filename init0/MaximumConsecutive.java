/**
 * MaximumConsecutive
 */
public class MaximumConsecutive {

  public static void main(String[] args) {
    byte[] binary = { 0, 0, 0, 0, 1, 1 };
    int zero = maxConsecutive(binary, (byte) 0);
    int one = maxConsecutive(binary, (byte) 1);
    if (zero > one) {
      System.out.println("0s " + zero);
    } else {
      System.out.println("1s " + one);
    }
  }

  private static int maxConsecutive(byte[] arr, byte value) {
    int counter = 0;
    int consecutive = 0;

    for (byte item : arr) {
      if (value == item) {
        counter++;
        consecutive = Math.max(counter, consecutive);
      } else {
        counter = 0;
      }
    }
    return consecutive;
  }
}