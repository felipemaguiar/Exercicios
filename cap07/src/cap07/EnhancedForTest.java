package cap07;

public class EnhancedForTest {

	public static void main(String[] args) {
		int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 81};
		int total = 0;
		
		//adiciona o valor de cada elemento ao total
		for (int number : array) {
			System.out.println(number);
			total += number;
		}
		
		System.out.printf("Total dos elementos da array: %d%n", total);
	}

}
