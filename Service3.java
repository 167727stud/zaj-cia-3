
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Service3 {

    public static void poszukajse(String fileName,String wyszukiwana) throws FileNotFoundException{
        Scanner scan = new Scanner(new File(fileName));
        while(scan.hasNext()){
            String line = scan.nextLine().toLowerCase().toString();
            if(line.contains(wyszukiwana)){
                System.out.println(line);
            }
        }
    }


    public static void service3() throws FileNotFoundException{
        System.out.print("Kogo chcesz wyszukać");
       System.out.print(System.lineSeparator());
       System.out.print(System.lineSeparator());
        Scanner myObj = new Scanner(System.in);
        String wysz = myObj.nextLine();
        
      try {

        Service3 fileSearch = new Service3();
        fileSearch.poszukajse("names.txt", wysz);
        }
    catch (FileNotFoundException e)  
    {
         System.out.println(wysz);
    }
    }


}