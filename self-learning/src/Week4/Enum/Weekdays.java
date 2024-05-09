package Week4.Enum;

//Benefits of enum 
// 1. Make the code more readable 
// 2. Allow for compile-time checking 
// 3. Document the list of accepted value upfront 
// 4. Avoid unexpected behavior due to invalid values being passed in (type-safe)

public enum Weekdays {
  MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5);

  private int dayNumber;

  private Weekdays(int dayNumber) {
    this.dayNumber = dayNumber;
  }
}


