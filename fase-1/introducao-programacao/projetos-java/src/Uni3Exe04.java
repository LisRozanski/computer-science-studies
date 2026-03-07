import java.util.Scanner;
public class Uni3Exe04 {

  public static void main(String[] args) {

    final int pesoNotaUm = 5;
    final int pesoNotaDois = 3;
    final int pesoNotaTres = 2;

    System.out.println("Infome o valor da primeira nota do aluno:");
    Scanner teclado = new Scanner(System.in);
    float notaUm = teclado.nextFloat();

    System.out.println("Infome o valor da segunda nota do aluno:");
    float notaDois = teclado.nextFloat();

    System.out.println("Infome o valor da terceira nota do aluno:");
    float notaTres = teclado.nextFloat();

    float mediaPonderada = ((notaUm * pesoNotaUm) + (notaDois * pesoNotaDois) + (notaTres * pesoNotaTres)) / (pesoNotaUm + pesoNotaDois + pesoNotaTres);

    System.out.println("A média ponderada do aluno é: " + mediaPonderada);

    teclado.close();
  }
}