package utilizandoSwitch;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0; // soma das notas
		int numeroDeNotas = 0;
		int contagemA = 0;
		int contagemB = 0;
		int contagemC = 0;
		int contagemD = 0;
		int contagemF = 0;
		
		System.out.printf("%s%n%s%n %s%n %s%n,", "Entre the integer grades in the range 0 - 100.", 
				"Type the end-of-file indicator to determinate input: ",
				"On UNIX/Linux/Mac OS X type <Ctrl> d the press Enter",
				"On Windows type <Ctrl> z the press Enter");
		
		while (sc.hasNext())  {
			int nota = sc.nextInt();
			total += nota;
			++numeroDeNotas;
			
			//incrementa o contador de letras de nota
			switch(nota / 10) {
				case 9:
				case 10:
					++contagemA;
					break;
					
				case 8:
					++contagemB;
					break;
					
				case 7:
					++contagemC;
					break;
					
				case 6:
					++contagemD;
					break;
					
				default:
					++contagemF;
					break;			
			}			
		}
		
		//exibindo o relatório
		System.out.printf("%nRelatório de nota: %n");
		
		// se usuário inseriu pelo menos uma nota...
		if (numeroDeNotas != 0) {
			// calcula a média de todas as notas inseridas
			double media = (double) total / numeroDeNotas;
			
			//gerar a saída de resumo de resultados
			System.out.printf("Média da classe foi %.2f%n", media);
			
			System.out.printf("%n%s %n%s %n%s %n%s %n%s %n%s ", 
				"A: "+ contagemA,
				"B: "+ contagemB,
				"C: "+ contagemC,
				"D: "+ contagemD,
				"F: "+ contagemF);
		} else {
			System.out.println("Sem notas digitadas");
		}
		
		sc.close();
	}
}
