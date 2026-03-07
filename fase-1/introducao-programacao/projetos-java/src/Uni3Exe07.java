import java.util.Scanner;

public class Uni3Exe07 {
  public static void main(String[] args) {
      
    int lataRefri = 350;
    int garrafaRefri = 600;
    int garrafa2Refri = 2000;

    System.out.println("Infome a quantidade de latas de 350ml:");
    Scanner teclado = new Scanner(System.in);
    int quantidadeLata = teclado.nextInt();

    System.out.println("Infome a quantidade de garrafas de 600ml:");
    int quantidadeGarrafa = teclado.nextInt();

    System.out.println("Infome a quantidade de garrafas de 2 litros:");
    int quantidadeGarrafa2 = teclado.nextInt();

    float totalLitros = ((quantidadeLata * lataRefri) + (quantidadeGarrafa * garrafaRefri) + (quantidadeGarrafa2 * garrafa2Refri)) / 1000f;
    System.out.println("O cliente comprou ao total: " + totalLitros + " litros.");

    teclado.close();

  }
}