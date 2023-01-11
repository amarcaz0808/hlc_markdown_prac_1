/**
 * swing_c_p02_MarquezCazorlaAlvaro swing_c_p02_MarquezCazorlaAlvaro Window.java
 * 21 nov 2022 9:39:47
 * @author Álvaro Márquez Cazorla
 */
package swing_c_p02_MarquezCazorlaAlvaro;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * 
 */
public class Window extends JFrame implements ActionListener
{
	/*
	 * ATTRIBUTES
	 */
	private int attHalfScreenWidth=Toolkit.getDefaultToolkit().getScreenSize().width/2;
	private int attHalfScreenHeight=Toolkit.getDefaultToolkit().getScreenSize().height/2;
	//
	private JMenuBar menuBar;
	private JMenu file, registry, help;
	private JMenuItem exit, newReservation, eraseReservation, aboutHelp;
	private JButton btnNewR, btnEraseR;
	private Box hBox;
	private ReservationDialog rD;

	/*
	 * CONSTRUCTORS
	 */
	public Window()
	{
		//Name of the Window
		super("GESTIÓN DEL HOTEL LUIGI");
		//Closing Operation
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//All of the Size stuff
		this.setSize(attHalfScreenWidth, attHalfScreenHeight);
		this.setLocationRelativeTo(null); //This was harder to achieve than it should've taken
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		
		//Working on the Bar Menu
		menuBar=new JMenuBar();
		
		file=new JMenu("Archivo");
		registry=new JMenu("Registro");
		help=new JMenu("Ayuda");
		
		exit=new JMenuItem("Salir");
		newReservation=new JMenuItem("Alta Reserva");
		eraseReservation=new JMenuItem("Baja Reserva");
		aboutHelp=new JMenuItem("Acerca de...");
		
		btnNewR=new JButton("Alta Reservas");
		btnEraseR=new JButton("Baja Reservas");
		btnNewR.setMnemonic(KeyEvent.VK_ALT+KeyEvent.VK_A);
		btnEraseR.setMnemonic(KeyEvent.VK_ALT+KeyEvent.VK_B);
		btnNewR.addActionListener(this);
		btnEraseR.addActionListener(this);
		
		hBox=Box.createHorizontalBox();
		hBox.add(btnNewR);
		hBox.add(btnEraseR);
		
		exit.addActionListener(this);
		
		file.add(exit);
		
		
		registry.add(newReservation);
		registry.add(eraseReservation);
		registry.setMnemonic(KeyEvent.VK_ALT+KeyEvent.VK_R);
		
		help.add(aboutHelp);
		
		menuBar.add(file);
		menuBar.add(registry);
		menuBar.add(help);
		/*
		 * this.add(); && SET VISIBLE
		 */
		this.add(menuBar, BorderLayout.NORTH);
		this.add(hBox, BorderLayout.CENTER);
		this.setVisible(true);
	}//End of Constructor
	
	/*
	 * FUNCTIONS
	 */
	/*Overwritten Functions*/
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnNewR)
		{
			ReservationDialog rd=new ReservationDialog(this, true);
		}//End of Listener IF for btnNewR
		
		if(e.getSource()==btnEraseR)
		{
			UnavailableDialog ud=new UnavailableDialog(this, true);
		}//End of Listener IF for btnEraseR
		
		if(e.getSource()==aboutHelp)
		{
			//
		}//End of Listener IF for aboutHelp
		
		if(e.getSource()==exit)
		{
			//TODO
		}
	}//End of Overwritten Listener Function actionPerformed
}//End of class Window
