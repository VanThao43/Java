package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.MenuExampleView;

public class MenuExampleController implements ActionListener{
	private MenuExampleView mv;

	public MenuExampleController(MenuExampleView mv) {
		this.mv = mv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if (src.equals("Open File")) {
			this.mv.setText("Bạn đã click vào Open File");
		} else if (src.equals("Save")) {
			this.mv.setText("Bạn đã click vào Save");
		} else if (src.equals("New")) {
			this.mv.setText("Bạn đã click vào New");
		} else if (src.equals("Search")) {
			this.mv.setText("Bạn đã click vào Search");
		} else if (src.equals("Check for Updates")) {
			this.mv.setText("Bạn đã click vào Check for Updates");
		}
	}
	
	
}
