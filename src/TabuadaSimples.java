import java.security.SecureRandom;
import java.util.Scanner;

public class TabuadaSimples {

	public static void main(String[] args) {
		SecureRandom numeroAleatorio = new SecureRandom();
		Scanner entrada = new Scanner(System.in);
		// loop infinito
		while(true) {
		// gera 2 números aleatórios n1 e n2
			int n1 = 1 + numeroAleatorio.nextInt(10);
			int n2 = 1 + numeroAleatorio.nextInt(10);
		// pergunta conta para o usuario
			System.out.printf("Quanto é %d vezes %d? ", n1, n2);
		// obtem resposta do usuario
			int resposta = entrada.nextInt();
		// se resposta == n1 * n2 imprime muito bem
			if (resposta == (n1 * n2))
				System.out.println("Muito bem!");
		// senão
			else {
		//    enquanto resposta estiver errada
				while (resposta != (n1 * n2)) {
		//       imprime "Errado, por favor tente novamente"
					System.out.println("Errado, por favor, tente novamente.");
		//       imprime pergunta
					System.out.printf("Quanto é %d vezes %d? ", n1, n2);
		//       obtem resposta do usuario
					resposta = entrada.nextInt();
		//    fim enquanto
				}
				System.out.println("Muito bem!");
		// fim se
			}
		}
	}

}
