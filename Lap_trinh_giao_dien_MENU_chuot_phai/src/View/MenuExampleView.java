package View;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;

import Controller.MenuExampleController;

public class MenuExampleView extends JFrame{
	
	private JLabel jLabel;
	public JPopupMenu jPoupMenu;
	
	public MenuExampleView () {
		this.setTitle("MENU chuột phải");
		this.setSize(800,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jLabel = new JLabel("", jLabel.CENTER);
		Font font = new Font("Arial", Font.BOLD, 40);
		jLabel.setFont(font);
		
		ActionListener ac = new MenuExampleController(this);
		MouseListener ms = new MenuExampleController(this);
		
		JMenuBar jMenuBar = new JMenuBar();
		
		JMenu jMenu_File = new JMenu("File");
		JMenuItem jMenuItem_new = new JMenuItem("New", KeyEvent.VK_N);
		jMenuItem_new.addActionListener(ac);
		jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		
		JMenuItem jMenuItem_OpenFile = new JMenuItem("Open File...");
		jMenuItem_OpenFile.addActionListener(ac);
		JMenuItem jMenuItem_save = new JMenuItem("Save", KeyEvent.VK_S);
		jMenuItem_save.addActionListener(ac);
		jMenuItem_save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		JMenuItem jMenuItem_refresh = new JMenuItem("Refresh");
		jMenuItem_refresh.addActionListener(ac);
		JMenuItem jMenuItem_exit = new JMenuItem("Exit", KeyEvent.VK_E);
		jMenuItem_exit.addActionListener(ac);
		jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
		jMenu_File.add(jMenuItem_new);
		jMenu_File.add(jMenuItem_OpenFile);
		jMenu_File.addSeparator();
		jMenu_File.add(jMenuItem_save);
		jMenu_File.add(jMenuItem_refresh);
		jMenu_File.addSeparator();
		jMenu_File.add(jMenuItem_exit);
		
		JMenu jMenu_refactor = new JMenu("Refactor");
		JMenuItem jMenuItem_rename = new JMenuItem("Rename");
		jMenuItem_rename.addActionListener(ac);
		JMenuItem jMenuItem_move = new JMenuItem("Move", KeyEvent.VK_M);
		jMenuItem_move.addActionListener(ac);
		jMenuItem_move.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, InputEvent.ALT_DOWN_MASK));
		jMenu_refactor.add(jMenuItem_rename);
		jMenu_refactor.addSeparator();
		jMenu_refactor.add(jMenuItem_move);
		
		jMenuBar.add(jMenu_File);
		jMenuBar.add(jMenu_refactor);
		
		this.setJMenuBar(jMenuBar);
		
		// MENU chuột phải
		jPoupMenu = new JPopupMenu();
		JMenu jMenu_font = new JMenu("Font");
		JMenuItem jMenuItem_type = new JMenuItem("Type");
		jMenuItem_type.addActionListener(ac);
		JMenuItem jMenuItem_size = new JMenuItem("Size");
		jMenuItem_size.addActionListener(ac);
		jMenu_font.add(jMenuItem_type);
		jMenu_font.add(jMenuItem_size);
		JMenuItem jMenuItem_copy = new JMenuItem("Copy");
		jMenuItem_copy.addActionListener(ac);
		JMenuItem jMenuItem_cut = new JMenuItem("Cut");
		jMenuItem_cut.addActionListener(ac);
		JMenuItem jMenuieItem_paste = new JMenuItem("Paste");
		jMenuieItem_paste.addActionListener(ac);
		
		jPoupMenu.add(jMenu_font);
		jPoupMenu.addSeparator();
		jPoupMenu.add(jMenuItem_copy);
		jPoupMenu.add(jMenuItem_cut);
		jPoupMenu.add(jMenuieItem_paste);
		
		this.add(jPoupMenu);
		this.addMouseListener(ms);
		
		this.setLayout(new BorderLayout());
		this.add(jLabel, BorderLayout.CENTER);
		this.setVisible(true);
	}
	
	public void setText(String s) {
		this.jLabel.setText(s);
	}
}
