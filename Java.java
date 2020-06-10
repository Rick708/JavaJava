public class Java {
  public static void main(String[] args) {
    for (int i = 0; i<5; i++){
      for (int j = 0; j<5; j++){
        System.out.print("*");
        if(j == 3){
          break;
        }
      }
      System.out.println();
    } 
  }
}