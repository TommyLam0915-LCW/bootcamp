import java.util.Objects;

public class Customer {
  private String name;

  public Customer(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Customer)) {
      return false;
    }
    Customer other = (Customer) obj;
    return Objects.equals(this.name, other.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name);
  }

  @Override
  public String toString() {
    return "Customer{" +
            "name='" + getName() + '\'' +
            '}';
  }
}

