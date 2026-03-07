import java.util.Scanner;

public class Uni3Exe12 {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    final double valorHora = 10.00;
    final double valorDependente = 60.00;
    final double descontoInss = 8.50;
    final double descontoIr = 5.00;

    System.out.println("Informe o nome do funcionário:");
    String nome = teclado.nextLine();

    System.out.println("Informe a quantidade de horas trabalhadas no mês:");
    int horasTrabalhadas = teclado.nextInt();

    System.out.println("Informe a quantidade de dependentes do funcionário:");
    int dependentes = teclado.nextInt();

    double salarioTrabalho = (horasTrabalhadas * valorHora);
    double salarioFamila = (dependentes * valorDependente);
    double salarioBruto = salarioTrabalho + salarioFamila;
    double salarioLiquido = salarioBruto - (salarioTrabalho * descontoInss / 100) - (salarioTrabalho * descontoIr / 100);

    System.out.println("O funcionário " + nome + " possui um salário bruto de: R$" + salarioBruto + " e um salário líquido de: R$" + salarioLiquido);


    teclado.close();
  }
}
