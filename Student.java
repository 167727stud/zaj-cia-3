public class Student {

  private String Name;
  private int Age;
  private String Sur;

  public Student(String name ,String sur, int age) {
    Name = name;
    Age = age;
    Sur = sur;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
  public String GetSur() {return Sur;}

  public String ToString() {
    return Name + " " + Sur + " " + Integer.toString(Age);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 3) 
      return new Student("Parse Error","Parse Error", -1);
    return new Student(data[0],data[1], Integer.parseInt(data[2]));
  }
}