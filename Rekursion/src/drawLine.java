import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


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
public class drawLine extends javax.swing.JApplet {
	private JLabel jLabelP1;
	private JTextField jTextFieldPx1;
	private JTextField jTextFieldPy1;
	private JButton jButtonClear;
	private JLabel jLabelNachbar;
	private JButton jButtonExit;
	private JButton jButtonCopy2P1;
	private JButton jButtonCopy2P2;
	private JButton jButtonCalc;
	private JTextField jTextFieldPym;
	private JTextField jTextFieldPxm;
	private JLabel jLabelPaM;
	private JTextField jTextFieldPy2;
	private JTextField jTextFieldPx2;
	private JLabel jLabelP2;
	private int px1;
	private int py1;
	private int px2;
	private int py2;
	private int PMx;
	private int PMy;

	/**
	* Auto-generated main method to display this 
	* JApplet inside a new JFrame.
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				drawLine inst = new drawLine();
				frame.getContentPane().add(inst);
				((JComponent)frame.getContentPane()).setPreferredSize(inst.getSize());
				frame.pack();
				frame.setVisible(true);
			}
		});

	}
	
	public drawLine() {
		super();
		initGUI();
	}
	
	private boolean benachbart(int x1, int y1, int x2, int y2) {
		//System.out.println("Input "+ x1 + " " + y1 + " " + x2 + " " + y2); 
		
		if ( (Math.abs (x1-x2) < 2) && (Math.abs(y1-y2) < 2) ) {
			//System.out.println("RETURN true");
			return true;
		}
		else
			//System.out.println("RETURN false");
			return false;
	  }

	private void neustarten (int x1, int y1, int x2, int y2) {
		jTextFieldPx1.setText(String.valueOf(x1));
		jTextFieldPy1.setText(String.valueOf(y1));
		jTextFieldPx2.setText(String.valueOf(x2));
		jTextFieldPy2.setText(String.valueOf(y2));
		jTextFieldPxm.setText("");
		jTextFieldPym.setText("");
	}

	
	private void initGUI() {
		try {
			this.setSize(451, 300);
			getContentPane().setLayout(null);
			{
				jLabelP1 = new JLabel();
				getContentPane().add(jLabelP1);
				jLabelP1.setText("P (x1, y1)");
				jLabelP1.setBounds(12, 15, 113, 15);
			}
			{
				jTextFieldPx1 = new JTextField();
				getContentPane().add(jTextFieldPx1);
				jTextFieldPx1.setBounds(89, 12, 52, 22);
				
			}
			{
				jTextFieldPy1 = new JTextField();
				getContentPane().add(jTextFieldPy1);
				jTextFieldPy1.setBounds(147, 12, 52, 22);
			}
			{
				jLabelP2 = new JLabel();
				getContentPane().add(jLabelP2);
				BorderLayout jLabelP2Layout = new BorderLayout();
				jLabelP2.setLayout(jLabelP2Layout);
				jLabelP2.setText("P (x2, y2)");
				jLabelP2.setBounds(12, 43, 113, 15);
			}
			{
				jTextFieldPx2 = new JTextField();
				getContentPane().add(jTextFieldPx2);
				jTextFieldPx2.setBounds(89, 40, 52, 22);
				
			}
			{
				jTextFieldPy2 = new JTextField();
				getContentPane().add(jTextFieldPy2);
				jTextFieldPy2.setBounds(147, 40, 52, 22);
			}
			{
				jLabelPaM = new JLabel();
				getContentPane().add(jLabelPaM);
				jLabelPaM.setText("Pm (x, y)");
				jLabelPaM.setBounds(12, 71, 113, 15);
				jLabelPaM.setBackground(new java.awt.Color(0,225,225));
			}
			{
				jTextFieldPxm = new JTextField();
				getContentPane().add(jTextFieldPxm);
				jTextFieldPxm.setBounds(89, 68, 52, 22);
			}
			{
				jTextFieldPym = new JTextField();
				getContentPane().add(jTextFieldPym);
				jTextFieldPym.setBounds(147, 68, 52, 22);
			}
			{
				jButtonCalc = new JButton();
				getContentPane().add(jButtonCalc);
				jButtonCalc.setText("Berechne");
				jButtonCalc.setBounds(12, 102, 187, 22);
				jButtonCalc.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButtonCalcActionPerformed(evt);
					}
				});
			}
			{
				jButtonCopy2P2 = new JButton();
				getContentPane().add(jButtonCopy2P2);
				jButtonCopy2P2.setText("Pm übernehmen");
				jButtonCopy2P2.setBounds(254, 40, 186, 22);
				jButtonCopy2P2.setToolTipText("kopiert die Werte von Pm nach P2");
				jButtonCopy2P2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButtonCopy2P2ActionPerformed(evt);
					}
				});
			}
			{
				jButtonCopy2P1 = new JButton();
				getContentPane().add(jButtonCopy2P1);
				jButtonCopy2P1.setText("Pm übernehmen");
				jButtonCopy2P1.setBounds(254, 13, 186, 22);
				jButtonCopy2P1.setToolTipText("kopiert die Werte von Pm nach P1");
				jButtonCopy2P1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButtonCopy2P1ActionPerformed(evt);
					}
				});
			}
			{
				jButtonExit = new JButton();
				getContentPane().add(jButtonExit);
				jButtonExit.setText("Beenden");
				jButtonExit.setBounds(341, 267, 102, 22);
				jButtonExit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButtonExitActionPerformed(evt);
					}
				});
			}
			{
				jLabelNachbar = new JLabel();
				getContentPane().add(jLabelNachbar);
				jLabelNachbar.setText("benachbart!");
				jLabelNachbar.setBounds(254, 105, 185, 15);
				jLabelNachbar.setHorizontalAlignment(SwingConstants.CENTER);
				jLabelNachbar.setVisible(false);
			}
			{
				jButtonClear = new JButton();
				getContentPane().add(jButtonClear);
				jButtonClear.setText("Neutstarten");
				jButtonClear.setBounds(12, 129, 187, 22);
				jButtonClear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButtonClearActionPerformed(evt);
					}
				});
			}
			this.neustarten(0,0,7,5);
			jTextFieldPy1.getDocument().addDocumentListener((DocumentListener) new myTextfieldListener());
			jTextFieldPy2.getDocument().addDocumentListener((DocumentListener) new myTextfieldListener());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void jButtonCalcActionPerformed(ActionEvent evt) {
		System.out.println("jButtonCalc.actionPerformed, event="+evt);
		//TODO add your code for jButtonCalc.actionPerformed
		px1 = Integer.parseInt(jTextFieldPx1.getText());
		py1 = Integer.parseInt(jTextFieldPy1.getText());
		px2 = Integer.parseInt(jTextFieldPx2.getText());
		py2 = Integer.parseInt(jTextFieldPy2.getText());
		
		PMx = (px1+px2)/2;
		PMy = (py1+py2)/2;
		
		jTextFieldPxm.setText(String.valueOf(PMx));
		jTextFieldPym.setText(String.valueOf(PMy));

	}
	
	private void jButtonCopy2P1ActionPerformed(ActionEvent evt) {
		System.out.println("jButtonCopy2P1.actionPerformed, event="+evt);
		//TODO add your code for jButtonCopy2P1.actionPerformed
		px1 = PMx;
		py1 = PMy;

		jTextFieldPx1.setText(jTextFieldPxm.getText());
		jTextFieldPy1.setText(jTextFieldPym.getText());
		jTextFieldPxm.setText("");
		jTextFieldPym.setText("");
	}
	
	private void jButtonCopy2P2ActionPerformed(ActionEvent evt) {
		System.out.println("jButtonCopy2P2.actionPerformed, event="+evt);
		//TODO add your code for jButtonCopy2P2.actionPerformed
		px2 = PMx;
		py2 = PMy;
		jTextFieldPx2.setText(jTextFieldPxm.getText());
		jTextFieldPy2.setText(jTextFieldPym.getText());
		jTextFieldPxm.setText("");
		jTextFieldPym.setText("");
	}
	
	private void jButtonExitActionPerformed(ActionEvent evt) {
		System.out.println("jButtonExit.actionPerformed, event="+evt);
		//TODO add your code for jButtonExit.actionPerformed
		System.exit(0);
	}
	
	private void jButtonClearActionPerformed(ActionEvent evt) {
		System.out.println("jButtonClear.actionPerformed, event="+evt);
		//TODO add your code for jButtonClear.actionPerformed
		this.neustarten(0,0,7,5);
		jLabelNachbar.setVisible(false);			
		jButtonCalc.setEnabled(true);
	}

	class myTextfieldListener implements DocumentListener {

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			//System.out.println("... prüfe auf benachbart: " + px1 + " " + py1 + " " + px2 + " "  + py2);
			if (benachbart(px1, py1, px2, py2)) {
				jLabelNachbar.setVisible(true);			
				jButtonCalc.setEnabled(false);
				jTextFieldPxm.setText("");
				jTextFieldPym.setText("");
			
			}
				
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}


	}
}

