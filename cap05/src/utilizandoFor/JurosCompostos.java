package utilizandoFor;

public class JurosCompostos {

	public static void main(String[] args) {
		double deposito;
		double quantidade = 1000.0;
		double juros = 0.05;
		
		System.out.printf("%s%20s %n", "Year", "Amount on deposit"); // . Usamos o especificador %20s para gerar a String "Amount on Deposit”
		
		//calculoando a quantidade de depositos para cada um dos dez anos
		for(int year = 1; year <= 10; year++) {
			//calcular a nova quantidade durante ano específico
			deposito = quantidade * Math.pow(1.0 + juros, year);
			
			//exibindo o ano e a quantidade
			System.out.printf("%4d%,20.2f%n", year, deposito);
		}
		
	}
}
