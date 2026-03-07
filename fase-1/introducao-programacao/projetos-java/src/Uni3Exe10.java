import java.util.Scanner;

public class Uni3Exe10 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe o valor do cateto oposto:");
    int catetoOposto = teclado.nextInt();

    System.out.println("Informe o valor do cateto adjacente:");
    int catetoAdjacente = teclado.nextInt();

    double hipotenusa = Math.sqrt(Math.pow(catetoOposto, 2) + Math.pow(catetoAdjacente, 2));

    System.out.println("A hipotenusa é: " + hipotenusa);

    teclado.close();

  }
}
