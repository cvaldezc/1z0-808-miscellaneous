import java.util.List;
import java.util.LinkedList;

public class Consecutive {

  public static void main(String... args) {

    byte[] binary = { 1, 1, 0, 0, 0, 1 };
    byte last = -1;
    List<Byte> consFirst = new LinkedList<>();
    List<Byte> consSecond = new LinkedList<>();
    byte[] counter = { 0, 0 };
    for (byte i = 0; i < binary.length; i++) {
      if ((byte) 0 == binary[i]) {
        counter[0]++;
      } else {
        counter[1]++;
      }
      if (last != -1) {
        if (last != binary[i] || i == (binary.length - 1)) {
          if (last == 0) {
            consFirst.add(counter[0]);
            counter[0] = 0;
          }
          if (last == 1) {
            consSecond.add(counter[1]);
            counter[1] = 0;
          }
        }
      }
      last = binary[i];
    }

    byte zero = greatByte(consFirst);
    byte one = greatByte(consSecond);
    if (zero > one) {
      System.out.println("0st " + zero);
    }

    if (one > zero) {
      System.out.println("1st " + one);
    }

  }

  private static byte greatByte(List<Byte> lst) {

    byte aux = 0;
    for (Byte item : lst) {
      if (item > aux) {
        aux = item;
      }

    }
    return aux;
  }

}
