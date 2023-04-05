package View;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import Controller.MenuExampleController;

public class MenuExampleView extends JFrame{
	private JLabel jLabel;

	public MenuExampleView() {
		this.setTitle("Menu Example");
		this.setSize(1000,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font font = new Font("Arial", Font.BOLD, 50);
		
		JMenuBar jMenuBar = new JMenuBar();
		
		ActionListener ac = new MenuExampleController(this);
		
		jLabel = new JLabel("",jLabel.CENTER);
		jLabel.setFont(font);
		
		JMenu jMenu_file = new JMenu("File");
		JMenuItem jMenuItem_new = new JMenuItem("New", KeyEvent.VK_N);
		jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		
		jMenuItem_new.addActionListener(ac);
		JMenuItem jMenuItem_open_file = new JMenuItem("Open File");
		jMenuItem_open_file.addActionListener(ac);
		JMenuItem jMenuItem_save = new JMenuItem("Save", KeyEvent.VK_S);
		jMenuItem_save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_DOWN_MASK));
		jMenuItem_save.addActionListener(ac);
		jMenu_file.add(jMenuItem_new);
		jMenu_file.addSeparator();
		jMenu_file.add(jMenuItem_open_file);
		jMenu_file.addSeparator();
		jMenu_file.add(jMenuItem_save);
		
		
		JMenu jMenu_help = new JMenu("Help");
		JMenuItem jMenuItem_search = new JMenuItem("Search");
		jMenuItem_search.addActionListener(ac);
		JMenuItem jMenuItem_update = new JMenuItem("Check for Updates");
		jMenuItem_update.addActionListener(ac);
		jMenu_help.add(jMenuItem_search);
		jMenu_help.addSeparator();
		jMenu_help.add(jMenuItem_update);
		
		jMenuBar.add(jMenu_file);
		jMenuBar.add(jMenu_help);
		
		this.setJMenuBar(jMenuBar);
		
		this.setLayout(new BorderLayout());
		this.add(jLabel, BorderLayout.CENTER);
		this.setVisible(true);
	}
	
	public void setText(String s) {
		this.jLabel.setText(s);
	}
}
