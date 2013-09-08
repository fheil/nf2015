

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
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
public class Chinesensprache extends javax.swing.JApplet {
	private JLabel jLabel1;
	private JTextField jTextField1;
	private JButton jButton1;
	private JTextArea jTextArea1;
	private JScrollPane jScrollPane1;
	private JTextField jTextField2;

	/**
	* Auto-generated main method to display this 
	* JApplet inside a new JFrame.
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				Chinesensprache inst = new Chinesensprache();
				frame.getContentPane().add(inst);
				((JComponent)frame.getContentPane()).setPreferredSize(inst.getSize());
				frame.pack();
				frame.setVisible(true);
			}
		});

	}
	
	public Chinesensprache() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			this.setSize(533, 468);
			getContentPane().setLayout(null);
			getContentPane().setBackground(new java.awt.Color(255,255,0));
			getContentPane().setForeground(new java.awt.Color(255,255,0));
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Chinesensprache");
				jLabel1.setBounds(24, 12, 167, 22);
				jLabel1.setFont(new java.awt.Font("Liberation Sans",0,20));
				jLabel1.setBackground(new java.awt.Color(23,31,210));
				jLabel1.setForeground(new java.awt.Color(0,0,255));
			}
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1);
				jTextField1.setText("   Rudi rast mit dem Roller");
				jTextField1.setBounds(36, 50, 184, 30);
			}
			{
				jTextField2 = new JTextField();
				getContentPane().add(jTextField2);
				jTextField2.setText(" hinter Herbert den Berg runter");
				jTextField2.setBounds(270, 50, 215, 30);
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("Start");
				jButton1.setBounds(43, 96, 86, 42);
				jButton1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton1ActionPerformed(evt);
					}
				});
			}
			{
				jScrollPane1 = new JScrollPane();
				getContentPane().add(jScrollPane1);
				jScrollPane1.setBounds(33, 169, 459, 265);
				{
					jTextArea1 = new JTextArea();
					jScrollPane1.setViewportView(jTextArea1);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void jButton1ActionPerformed(ActionEvent evt) {
		System.out.println("jButton1.actionPerformed, event="+evt);
		//TODO add your code for jButton1.actionPerformed
		String s1 =jTextField1.getText();
		String s2 =jTextField2.getText();
		String s3= s1.concat(s2);					//	s3 =s1 +s2
		jTextArea1.append(s3+"\n");
		jTextArea1.append("Länge= "+s3.length()+"\n");
		jTextArea1.append(s3.toLowerCase()+"\n");
		String s4 =s3.replace('r', 'l');
		s4 =s4.replace('R', 'L');
		jTextArea1.append(s4+"\n");
		jTextArea1.append(s4.trim()+"\n"+"\n");
		
		int pos=s4.indexOf('l'); //das erste l
		jTextArea1.append(s4.indexOf('l')+"\n");
		jTextArea1.append(s4.substring(pos+1).indexOf('l')+"\n");
		jTextArea1.append(s4.lastIndexOf('l')+"\n");

	}

}
