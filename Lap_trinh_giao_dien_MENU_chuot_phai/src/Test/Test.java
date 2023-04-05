package Test;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import View.MenuExampleView;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new MenuExampleView();
	}

}
