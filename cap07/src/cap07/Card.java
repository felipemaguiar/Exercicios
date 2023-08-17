package cap07;

public class Card {

	private final String face; // face da carta (as, dois, tres...)
	private final String suit; // naipe da carta (paus, ouros...)
	
	
	//construtor de dois argumentos inicializa face e naipe da carta
	public Card(String face, String suit) {
		this.face = face;
		this.suit = suit;
	}
	
	//retorna representação String de Card
	public String toString() {
		return face + " of " + suit;
	}
}
