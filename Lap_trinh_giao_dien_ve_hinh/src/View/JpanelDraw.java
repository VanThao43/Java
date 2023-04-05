package View;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JpanelDraw extends JPanel {
	public JpanelDraw() {
		this.setBackground(Color.white);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.drawLine(50, 50, 500, 50);

		g.setColor(Color.green);
		g.drawOval(225, 100, 150, 150);

		g.setColor(Color.BLUE);
		g.drawRect(100, 300, 300, 100);

		g.setColor(Color.CYAN);
		g.fillOval(500, 100, 250, 150);

		g.setColor(Color.MAGENTA);
		g.fillRect(500, 300, 300, 150);

		g.setColor(Color.BLACK);
		g.drawString("HELLO, MY COMPUTER NAME IS THAOPC", 500, 25);
	}

}
