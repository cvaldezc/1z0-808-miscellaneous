/**
 * Swan
 */
public class Swan {

  int numberEggs;
  public String name;

  public void Swan() {
    name = "Duke";
    Integer j = null;
    int i = j;
  }

  public static void main(String[] args) {
    Swan mother = new Swan();
    String model;
    mother.numberEggs = 1;
    {
      System.out.println(mother.numberEggs);
      System.out.println(mother.name);
    }
  }
}
