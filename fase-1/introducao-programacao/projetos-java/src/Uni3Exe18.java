import java.util.Scanner;

public class Uni3Exe18 {
  public static void main(String[] args) {
      
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe a distância percorrida em quilômetros: ");
    double distancia = teclado.nextDouble();

    System.out.println("Informe o tempo gasto em minutos:");
    int tempo = teclado.nextInt();

    double tempoHoras = tempo / 60.0;
    double velocidadeMedia = distancia / tempoHoras;
    double ritmoMedio = tempo / distancia;

    System.out.println("Tempo em horas: " + tempoHoras);
    System.out.println("Velocidade média: " + velocidadeMedia + " km/h");
    System.out.println("Ritmo médio: " + ritmoMedio + " min/km");

    teclado.close();
      
  }
}
