package estruturaPosCondicionada;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        int i = 0;
        int idade = 0;
        int v = 0;
        		
        while (i<20) {
        System.out.print("informe a idade: ");
        idade = ler.nextInt();
          i++;
         
          if (idade >= 18) {
       	   System.out.println("Maior de idade ");
       	   v++;
          }
          
          else {
       	   System.out.println("Menor de idade");
       	  
          }
       }    System.out.println("O numero de pessoas maiores de idade é igual a: " + v);
      
       ler.close();
	}
	
    
}
