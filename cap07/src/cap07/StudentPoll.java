package cap07;

public class StudentPoll {
	public static void main(String[] args) {
		//array das respostas dos alunos
		int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 
				2, 3, 3, 2, 14};
		// array de contadores de frequência
		int[] frequencia = new int[6];
		
		//para cada resposta, seleciona elemento de respotas e utiliza esse valor
		//como índice de frequencia para determinar elemento a incrementar
		for(int answer = 0; answer < responses.length; answer++) {
			try {
				++frequencia[responses[answer]];
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);//invoca o método toString
				System.out.printf("   responses[%d] = %d%n%n", answer, responses[answer]);
			}
		}
		
		System.out.printf("%s%12s%n", "Rating", "Frequencia");
		
		//gera saída do valor de cada elemento do array
		for(int rating = 1; rating < frequencia.length; rating++) {
			System.out.printf("%5d%10d%n", rating, frequencia[rating]);
		}
	}
}
