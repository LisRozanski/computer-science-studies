import java.util.Scanner;

public class Uni3Exe17 {
  public static void main(String[] args) {
      
    Scanner teclado = new Scanner(System.in);

    final double precoCamiseta = 35.00;
    final double valorDesconto = 0.10;


    System.out.println("Informe a quantidade de camisetas:");
    int qtdCamisetas = teclado.nextInt();

    double valorTotal = precoCamiseta * qtdCamisetas;
    double valorTotalDesconto = valorTotal * valorDesconto;
    double valorFinal = valorTotal - valorTotalDesconto;

    System.out.println("Valor total R$:"+ valorTotal);
    System.out.println("Desconto Aplicado R$:"+ valorTotalDesconto);
    System.out.println("Valor final R$:"+ valorFinal);

    teclado.close();
  }
}
