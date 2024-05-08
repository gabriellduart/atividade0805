package estruturaPosCondicionada;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i = 1;
        int vzs;
        String nome;
        
        System.out.println("digite seu nome: ");
        nome = ler.nextLine();
        System.out.println("digite o numero de vezes que deseja reescrever o nome: ");
        vzs = ler.nextInt();
	
        while (i < vzs) {
        System.out.println(nome);
        i++;
}
}
}