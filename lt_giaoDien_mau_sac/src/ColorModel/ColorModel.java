package ColorModel;

import java.awt.Color;

public class ColorModel {
	private Color foreground;
	private Color background;
	private boolean opaque;

	public ColorModel() {
		this.foreground = Color.GREEN;
		this.background = Color.BLACK;
		this.opaque = true;
	}

	public Color getForeground() {
		return foreground;
	}

	public void setForeground(Color foreground) {
		this.foreground = foreground;
	}

	public Color getBackground() {
		return background;
	}

	public void setBackground(Color background) {
		this.background = background;
	}

	public boolean isOpaque() {
		return opaque;
	}

	public void setOpaque(boolean opaque) {
		this.opaque = opaque;
	}

}
