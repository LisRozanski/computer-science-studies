import java.util.Scanner;

public class Uni3Exe14 {

  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe a distância percorrida (km):");
    int distancia = teclado.nextInt();

    System.out.println("Informe o tempo gasto (horas):");
    int tempo = teclado.nextInt();

    double velocidadeMedia = distancia / tempo;
    double combustivelGasto = distancia / 12.0; // Consumo médio de 12 km/l

    System.out.println("A velocidade média foi de: " + velocidadeMedia + " km/h e a quantidade de combustivel usada foi de " + combustivelGasto + " litros.");

    teclado.close();
  }
}
