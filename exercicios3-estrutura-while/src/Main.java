import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		/*Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura de senha 
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta � o valor 2002.*/
	int senha = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite a senha: ");
	senha = sc.nextInt();
	
	while(senha!=2002) {
		System.out.println("Senha Incorreta");
		System.out.println("Digite a senha Novamente: ");
		senha = sc.nextInt();
	}
	System.out.println("Acesso Aprovado!");
	sc.close();
	}
}
