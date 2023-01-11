/**
 * swing_c_p02_MarquezCazorlaAlvaro alerta_dialog SecondPanel.java
 * 24 nov 2022 14:20:36
 * @author Álvaro Márquez Cazorla
 */
package alerta_dialog;

import java.awt.Color;
import java.awt.FlowLayout;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 * 
 */
public class SecondPanel extends JPanel
{
	/*
	 * ATTRIBUTES
	 */
	private JTextField tfName, tfApellidos, tfExitDate, tfStayDays;
	private JFormattedTextField ftfDNI, ftfTlfn;
	private JLabel lblName, lblApellidos, lblDNI, lblTlfn, lblExitDate, lblStayDays;
	private Box vB1, vB2, vB3, vB4, vB5, vB6, hB;
	private Border b=BorderFactory.createLineBorder(Color.PINK);
	
//	private SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yy");
//	Calendar calendar;
	
	/*
	 * CONSTRUCTORS
	 */
	public SecondPanel()
	{
		this.setLayout(new FlowLayout());
		
		//Initialize the Attributes
		tfName=new JTextField();
		tfApellidos=new JTextField();
		tfExitDate=new JTextField();
		tfStayDays=new JTextField();
		
		ftfDNI=new JFormattedTextField();
		ftfTlfn=new JFormattedTextField();
		
		lblName=new JLabel("Nombre: ");
		lblApellidos=new JLabel("Apellidos: ");
		lblDNI=new JLabel("DNI: ");
		lblTlfn=new JLabel("Teléfono: ");
		lblExitDate=new JLabel("Fecha de Salida: ");
		lblStayDays=new JLabel("Días de estancia");
		
		vB1=Box.createVerticalBox();
		vB2=Box.createVerticalBox();
		vB3=Box.createVerticalBox();
		vB4=Box.createVerticalBox();
		vB5=Box.createVerticalBox();
		vB6=Box.createVerticalBox();
		hB=Box.createHorizontalBox();
		
		//Add each Label/TF to each Vertical Box
		vB1.add(lblName);
		vB1.add(tfName);
		
		vB2.add(lblApellidos);
		vB2.add(tfApellidos);
		
		vB3.add(lblDNI);
		vB3.add(ftfDNI);
		
		vB4.add(lblTlfn);
		vB4.add(ftfTlfn);
		
		vB5.add(lblExitDate);
		vB5.add(tfExitDate);
		
		vB6.add(lblStayDays);
		vB6.add(tfStayDays);
		
		//Add each Vertical Box to the Horizontal Box
		hB.add(vB1);
		hB.add(vB2);
		hB.add(vB3);
		hB.add(vB4);
		
		//Set default values to the fields that need them
//		calendar.add(Calendar.DATE, 1);
//		tfExitDate.setText(sdf.format(calendar.getTime())); //This will show the current day plus a day (added in the row above)
		
		tfStayDays.setText("1");
		
		//Make each Text Field editable (just in case, I think the default value is "true" for their editability)
		tfName.setEditable(true);
		tfApellidos.setEditable(true);
		ftfDNI.setEditable(true);
		ftfTlfn.setEditable(true);
		tfExitDate.setEditable(true);
		tfStayDays.setEditable(true);
		
		//
		this.add(hB);
		this.setBorder(b);
		this.setVisible(true);
	}//End of Constructor
	
	/*
	 * GETTERS
	 */
	//We'll need this for another class later
	public String getName()
	{
		return tfName.getText();
	}//End of Getter for attribute tfName
	
	public String getApellidos()
	{
		return tfApellidos.getText();
	}//End of Getter for attribute tfApellidos
	
	public String getDNI()
	{
		return ftfDNI.getText();
	}//End of Getter for attribute ftfDNI
	
	public String getTlfn()
	{
		return ftfTlfn.getText();
	}//End of Getter for attribute ftfTlfn
	
	public String getExitDate()
	{
		return tfExitDate.getText();
	}//End of Getter for attribute tfExitDate
	
	public String getStayDays()
	{
		return tfStayDays.getText();
	}//End of Getter for attribute tfStayDays
	
	/*
	 * METHODS
	 */
	/*OVERWRITTEN METHODS*/
	@Override
    public String toString()
	{
        return ("Client Data: [Method to be Finished]\n"
        		+"EXISTEN MÉTODOS PARA CONSEGUIR ESTOS DATOS,\n"
        		+"PERO NO ME QUIERO ARRIESGAR A QUE PETE POR INTENTAR ESCRIBIR STRINGS NULOS");
    }//End of Overwritten Method toString()
}//End of class SecondPanel
