import java.util.Scanner;

public class Uni3Exe03 {
  public static void main(String[] args) {

    System.out.println("Infome o valor do combustível:");
    Scanner teclado = new Scanner(System.in);
    float precoCombustivel = teclado.nextFloat();

    System.out.println("Infome o valor do pagamento:");
    float valorPagamento = teclado.nextFloat();

    float totalAbastecido = valorPagamento / precoCombustivel;

    System.out.println("O motorista conseguiu colocar: " + totalAbastecido + " litros de combustível.");
    teclado.close();
  }
}