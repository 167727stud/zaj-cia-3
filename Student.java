public class Student {

  private String Name;
  private int Age;
  private String Sur;
  private String Dat;

  public Student(String name, String sur, int age, String dat){
    Name = name;
    Sur = sur;
    Age = age;
    Dat = dat;
  }

  public String GetName() {return Name;}
  public String GetSur() {return Sur;}
  public int GetAge() {return Age;}
  public String GetDat() {return Dat;}

  public String ToString() {
    return Name + " " + Sur + " " + Integer.toString(Age) + " " + Dat;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse Error", "Parse Error", -1, "Parse Error");
    return new Student(data[0], data[1], Integer.parseInt(data[2]), data[3]);
  }
}
