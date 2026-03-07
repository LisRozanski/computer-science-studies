import java.util.Scanner;

public class Uni3Exe06 {

  public static void main(String[] args) {

    final double pesoPrato = 0.75;
    final double valorKg = 25.00;

    System.out.println("Infome o peso (kg) do prato:");
    Scanner teclado = new Scanner(System.in);
    double pesoComida = teclado.nextDouble();

    double valorTotal = valorKg * (pesoComida - pesoPrato);

    System.out.println("O valor do prato do cliente é R$ " + valorTotal);

    teclado.close();
  }
}