package Test10;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class jPanelDraw extends JPanel{
	public jPanelDraw() {
		this.setBackground(Color.WHITE);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.GREEN);
		
		g.fillOval(300, 100, 300, 200);
		
		g.setColor(Color.RED);
		g.fillRect(600, 100, 300, 200);
		
		g.setColor(Color.YELLOW);
	}
	
	
}
