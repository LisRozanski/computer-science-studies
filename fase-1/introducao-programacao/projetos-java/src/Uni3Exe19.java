import java.util.Scanner;

public class Uni3Exe19 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe o salário do funcionário: ");
    double salario = teclado.nextDouble();

    System.out.println("Informe o número de meses trabalhados:");
    int meses = teclado.nextInt();

    double valorDecimo = salario * meses / 12;

    System.out.println("Valor do décimo terceiro salário: " + valorDecimo);

    teclado.close();
  }
}
