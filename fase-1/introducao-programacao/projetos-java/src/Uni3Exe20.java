import java.util.Scanner;

public class Uni3Exe20 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    final double valorGasolina = 5.75;
    final double valorEtanol = 4.29;

    System.out.println("Informe a quantidade de litros de gasolina:");
    double litrosGasolina = teclado.nextDouble();

    System.out.println("Informe a quantidade de litros de etanol:");
    double litrosEtanol = teclado.nextDouble();

    double valorTotalGasolina = litrosGasolina * valorGasolina;
    double valorTotalEtanol = litrosEtanol * valorEtanol;
    double valorTotal = valorTotalGasolina + valorTotalEtanol;

    System.out.println("Valor gasolina R$"+ ": " + valorTotalGasolina);
    System.out.println("Valor etanol R$"+ ": " + valorTotalEtanol);
    System.out.println("Valor total R$: " + valorTotal);

    teclado.close();
  }
}
