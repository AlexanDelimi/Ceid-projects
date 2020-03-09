import java.io.*;
public class main{
public static void main(String[] args)
 {int x=getNumber();
   int y =getNumber();
   int z =getNumber();
    try {
      System.out.println(3*(x-1)*y/(x-2*z));
   
   }
  catch( ArithmeticException de)
  {
   System.out.println(de);

  }
}
public static int getNumber() {
String line;
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Δώσε αριθμό:");
try 
{line= br.readLine();
return Integer.parseInt(line); 
}
catch (IOException e) 
{System.out.println(e);
}
catch (NumberFormatException fe) 
{
System.out.println(fe);
} 
return 0;
}
}



















