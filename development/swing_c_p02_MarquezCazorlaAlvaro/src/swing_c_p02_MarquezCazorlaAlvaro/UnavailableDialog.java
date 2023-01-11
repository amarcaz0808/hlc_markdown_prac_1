/**
 * swing_c_p02_MarquezCazorlaAlvaro swing_c_p02_MarquezCazorlaAlvaro UnavailablePopUp.java
 * 24 nov 2022 8:25:15
 * @author Álvaro Márquez Cazorla
 */
package swing_c_p02_MarquezCazorlaAlvaro;

import java.awt.Dialog;

import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 * 
 */
public class UnavailableDialog extends JDialog
{
	/*
	 * ATTRIBUTES
	 */
	private JLabel lblMessage;
	/*
	 * CONSTRUCTORS
	 */
	public UnavailableDialog(java.awt.Frame paramParent, Boolean paramIsModal)
	{
		super(paramParent, paramIsModal);
		this.setTitle("Función no Disponible");
		this.add(lblMessage=new JLabel("Está función no está disponible."));
		this.pack();
		this.setLocationRelativeTo(null);
		
		this.setModal(paramIsModal);
		this.setModalityType(Dialog.ModalityType.DOCUMENT_MODAL);
		//
		this.setVisible(true);
	}//End of Constructor
}//End of class UnavailablePopUp
