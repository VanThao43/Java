package Controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import View.MouseExampleView;

public class MouseExampleController implements MouseListener, MouseMotionListener{

	private MouseExampleView View;

	public MouseExampleController(MouseExampleView view) {
		View = view;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.View.click();
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		this.View.enter();
		int x = e.getX(), y = e.getY();
		this.View.update(x,y);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		this.View.exit();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX(), y = e.getY();
		this.View.update(x,y);
	}

}
