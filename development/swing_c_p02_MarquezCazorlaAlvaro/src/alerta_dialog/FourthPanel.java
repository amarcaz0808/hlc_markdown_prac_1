/**
 * swing_c_p02_MarquezCazorlaAlvaro alerta_dialog FourthPanel.java
 * 29 nov 2022 18:42:47
 * @author Álvaro Márquez Cazorla
 */
package alerta_dialog;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 * @author alvar
 *
 */
public class FourthPanel extends JPanel
{
	/*
	 * ATTRIBUTES
	 */
	private JTabbedPane tabCliData, tabRoomData;
	private JTextField tfCliData, tfRoomData;
	
	private SecondPanel sP;
	private ThirdPanel tP;
	
	private Border b=BorderFactory.createLineBorder(Color.PINK);
	
	/*
	 * CONSTRUCTORS
	 */
	public FourthPanel()
	{
		this.setLayout(new FlowLayout());
		
		tabCliData=new JTabbedPane();
		tabRoomData=new JTabbedPane();
		
//		tabCliData.setSize(100, 100);
//		tabRoomData.setSize(100, 100);
		
		tfCliData=new JTextField();
		tfRoomData=new JTextField();
		
		tfCliData.setText("Aquí debería haber un toString de la Clase de la que viene, pero no funciona bien");
		tfRoomData.setText("Igual que con el otro TextField");
		
		tabCliData.add(tfCliData);
		tabRoomData.add(tfRoomData);
		
		this.add(tabCliData);
		this.add(tabRoomData);
		//
		this.setBorder(b);
		this.setVisible(true);
	}//End of Constructor
}//End of class FourthPanel
