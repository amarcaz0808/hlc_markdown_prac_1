/**
 * swing_c_p02_MarquezCazorlaAlvaro alerta_dialog ExtraComponent.java
 * 29 nov 2022 19:15:26
 * @author Álvaro Márquez Cazorla
 */
package alerta_dialog;

import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTree;

/**
 * @author alvar
 *
 */
public class ExtraComponent extends JPanel
{
	/*
	 * ATTRIBUTES
	 */
	JTree exampleTree;
	
	/*
	 * CONSTRUCTORS
	 */
	public ExtraComponent()
	{
		this.setLayout(new FlowLayout());
		
		exampleTree=new JTree();
		exampleTree.setToolTipText("Árbol de directorios de ejemplo, está chulo, pero Miguel Ángel pilló un componente más chulo y no puedo usarlo porque se consideraría copiarse");
		//
		this.add(exampleTree);
		this.setVisible(true);
	}//End of Constructor
}//End of class ExtraComponent
