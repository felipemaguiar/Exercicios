// Escreva um aplicativo que leia cinco inteiros, além de determinar e imprimir o maior e menor inteiro
// no grupo
package exercicioCap02;

import java.util.Scanner;

public class Exe24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero01;
		int numero02;
		int numero03;
		int numero04;
		int numero05;
		int maiornumero;
		int menornumero;
		
		System.out.print("Digite o primeiro numero: ");
		numero01 = sc.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		numero02 = sc.nextInt();
		
		System.out.print("Digite o terceiro numero: ");
		numero03 = sc.nextInt();
		
		System.out.print("Digite o quarto numero: ");
		numero04 = sc.nextInt();
		
		System.out.print("Digite o quinto numero: ");
		numero05 = sc.nextInt();
		
		//Maior número		
		maiornumero = numero01;
		
		if (numero02 > maiornumero) {
			maiornumero = numero02;
		}
		if (numero03 > maiornumero) {
			maiornumero = numero03;
		}
		if (numero03 > maiornumero) {
			maiornumero = numero04;
		}
		if (numero04 > maiornumero) {
			maiornumero = numero05;
		}
		
		// Menor numero
		menornumero = numero01;
		if (numero02 < menornumero) {
			menornumero = numero02;
		}
		if (numero03 < menornumero) {
			menornumero = numero03;
		}
		if (numero03 < menornumero) {
			menornumero = numero04;
		}
		if (numero04 < menornumero) {
			menornumero = numero05;
		}
		
		
		System.out.println("O maior número é: " + maiornumero);
		System.out.println("O menor número é: " + menornumero);
		
		sc.close();
	}
}
