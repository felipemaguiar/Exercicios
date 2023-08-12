//Elabore um programa completo que calcule e imprima o produto de três inteiros

package exercicioCap02;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero01;
		int numero02;
		int numero03;
		int produto;
		
		System.out.print("Entre com o primeiro numero: ");
		numero01 = sc.nextInt();
		
		System.out.print("Entre com o segundo numero: ");
		numero02 = sc.nextInt();
		
		System.out.print("Entre com o terceiro numero: ");
		numero03 = sc.nextInt();
		
		produto = numero01 * numero02 * numero03;
		
		System.out.printf("O produto é: %d%n", produto);

				
		
		sc.close();

	}

}
