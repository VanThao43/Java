package view4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterListener implements ActionListener{
	private CounterView ctv;

	public CounterListener(CounterView ctv) {
		this.ctv = ctv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if (src.equals("UP")) {
			this.ctv.increase();
		} else if (src.equals("DOWN")) {
			this.ctv.decrease();
		} else if (src.equals("RESET")) {
			this.ctv.reset();
		}
	}
	
	
}
