/**
 * swing_c_p02_MarquezCazorlaAlvaro alerta_dialog FirstPanel.java
 * 24 nov 2022 9:30:08
 * @author Álvaro Márquez Cazorla
 */
package alerta_dialog;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * 
 */
public class FirstPanel extends JPanel
{
	/*
	 * ATTRIBUTES
	 */
	private JLabel hotelName;
	private Border border;
	private Color backgroundColor;
	
	/*
	 * CONSTRUCTORS
	 */
	public FirstPanel()
	{
		this.setLayout(getLayout());
		hotelName=new JLabel();
		border=BorderFactory.createLineBorder(Color.PINK);
		backgroundColor=new Color(137, 170, 249); //#89AAF9 for HEX
		
		hotelName.setText("HOTEL LUIGI");
		hotelName.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
		hotelName.setBorder(border);
		
		this.setBackground(backgroundColor);
		
		this.add(hotelName);
	}//End of Constructor
}//End of class FirstPanel
