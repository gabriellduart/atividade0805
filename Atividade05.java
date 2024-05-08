package estruturaPosCondicionada;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i = 1;
		int som = 0,valor;
		
 		
        while (i<11) {
        System.out.print("informe o numero: ");
        valor = ler.nextInt();
          i++;
		som += valor;
	}
  System.out.println("A soma dos numeros é: " + som);
	}}
