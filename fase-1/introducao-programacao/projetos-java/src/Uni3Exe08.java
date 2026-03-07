import java.util.Scanner;

public class Uni3Exe08 {
  public static void main(String[] args) {
      
    final double valorDolar = 5.65;

    System.out.println("Valor em dólares recebido pelo cliente:");
    Scanner teclado = new Scanner(System.in);
    double valorDolarCliente = teclado.nextDouble();

    double valorRealCliente = valorDolarCliente * valorDolar;

    System.out.println("O atendente deve devolver R$" + valorRealCliente + " para o cliente.");

    teclado.close();
  }
}