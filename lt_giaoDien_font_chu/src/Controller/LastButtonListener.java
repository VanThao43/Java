package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.LastButtonView;

public class LastButtonListener implements ActionListener {
	private LastButtonView lbv;

	public LastButtonListener(LastButtonView lbv) {
		this.lbv = lbv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if (src.equals("1")) {
			this.lbv.inRa_1();
		} else if (src.equals("2")) {
			this.lbv.inRa_2();
		} else if (src.equals("3")) {
			this.lbv.inRa_3();
		} else if (src.equals("4")) {
			this.lbv.inRa_4();
		} else if (src.equals("RESET")) {
			this.lbv.reset();
		}
	}

}
