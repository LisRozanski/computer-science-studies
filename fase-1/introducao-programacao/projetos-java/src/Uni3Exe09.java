import java.util.Scanner;

public class Uni3Exe09 {
  public static void main(String[] args) {
    
    final double pi = Math.PI;

    System.out.println("Informe o valor do raio da lata de óleo:");
    Scanner teclado = new Scanner(System.in);
    double raio = teclado.nextDouble();

    System.out.println("Informe o valor da altura da lata de óleo:");
    double altura = teclado.nextDouble();

    double volume = pi * Math.pow(raio, 2) * altura;
    System.out.println("O volume da lata de óleo é: " + volume);

    teclado.close();
  }
}
