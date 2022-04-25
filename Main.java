import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) 
{ 
   System.out.print( "1:wpisz imie nazwisko i wiek");
  System.out.print(System.lineSeparator());
   System.out.print( "2:wypisz  studentów");
  System.out.print(System.lineSeparator());
     System.out.print( "3:Wypisuje studentów ale działa w przeciwieństwie do case 2");
  System.out.print(System.lineSeparator());
       System.out.print( "4:Wypisuje studentów ale działa w przeciwieństwie do case 2");
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
      Scanner myObj3 = new Scanner(System.in);
      String wpis3 = myObj.nextLine();

     s.addStudent(new Student(wpis,wpis2,wiek,wpis3));
            }
            
      catch (IOException e) {


        }
    break;
    case 2:
       
    try {
      Service1 service1 = new Service1();
      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
    } catch (IOException e) {

    }
      case 3:
      {
        Service2.service2();
      }
      
      break;
  }
   
  }
}
