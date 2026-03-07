import java.util.Scanner;

public class Uni3Exe05 {
  public static void main(String[] args) {

    final double anelChipValor = 4.00;
    final double anelAlimentoValor = 3.50;

    System.out.println("Infome o o total de frangos da granja:");
    Scanner teclado = new Scanner(System.in);
    int totalGranja = teclado.nextInt();

    double valorTotalAnelChip = totalGranja * anelChipValor;
    double valorTotalAnelAlimento = totalGranja * (anelAlimentoValor * 2);
    double valorTotalGastos = valorTotalAnelChip + valorTotalAnelAlimento;

    System.out.println("O gasto total para marcar " + totalGranja + " frangos é R$ " + valorTotalGastos);

    teclado.close();
  }
}