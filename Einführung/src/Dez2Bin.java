

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
public class Dez2Bin extends javax.swing.JApplet {
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JButton jButton1;
	private JTextArea jTextArea1;
	private JScrollPane jScrollPane1;
	private JTextField jTextField2;
	private JTextField jTextField1;


	/**
	* Auto-generated main method to display this 
	* JApplet inside a new JFrame.
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				Dez2Bin inst = new Dez2Bin();
				frame.getContentPane().add(inst);
				((JComponent)frame.getContentPane()).setPreferredSize(inst.getSize());
				frame.pack();
				frame.setVisible(true);
			}
		});

	}
	
	public Dez2Bin() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			this.setSize(639, 438);
			getContentPane().setLayout(null);
			getContentPane().setBackground(new java.awt.Color(255,0,0));
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Dezimal \u21d2 Binär \u00a9 NF 2015");
				jLabel1.setBounds(192, 17, 241, 40);
				jLabel1.setFont(new java.awt.Font("Dialog",0,16));
				jLabel1.setBackground(new java.awt.Color(255,0,0));
				jLabel1.setForeground(new java.awt.Color(0,0,0));
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Dezimal");
				jLabel2.setBounds(28, 81, 68, 29);
			}
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("Binär");
				jLabel3.setBounds(28, 122, 49, 25);
				jLabel3.setFont(new java.awt.Font("Dialog",0,12));
			}
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1);
				jTextField1.setBounds(108, 85, 72, 22);
				jTextField1.addKeyListener(new KeyAdapter() {
					public void keyReleased(KeyEvent evt) {
						jTextField1KeyReleased(evt);
					}
				});
			}
			{
				jTextField2 = new JTextField();
				getContentPane().add(jTextField2);
				jTextField2.setBounds(106, 124, 259, 22);
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("Wandle");
				jButton1.setBounds(274, 85, 91, 22);
				jButton1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						jButton1ActionPerformed(evt);
					}
				});
			}
			{
				jScrollPane1 = new JScrollPane();
				getContentPane().add(jScrollPane1);
				jScrollPane1.setBounds(22, 171, 594, 245);
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
		String eingabe=jTextField1.getText();
		int zahl=Integer.parseInt(eingabe);
		int quotient, rest;
		String tmpstr="";
		String binaerzahl="";
		jTextArea1.setText("");
		
		
		do{
			quotient=zahl/2;
			rest=zahl%2;
			zahl=quotient;
		    //System.out.println(zahl+"\n"+quotient+"\n"+rest+"\n");
			jTextArea1.append(""+zahl+"\t"+quotient+"\t"+rest+"\n");
		    tmpstr =  tmpstr.concat(String.valueOf(rest));
		    //binaerzahl.concat(String.valueOf(rest));
			
		
			} while (quotient>0);
		
			
		for(int i=tmpstr.length()-1;i>=0;i--){
		  binaerzahl = binaerzahl.concat(tmpstr.substring(i,i+1));
		}	
		
		//jTextArea1.append(tmpstr+"\n");
		jTextField2.setText(binaerzahl);
		

		}
	
	private void jTextField1ActionPerformed(ActionEvent evt) {
		System.out.println("jTextField1.actionPerformed, event="+evt);
		//TODO add your code for jTextField1.actionPerformed
		String eingabe=jTextField1.getText();
		int zahl=Integer.parseInt(eingabe);
		int quotient, rest;
		//String tmpstr="";
		String binaerzahl="";
		
		
		do{
			quotient=zahl/2;
			rest=zahl%2;
			binaerzahl=rest+binaerzahl; //vereinfachte Variante
			zahl=quotient;
		    //System.out.println(zahl);
		    //tmpstr =  tmpstr.concat(String.valueOf(rest));
		    //binaerzahl.concat(String.valueOf(rest));
			
		
			} while (quotient>0);
		
			
		/*for(int i=tmpstr.length()-1;i>=0;i--){
		  binaerzahl = binaerzahl.concat(tmpstr.substring(i,i+1));
		}	
		
		//jTextArea1.append(tmpstr+"\n"); */
		jTextField2.setText(binaerzahl); 
		}

	
	private void jTextField1KeyReleased(KeyEvent evt) {
		System.out.println("jTextField1.keyReleased, event="+evt);
		//TODO add your code for jTextField1.keyReleased
		String eingabe=jTextField1.getText();
		
		if (!eingabe.isEmpty())
		{
			int zahl=Integer.parseInt(eingabe);
			int quotient, rest;
			String binaerzahl="";
			
			do{
				quotient=zahl/2;
				rest=zahl%2;
				zahl=quotient;
			    //System.out.println(zahl+quotient+rest); 
				binaerzahl =  String.valueOf(rest).concat(binaerzahl);
			    
				} while (quotient>0);
					
			jTextField2.setText(binaerzahl);
		}
		else
		{
			jTextField2.setText("");
		}		
	}
	}




