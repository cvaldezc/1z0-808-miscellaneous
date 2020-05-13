import java.util.ArrayList;
interface Animal { public default String getName() { return null; }}
interface Mammal { public default String getName() { return null; }}

public abstract class Otter implements Mammal, Animal {
  @Override
  public String getName() {
    return "this their name";

  }

}