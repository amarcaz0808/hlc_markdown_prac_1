/**
 * swing_c_p02_MarquezCazorlaAlvaro alerta_dialog ThirdPanel.java
 * 25 nov 2022 12:19:43
 * @author Álvaro Márquez Cazorla
 */
package alerta_dialog;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.Border;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 */
public class ThirdPanel extends JPanel implements ActionListener
{
	/*
	 * ATTRIBUTES
	 */
	private JComboBox roomType; //Three kinds: SIMPLE, DOUBLE and SUITE
	private JSpinner roomAmount; //min=0; max=50
	private JCheckBox anyKids;
	//private KidExtras panelKidExtras; //(only appears if attribute "anyKids" is marked
	private Box hBox=Box.createHorizontalBox();
	private int roomCost=0;
	private JLabel lblRoomCostTitle=new JLabel("Coste:");
	private JLabel lblAnyKids=new JLabel("¿Niños?:");
	private JLabel lblRoomCost=new JLabel("0€");
	private JButton btnCheckCost=new JButton("Comprobar Costo");
	
	//Aux attributes
	private String[] roomKinds= {"Simple", "Double", "Suite"};
	private SpinnerNumberModel roomLimits= new SpinnerNumberModel(0, 0, 50, 1); //Default value, minimum, maximum, step.
	private Border b=BorderFactory.createLineBorder(Color.PINK);
	
	/*
	 * CONSTRUCTORS
	 */
	public ThirdPanel()
	{
		this.setLayout(new FlowLayout());
		
		roomType=new JComboBox(roomKinds);
		roomAmount=new JSpinner(roomLimits);
		anyKids=new JCheckBox();


		hBox.add(lblRoomCostTitle);
		hBox.add(lblRoomCost);

		this.add(roomType);
		this.add(roomAmount);
		this.add(lblAnyKids);
		this.add(anyKids);
		this.add(hBox);
		this.add(btnCheckCost);
		//
		this.setBorder(b);
		this.setVisible(true);
	}//End of Constructor

	/*
	 * FUNCTIONS
	 */
	private int updateRoomCost()
	{
		int newCost=0;
		if(roomType.getSelectedItem()=="Simple")
		{
			newCost+=50*(Integer.parseInt(roomAmount.getModel().getValue().toString())); //Why was this so hard to figure out...
		}

		if(roomType.getSelectedItem()=="Simple")
		{
			newCost+=75*(Integer.parseInt(roomAmount.getModel().getValue().toString())); //Why was this so hard to figure out...
		}

		if(roomType.getSelectedItem()=="Simple")
		{
			newCost+=125*(Integer.parseInt(roomAmount.getModel().getValue().toString())); //Why was this so hard to figure out...
		}
		//
		newCost+=this.roomCost;
		return newCost;
	}//End of Function updateRoomCost

	/*OVERWRITTEN FUNCTIONS*/
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnCheckCost)
		{
			this.roomCost=updateRoomCost();
			lblRoomCost.setText(roomCost+"€");
		}
	}//End of Overwritten Listener Function actionPerformed
	
	@Override
    public String toString()
	{
		//TODO
        return ("Room Data: [Method to be Finished]\n");
    }//End of Overwritten Method toString()

	/*
	 * PRIVATE CLASSES
	 */
	private class KidExtras extends JPanel
	{
		/*
		 * ATTRIBUTES
		 */
		//TODO

		/*
		 * CONSTRUCTORS
		 */
		public KidExtras()
		{
			//TODO
		}//End of Constructor
	}//End of Private class KidExtras
}//End of class ThirdPanel
