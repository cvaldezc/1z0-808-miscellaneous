import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permutaciones {

  public static void main(String...args) {
    ArrayList<Character> conjunto = new ArrayList<>();
    conjunto.add('c');
    conjunto.add('a');
    conjunto.add('t');

    escribe("", conjunto);
  }

  public static void escribe(String a, ArrayList<Character> conjunto) {
    if (conjunto.size() == 1) {
      System.out.println(a + conjunto.get(0));
    }
    for (int i = 0; i < conjunto.size(); i++) {
      Character b = conjunto.remove(i);
      escribe(a + b, conjunto);
      conjunto.add(i, b);
    }
  }

}
