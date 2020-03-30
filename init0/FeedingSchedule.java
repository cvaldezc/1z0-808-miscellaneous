public class FeedingSchedule {
  public static void main(String[] args) {
    boolean keepGoing = true;
    int count = 0;
    int x = 3;
    while (count++ < 3) { // first perform operasion count < 3 and after add one to count
      int y = (1 + 2 * count) % 3; // execute by precedencie, first the parentheses
      switch (y) {
        default:
        case 0: x -= 1; break; // associate cases: default and case 0 perform same actoin
        case 1: x += 5;
      }
    }
    System.out.println(x); // the output is 6
  }
}