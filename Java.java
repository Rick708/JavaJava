import java.io.Console;

public class Java {
  public static void main(String[] args) throws Exception{
    Console console = System.console();
    int a = Integer.parseInt(console.readLine());
    if(10 < a){
      System.out.println("大きい");   
    }
  }
}