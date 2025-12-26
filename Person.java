public class Person {
  private String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public static void main(String[] args) {
    System.out.println("Hello world");
    Person person = new Person("John Doe");

    System.out.println("Person's name: " + person.getName());
  }
}
