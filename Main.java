import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) 
{ 
   System.out.print( "1:wpisz imie nazwisko i wiek");
  System.out.print(System.lineSeparator());
   System.out.print( "2:wypisz  studentów");
  System.out.print(System.lineSeparator());
  Service1 s = new Service1();
  int mem =1;
  Scanner myInput = new Scanner( System.in );
  mem = myInput.nextInt();
    
   switch(mem)
  {
    case 1:
    
   
    try {

      int wiek;
      Scanner myObj = new Scanner(System.in);
      String wpis = myObj.nextLine();
      Scanner myObj2 = new Scanner(System.in);
      String wpis2 = myObj.nextLine();
      Scanner myInput2 = new Scanner( System.in );
      wiek = myInput2.nextInt();

     s.addStudent(new Student(wpis,wpis2,wiek));
            }
            
      catch (IOException e) {


        }
    break;
    case 2:
       
      try {
            var students = s.getStudents();
      for(Student current : students) 
      {
        System.out.println(current.ToString());
      }
            }
      catch (IOException e) {

    }
    break;
  }
}
}