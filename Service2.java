import java.io.*;  
public class Service2  
{  
public static void service2()  
{  
try  
{  
File file=new File("db.txt");   
FileReader fr=new FileReader(file); 
BufferedReader br=new BufferedReader(fr);  
StringBuffer sb=new StringBuffer();   
String line;  
while((line=br.readLine())!=null)  
{  
sb.append(line);   
sb.append("\n");     
}  
fr.close();
System.out.println(sb.toString()); 
}  
catch(IOException e)  
{  
e.printStackTrace();  
}  
}  
}  