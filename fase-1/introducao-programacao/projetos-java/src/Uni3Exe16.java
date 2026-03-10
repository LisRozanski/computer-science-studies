import java.util.Scanner;

public class Uni3Exe16 {

  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe o valor total da compra:");
    int valorCompra = teclado.nextInt();

    System.out.println("Informe o valor pago pelo cliente:");
    int valorPago = teclado.nextInt();

    int valorTroco = valorPago - valorCompra;

    int notas100 = valorTroco / 100;
    int notas10 = (valorTroco % 100) / 10;
    int notas1 = valorTroco % 10;
    int totalNotas = notas100 + notas10 + notas1;

    System.out.println("O número mínimo de notas de troco é: " + totalNotas);
    System.out.println("Quantidade de notas de 100: " + notas100 + "\n Quantidade de notas de 10: " + notas10 + "\n Quantidade de notas de 1: " + notas1);

    teclado.close();
  }
}
