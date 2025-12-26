public class Person {
  private String name;
  private int age;
  public String color;
  
  public Person(String moniker, int age, String color) {
    name = moniker;
    this.age = age;
    this.color = color;
  }

  public void setName (String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public int getAge () {
    return age;
  }

  public static void main(String[] args) {
    System.out.println("Hello world");
    Person guy = new Person("John Doe", 18, "blue");

    System.out.println("Person's name: " + guy.getName());

    System.out.println("Person's Age: " + guy.getAge());
    
    System.out.println("Favorite Color: " + guy.color);

    guy.setName( "Mike");
    System.out.println("Person's name: " + guy.getName());

  }
}
