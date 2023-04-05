package lapTrinhDaoDien;

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
		if (src.equals("Up")) {
			this.ctv.increase();
		} else if (src.equals("Down")) {
			this.ctv.decrease();
		} else if (src.equals("Reset")) {
			this.ctv.reset();
		}
	}
	
}
