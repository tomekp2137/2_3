import java.util.Random;
import java.lang.Math;

class Main {
  public static void main(String[] args) {

    
     Random liczba = new Random();
    

      
    double los1 = liczba.nextInt(9);
    double los2 = liczba.nextInt(9);
    double los3 = liczba.nextInt(9);
    double los4 = liczba.nextInt(9);
    double los5 = liczba.nextInt(9);

    
    double b = 2;
    los1 = Math.pow(los1, b);
    los2 = Math.pow(los2, b);
    los3 = Math.pow(los3, b);
    los4 = Math.pow(los4, b);
    los5 = Math.pow(los5, b);

    System.out.println(los1 + los2 + los3 + los4 + los5);
     
  }
}