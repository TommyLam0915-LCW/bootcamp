import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Employee {
  private String name;
  private String department;
  private double salary;

  public Employee(String name, String department, double salary) {
    this.name = name;
    this.department = department;
    this.salary = salary;
  }

  // Getter methods

  public double getSalary() {
    return this.salary;
  }

  public String getDepartment() {
    return this.department;
  }

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("Alice", "HR", 60000));
    employees.add(new Employee("Bob", "IT", 60000));
    employees.add(new Employee("Carol", "Finance", 60000));
    employees.add(new Employee("David", "HR", 60000));
    employees.add(new Employee("Jenny", "IT", 60000));

    // Stream
    // 1. Filter out salary >= 60000 and department = "IT"
    List<Employee> result = employees.stream()
        .filter(e -> e.getSalary() >= 60000 && e.getDepartment().equals("IT"))
        .collect(Collectors.toList());
    System.out.println(result);

    // 2. Map the name of the result set to a list of strings
    List<String> names =
        result.stream().map(Employee::getName).collect(Collectors.toList());
    System.out.println(names);
  }
}
