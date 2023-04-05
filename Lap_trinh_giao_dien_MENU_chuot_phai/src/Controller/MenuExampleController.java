package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import View.MenuExampleView;

public class MenuExampleController implements ActionListener, MouseListener {
	private MenuExampleView menu;

	public MenuExampleController(MenuExampleView menu) {
		this.menu = menu;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if (src.equals("New")) {
			this.menu.setText(src);
		} else if (src.equals("Open File...")) {
			this.menu.setText(src);
		} else if (src.equals("Save")) {
			this.menu.setText(src);
		} else if (src.equals("Refresh")) {
			this.menu.setText(src);
		} else if (src.equals("Exit")) {
			System.exit(0);
		} else if (src.equals("Rename")) {
			this.menu.setText(src);
		} else if (src.equals("Move")) {
			this.menu.setText(src);
		} else if (src.equals("Copy")) {
			this.menu.setText(src);
		} else if (src.equals("Cut")) {
			this.menu.setText(src);
		} else if (src.equals("Paste")) {
			this.menu.setText(src);
		} else if (src.equals("Type")) {
			this.menu.setText(src);
		} else if (src.equals("Size")) {
			this.menu.setText(src);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.isPopupTrigger()) {
			this.menu.jPoupMenu.show(e.getComponent(), e.getX(), e.getY());
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.isPopupTrigger()) {
			this.menu.jPoupMenu.show(e.getComponent(), e.getX(), e.getY());
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
