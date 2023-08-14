package cap06;

import java.security.SecureRandom;

public class RollDie {

	public static void main(String[] args) {
		// o objeto randomNumbers produzirá número aleatório seguros
		SecureRandom randoNumbers = new SecureRandom();
		
		int frequencia1 = 0;
		int frequencia2 = 0;
		int frequencia3 = 0;
		int frequencia4 = 0;
		int frequencia5 = 0;
		int frequencia6 = 0;
		
		for (int roll = 1; roll <=60000000; roll++) {
			int face = 1 + randoNumbers.nextInt(6);
			
			switch(face) {
				case 1:
					++frequencia1;
					break;
				case 2:
					++frequencia2;
					break;
				case 3:
					++frequencia3;
					break;
				case 4:
					++frequencia4;
					break;
				case 5:
					++frequencia5;
					break;
				case 6:
					++frequencia6;
					break;
			}
		}
		
		System.out.println("FAce\tFrequencia");
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
				frequencia1, frequencia2, frequencia3, frequencia4, frequencia5, frequencia6);
	}

}
