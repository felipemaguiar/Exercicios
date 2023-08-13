package desenhoGUI;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {

	// desenha um X a partir dos cantos do painel
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int width = getWidth(); // largura total
		int height = getHeight(); // altura total
		
		g.drawLine(0, 0, width, height);
		
		g.drawLine(0, height, width, 0);
	}
}
