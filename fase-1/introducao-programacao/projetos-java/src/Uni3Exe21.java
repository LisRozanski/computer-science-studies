import java.util.Scanner;

public class Uni3Exe21 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe a altura em metros: ");
    float altura = teclado.nextFloat();

    System.out.println("Informe o peso em kg: ");
    float peso = teclado.nextFloat();

    float imc = peso / (altura * altura);

    System.out.println("O IMC da pessoa é: " + imc);

    teclado.close();
  }
}
