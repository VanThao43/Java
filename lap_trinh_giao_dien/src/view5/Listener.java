package view5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener implements ActionListener{
	private View view;
	
	public Listener(View view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if (src.equals("+")) {
			this.view.plus();
		} else if (src.equals("-")) {
			this.view.minus();
		} else if (src.equals("x")) {
			this.view.multiply();
		} else if (src.equals("/")) {
			this.view.divide();
		} else if (src.equals("^")) {
			this.view.pow();
		} else if (src.equals("%")) {
			this.view.mod();
		}
	}

}
