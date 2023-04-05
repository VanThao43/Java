package Test6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorListener implements ActionListener {
	private ColorView colorView;

	public ColorListener(ColorView colorView) {
		this.colorView = colorView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if (src.equals("Red Text")) {
			this.colorView.changeTo_red_text();
		} else if (src.equals("Green Text")) {
			this.colorView.changeTo_green_text();
		} else if (src.equals("Blue Text")) {
			this.colorView.changeTo_blue_text();
		} else if (src.equals("Yellow BackGround")) {
			this.colorView.changeTo_yellow_background();
		} else if (src.equals("Orange BackGround")) {
			this.colorView.changeTo_orange_background();
		} else if (src.equals("Green BackGround")) {
			this.colorView.changeTo_green_background();
		} else if (src.equals("Reset Text")) {
			this.colorView.reset_text();
		} else if (src.equals("Reset BackGround")) {
			this.colorView.reset_background();
		}
	}

}
