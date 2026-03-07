import java.util.Scanner;

public class Uni3Exe13 {

  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    final double valorAzulejo = 12.50;
    final int quantidadeAzulejos = 9;

    System.out.println("Informe a altura da parede (em metros):");
    double altura = teclado.nextDouble();

    System.out.println("Informe o comprimento da parede (em metros):");
    double comprimento = teclado.nextDouble();

    double areaParede = altura * comprimento;
    double valorTotal = areaParede * valorAzulejo * quantidadeAzulejos;

    System.out.println("O valor final é: R$ " + valorTotal);

    teclado.close();
  }

}
