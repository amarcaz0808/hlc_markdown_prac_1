/**
 * swing_c_p02_MarquezCazorlaAlvaro swing_c_p02_MarquezCazorlaAlvaro ReservationDialog.java
 * 24 nov 2022 8:55:05
 * @author Álvaro Márquez Cazorla
 */
package swing_c_p02_MarquezCazorlaAlvaro;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.JDialog;

import alerta_dialog.*;

/**
 * 
 */
public class ReservationDialog extends JDialog
{
	/*
	 * ATTRIBUTES
	 */
	private Box northBox=Box.createVerticalBox();
	private Box westBox=Box.createHorizontalBox();
	private Box centerBox=Box.createHorizontalBox();
	private Box eastBox=Box.createHorizontalBox();
	private FirstPanel firstPanel;
	private SecondPanel secondPanel;
	private ThirdPanel thirdPanel;
	private ExtraComponent extraComponent;
	private FourthPanel fourthPanel;
	
	/*
	 * CONSTRUCTORS
	 */
	public ReservationDialog(java.awt.Frame paramParent, Boolean paramIsModal)
	{
		super(paramParent, paramIsModal);
		this.setTitle("ALTA RESERVAS");
		this.setModal(paramIsModal);
		this.setModalityType(Dialog.ModalityType.DOCUMENT_MODAL);
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setLayout(new BorderLayout());
		
		firstPanel=new FirstPanel();
		secondPanel=new SecondPanel();
		thirdPanel=new ThirdPanel();
		extraComponent=new ExtraComponent();
		fourthPanel=new FourthPanel();
		
		northBox.add(firstPanel);
		northBox.add(secondPanel);
		westBox.add(thirdPanel);
		centerBox.add(extraComponent);
		eastBox.add(fourthPanel);
		//
		this.add(northBox, BorderLayout.NORTH);
		this.add(westBox, BorderLayout.WEST);
		this.add(centerBox, BorderLayout.CENTER);
		this.add(eastBox, BorderLayout.EAST);
		//
		this.setVisible(true);
	}//End of Constructor
}//End of class ReservationDialog
