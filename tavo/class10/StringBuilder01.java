package class10;

// import static PrintStringBuilder.printStringBuilder;
/**
 * StringBuilder01
 */
public class StringBuilder01 {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    System.out.println("'" + sb.toString() + "'");
    System.out.println(sb.capacity());
    System.out.println(sb.length());

    PrintStringBuilder.printStringBuilder(sb);
  }
}