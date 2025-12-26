public class Person {
  private String name;
  private int age;
  public String color;
  private Home residence;
  private int weight;
  private int height;
  
  public Person(String moniker, int age, String color, Home residence, int weight, int height) {
    name = moniker;
    this.age = age;
    this.color = color;
    this.residence = residence;
    this.weight = weight;
    this.height = height;
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
  public String fatOrSkinny () {
    if (weight > 200) {
      return "You're a wee bit fat.";
    } else { 
      return "Quite skinny";
    }
  }

  public String tallOrShort () {
    if (height > 100) {
      return "tall guy";
    } else {
      return "short";
    }
  }
  public String tallerThan (int cutoff){
    if (height > cutoff) {
      return "yes";
    } else{
      return "no";
    }
  }

  public String getHomeAddress() {
    return residence.getAddress();
  }

  public static void main(String[] args) {
    System.out.println("Hello world");

    Home gAndG = new Home("1476 Aaron Dr", 8, 3000);
    Person guy = new Person("John Doe", 18, "blue",gAndG, 67000, 32);

    System.out.println("Person's name: " + guy.getName());

    System.out.println("Person's Age: " + guy.getAge());
    
    System.out.println("Favorite Color: " + guy.color);

    System.out.println("Address: " + guy.getHomeAddress());

    System.out.println(guy.fatOrSkinny());
    
    System.out.println(guy.tallerThan(43));
    
    System.out.println(guy.tallOrShort());


      for(int i = 10; i > 0; i = i - 2) {
        System.out.println(i);
      }

/*      int i = 0;
     while (i < 10) {
      System.out.println(i);
      i = i + 2;
     } */
    
  }
}
