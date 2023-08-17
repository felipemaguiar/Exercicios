package cap07;

public class PassArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5};
		
		System.out.printf("Efeitos de passar referência para todo o array%n" +
				"Os valores da array original são:%n");
		
		//gera saída de elementos do array original
		for(int valor : array) {
			System.out.printf("  %d", valor);
		}
		
		modifyArray(array); // passa a referência do array
		System.out.printf("%n%nOs valores da array depois do modifyArray:%n");
		
		// gera saída de elementos do array modificado
		for(int value : array)
			System.out.printf("   %d", value);
		
		System.out.printf(
			"%n%nEfeitos da passagem do valor do elemento da array:%n" +
			"array[3] antes modifyElement: %d%n", array[3]);
		
		
		modifyElement(array[3]); // tenta modificar o array 3
		System.out.printf("array[3] after modifyElement: %d%n", array[3]);
	}
	
	//multiplica cada elemento de um array por 2
	public static void modifyArray(int [] array2) {
		for(int counter = 0; counter < array2.length; counter++)
			array2[counter] *= 2;
	}
	
	//multiplica argumento por 2
	public static void modifyElement(int element) {
		element *= 2;
		System.out.printf("Valores dos elementos em modifyElement: %d%n", element);
	}
}
