import java.util.Scanner;

public class Uni3Exe15 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe um valor (até 3 dígitos):");
    int valor = teclado.nextInt();

    int centenas = valor / 100;
    int dezenas = (valor % 100) / 10;
    int unidades = valor % 10;

    System.out.println("Centenas: " + centenas + ", Dezenas: " + dezenas + ", Unidades: " + unidades);

    teclado.close();
  }
}
