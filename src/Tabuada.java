import java.security.SecureRandom;
import java.util.Scanner;

public class Tabuada {
	private SecureRandom numeroAleatorio;
	private Scanner entrada;
	private int numero1;
	private int numero2;
	
	private final String CORRETO = "Muito bem!";
	private final String ERRADO = "Errado! Por favor, tente novamente.";
	private final String SAIR = "Encerrando tabuada.";
	
	public Tabuada() {
		numeroAleatorio = new SecureRandom();
		entrada = new Scanner(System.in);
	}
	
	public void jogar() {
		System.out.println("Tabuada");
		
		geraNumeros();
		
		System.out.print(pergunta());
		
		int resposta = numero1 * numero2;
		int respostaUsuario = entrada.nextInt();
		
		while (respostaUsuario != 0) {
			while (resposta != respostaUsuario) {
				System.out.println(ERRADO);
				System.out.print(pergunta());
				respostaUsuario = entrada.nextInt();
			}
			System.out.println(CORRETO);
			geraNumeros();
			resposta = numero1 * numero2;
			System.out.print(pergunta());
			respostaUsuario = entrada.nextInt();
		}
		
		System.out.println(SAIR);
	}
	
	private void geraNumeros() {
		numero1 = 1 + numeroAleatorio.nextInt(10);
		numero2 = 1 + numeroAleatorio.nextInt(10);
	}
	
	private String pergunta() {
		return String.format("Quanto é %d vezes %d? (0 para sair) ", numero1, numero2);
	}
}
