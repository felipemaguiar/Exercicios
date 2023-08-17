package cap07;

import java.security.SecureRandom;

public class DeckOfCards {

	private Card[] deck; // array de objetos card
	private int currentCard; //indice da proxima carta a ser distribuida 0-51
	private static final int NUMBER_OF_CARDS = 52; //numero contante de cartas
	
	//gerador de número aleatório
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	//construtor preenche baralho de cartas
	
	public DeckOfCards() {
		String[] faces = {"As", "Dois", "Tres", "Quatro", "Cinco", "Seis", "Sete",
				"Oito", "Nove", "Dez", "Valete", "Dama", "Reis"};
		String[] suits = {"Ouro", "Espada", "Copa", "Paus"};
		
		deck = new Card[NUMBER_OF_CARDS]; //cria array de objetos CArd
		currentCard = 0; // a primeira Card distribuida será o deck [0]
		
		//preencher o baralho com objetos Card
		for(int count = 0; count < deck.length; count++) {
			deck[count] = new Card(faces[count % 13], suits[count / 13]);
		}
	}
		
		//embaralha as cartas com um algoritmo de uma passagem
		public void shuffle() {
			// a proxima chamada para o método dealCard deve começar no deck[0] novamente
			currentCard = 0;
			
			//para cada Card, seleciona outra Card aleatória(0-51) e as compra
			for(int first = 0; first < deck.length; first++) {
				//seleciona o número aleatório entre 0 e 51
				int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
				
				//compra Card atual com Card aleatóriamente selecionada
				Card temp = deck[first];
				deck[first] = deck[second];
				deck[second] = temp;
			}
		}
		
		//distribui uma Card
		public Card dealCard() {
			//determina se ainda há cards a serem distribuidas
			if(currentCard < deck.length)
				return deck[currentCard++]; // retorna Card atual no array
			else
				return null; // retorna nulo para indicar que todas as cards foram distribuídas
		}
		
		
		
		
	
}
