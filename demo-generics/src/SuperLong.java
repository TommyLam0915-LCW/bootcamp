package src;

public class SuperLong extends Number implements Swim {

  @Override
  public double doubleValue(){
    return (double) super.shortValue();
  }

  @Override
  public int intValue(){
    return (int) super.shortValue();
  }
  @Override
  public float floatValue(){
    return (float) super.shortValue();
  }

  @Override
  public long longValue(){
    return (long) super.shortValue();
  }

  @Override
  public void swim(){
    System.out.println("I'm swimming ...");
  }
}
