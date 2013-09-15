

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class Fakultaet extends javax.swing.JApplet {
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JButton jButton1;
	private JTextField jTextField2;
	private JTextField jTextField1;
	// Ort für Deklarationen
	int zaehler=0;
	/**
	* Auto-generated main method to display this 
	* JApplet inside a new JFrame.
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				Fakultaet inst = new Fakultaet();
				frame.getContentPane().add(inst);
				((JComponent)frame.getContentPane()).setPreferredSize(inst.getSize());
				frame.pack();
				frame.setVisible(true);
			}
		});

	}
	
	public Fakultaet() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			this.setSize(449, 190);
			getContentPane().setLayout(null);
			getContentPane().setBackground(new java.awt.Color(0,255,0));
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Berechnung von n!");
				jLabel1.setFont(new java.awt.Font("Dialog",0,16));
				jLabel1.setBounds(135, 5, 161, 19);
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("n=");
				jLabel2.setBounds(22, 61, 45, 15);
			}
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("n!");
				jLabel3.setBounds(22, 104, 45, 15);
			}
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1);
				jTextField1.setBounds(79, 58, 117, 22);
				jTextField1.setText("10");
			}
			{
				jTextField2 = new JTextField();
				getContentPane().add(jTextField2);
				jTextField2.setBounds(79, 101, 314, 22);
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("Berechne");
				jButton1.setBounds(270, 58, 121, 25);
				jButton1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton1ActionPerformed(evt);
					}
				});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	long factorial_rek(int n){
		System.out.println("Rekursionstiefe= "+zaehler);
		zaehler++;
		if (n==0){
			return 1; //Basisfall
	}
		else{
			return n*factorial_rek(n-1);
	  } 
	}	
	
	
	
	long factorial(int n){
		long ergebnis=1;
		for(int i=n; i>1; i--){
			ergebnis=ergebnis*i;	
		}
		return ergebnis;
	}
	
	
	
	private void jButton1ActionPerformed(ActionEvent evt) {
		System.out.println("jButton1.actionPerformed, event="+evt);
		//TODO add your code for jButton1.actionPerformed
		
		int n=Integer.parseInt(jTextField1.getText());
		jTextField2.setText(factorial_rek(n)+"\n");
	
	}

}