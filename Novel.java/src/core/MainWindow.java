package core;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MainWindow {

	private JFrame frmNoveljavaGameEngine;

	/**
	 * Launch the application.
	 */
	public static void InitializeWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmNoveljavaGameEngine.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNoveljavaGameEngine = new JFrame();
		frmNoveljavaGameEngine.setTitle("Novel.java Game Engine alpha");
		frmNoveljavaGameEngine.setBounds(0, 50, 1280, 720);
		frmNoveljavaGameEngine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel MenuPanel = new JPanel();
		frmNoveljavaGameEngine.getContentPane().add(MenuPanel, BorderLayout.NORTH);
		MenuPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		MenuPanel.add(menuBar);
		
		JMenu mnApps = new JMenu("Apps");
		menuBar.add(mnApps);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnApps.add(mntmExit);
		
		JPanel panel_1 = new JPanel();
		frmNoveljavaGameEngine.getContentPane().add(panel_1, BorderLayout.SOUTH);
	}

}
