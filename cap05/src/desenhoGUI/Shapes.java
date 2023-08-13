package desenhoGUI;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Shapes extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int choice; // escolha do usuário de qual forma desenhar

	// contrutor configura a escolha do usuário
	public Shapes(int choice) {
		this.choice = choice;
	}
	
	// desenha uma cascata de formas que iniciam no canto superior esquerdo
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for (int i = 0; i < 10; i++){
			// seleciona a forma com base na escolha do usuário
			switch (choice) 
			{
				case 1: // desenha retângulos
					g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
					break;
				case 2: // desenha ovais
					g.drawOval(80, 80, 20, 20);
					//g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
					break;
			}
			
		}
	}
	
	
}
