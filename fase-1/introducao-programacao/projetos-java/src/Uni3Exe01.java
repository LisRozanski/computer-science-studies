import java.util.Scanner;

public class Uni3Exe01 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite a largura do terreno: ");
		int largura = teclado.nextInt();

		System.out.print("Digite o comprimento do terreno: ");
		int comprimento = teclado.nextInt();

		int area = largura * comprimento;

		System.out.println("A área do terreno é: " + area + " metros quadrados.");

		teclado.close();
	}
}