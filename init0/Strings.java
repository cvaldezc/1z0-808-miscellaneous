public class Strings {

  public static void main(String ... args) {
    String s1 = "Java";
    String s2 = "Java";
    StringBuilder sb1 = new StringBuilder();
    sb1.append("Ja").append("va");
    System.out.println(s1 == s2); // here be compare memory address
    System.out.println(s1.equals(s2)); // here be evaluate content comparison
    System.out.println(sb1.toString() == s1); // here be compare memory address
    System.out.println(sb1.toString().equals(s1)); // here be evaluate content comparison
  }
}