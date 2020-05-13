import java.util.List;
import java.util.ArrayList;

public class CastString {

  public static void main(String...args) {
    List<Integer> lst = new ArrayList<>();
    lst.add(1);
    lst.add(2);
    lst.add(3);

    try {
     System.out.print((String) lst.get(2));
    } catch(Exception ex) {
      System.out.print(ex);
    }
  }

}
