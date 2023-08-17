package cap07;

public class GradeBook {

	private String nomeCurso;
	private int[] notas;
	
	
	//construtor
	public GradeBook(String nomeCurso, int[] notas) {
		this.nomeCurso = nomeCurso;
		this.notas = notas;
	}


	public String getNomeCurso() {
		return nomeCurso;
	}


	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}


	//realiza vária operações nos dados
	public void processoNotas() {
		//gerar saída de array de notas
		saidaNotas();
		
		//chama método getMedia para calcular a nota media
		System.out.printf("%nMédia da classe é %.2f%n", getMedia());
		
		//chama métodos getMinimum e getMaximum
		System.out.printf("A nota mais baixa é %d%nA nota mais alta é %d%n%n", getMinimo(), getMaximo());
		
		//chama saida graficos de barras para imprimir
		saidaGraficoBarras();
	}
	
	//localiza nota mínima
	public int getMinimo() {
		int menorNota = notas[0];//supõe que nota[0] é a menor nota
		//faz um loope pelo array de notas
		for(int nota : notas) {
			//se nota for mais baixa que menorNota, atribui essa nota a menorNota
			if(nota < menorNota) {
				menorNota = nota; //Nova nota mais baixa
			}
		}
		return menorNota;
	}
	
	//localiza nota máxima
	public int getMaximo() {
		int maiorNota = notas[0]; //supões que a nota[0] é a maior nota
		// faz um loop pelo array de notas
		for (int nota: notas) {
			//se nota for mais alta que a maiorNota, atribui essa a nota a maiorNota
			if(nota > maiorNota) {
				maiorNota = nota;//Atribui a nota nota mais alta
			}
		}
		return maiorNota;
	}
	
	//determina a média para o teste
	public double getMedia() {
		int total = 0;
		// soma notas de aluno
		for(int nota : notas) {
			total += nota;
		}
		return (double) total / notas.length;
	}
	
	// gera saida do gráfico de barras exibindo distribuição de notas
	public void saidaGraficoBarras() {
		System.out.println("Distribuição de notas:");
		
		//armazena frequência de notas em cada intervalo de 10 notas
		int[] frequencia = new int[11];
		
		//para cada nota, inscrementa a frequência apropriada
		for(int nota : notas) {
			++frequencia[nota / 10];
		}
		
		//para cada frequencia de nota, imprimie barra no gráfico
		for(int count = 0; count < frequencia.length; count++) {
			//gera saída do rótulo de barra
			if (count == 10) {
				System.out.printf("%5d: ", 100);
			}else {
				System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
			}
			// imprime a barra de asteriscos
			for(int stars = 0; stars < frequencia[count]; stars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// gera a saída do conteúdo do array de notas
	public void saidaNotas() {
		System.out.printf("As notas são:%n%n");
		//gera a saída da nota de cada aluno
		for(int estudante = 0; estudante < notas.length; estudante++) {
			System.out.printf("Estudante %2d: %3d%n", estudante + 1, notas[estudante]);
		}
	}
}
