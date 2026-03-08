import java.util.Scanner;

public class Uni3Exe11 {
  public static void main(String[] args) {
    
    System.out.println("Informe o valor da temperatura (°C):");
    Scanner teclado = new Scanner(System.in);
    double celsius  = teclado.nextInt();

    double fahrenheit = (celsius * 9/5) + 32;

    System.out.println("A temperatura em fahrenheit é: " + fahrenheit);

    teclado.close();
  }
}
