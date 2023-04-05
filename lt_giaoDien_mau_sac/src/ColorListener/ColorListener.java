package ColorListener;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ColorView.ColorView;

public class ColorListener implements ActionListener {
	private ColorView colorView;

	public ColorListener(ColorView colorView) {
		this.colorView = colorView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if (src.equals("Red Text")) {
			this.colorView.changeto_red_text();
		} else if (src.equals("Yellow Text")) {
			this.colorView.changeto_yellow_text();
		} else if (src.equals("Green Text")) {
			this.colorView.changeto_green_text();
		} else if (src.equals("Red Background")) {
			this.colorView.changeto_red_background();
		} else if (src.equals("Yellow Background")) {
			this.colorView.changeto_yellow_background();
		} else if (src.equals("Green Background")) {
			this.colorView.changeto_green_background();
		} else if (src.equals("Reset Background")) {
			this.colorView.reset_background();
		} else if (src.equals("Reset Text")) {
			this.colorView.reset_text();
		}
	}

}
