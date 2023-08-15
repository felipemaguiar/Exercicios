package cap07;

public class InitArray {

	public static void main(String[] args) {
		// declara array variável e o incializa com um objeto array
		//int[] array = new int[10]; //cria o objeto array
		
		//A lista de incializador especifica o valor inicial de cada elemento
		int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
	
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		//gera saída do valor de cada elemento do array
		for (int counter = 0; counter < array.length; counter++) {
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}
	}
}
