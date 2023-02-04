package GUITest;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class StudentTest extends JFrame implements ActionListener {
	JLabel lbName = new JLabel("Student Name");
	JLabel lbRno = new JLabel("Roll Number");
	JLabel lbMajor = new JLabel("Major");
	JLabel lbHobbies = new JLabel("Hobbies");
	JLabel lbAddress = new JLabel("Address");
	
	JTextField txtName = new JTextField();
	JTextField txtRono = new JTextField();
	
	JRadioButton rdoIT = new JRadioButton("IT");
	JRadioButton rdoNet = new JRadioButton("Networking");
	JRadioButton rdoEC = new JRadioButton("EC");
	JRadioButton rdoCivil = new JRadioButton("Civil");
	ButtonGroup group = new ButtonGroup();
	
	JTextArea taAddress = new JTextArea();
	
	JCheckBox chkGame = new JCheckBox("Game");
	JCheckBox chkInternet = new JCheckBox("Internet");
	JCheckBox chkStudying = new JCheckBox("Studying");
	
	JButton btnOk = new JButton("OK");
	JButton btnCancle = new JButton("Cancle");
	
	
	public StudentTest() {
		this.setTitle("Spagetti Order");
		this.setSize(600, 300);
		this.setLocation(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel rdoPanel = new JPanel();
		rdoPanel.setBorder(BorderFactory.createEtchedBorder());
		rdoPanel.add(rdoIT);
		rdoPanel.add(rdoNet);
		rdoPanel.add(rdoEC);
		rdoPanel.add(rdoCivil);
		
		group.add(rdoIT);
		group.add(rdoNet);
		group.add(rdoEC);
		group.add(rdoCivil);
		
		JPanel chkPanel = new JPanel();
		chkPanel.setBorder(BorderFactory.createEtchedBorder());
		chkPanel.add(chkGame);
		chkPanel.add(chkInternet);
		chkPanel.add(chkStudying);
		
		JPanel p1 = new JPanel(); 
		p1.setBorder(BorderFactory.createEtchedBorder());
		p1.setLayout(new GridLayout(5,2));
		p1.add(lbName);
		p1.add(txtName);
		p1.add(lbRno);
		p1.add(txtRono);
		p1.add(lbMajor);
		p1.add(rdoPanel);
		p1.add(lbAddress);
		p1.add(taAddress);
		p1.add(lbHobbies);
		p1.add(chkPanel);
		
		JPanel p2 = new JPanel(); 
		p2.setBorder(BorderFactory.createEtchedBorder());
		p2.add(btnOk);
		p2.add(btnCancle);
		
		btnOk.addActionListener(this);
		btnCancle.addActionListener(this);
		
		Container contentPane = this.getContentPane();
		contentPane.add(p1,BorderLayout.CENTER);
		contentPane.add(p2,BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnOk) {
			
			String res = "Student Name = " + txtName.getText();
			
			res += "\n Roll Number = " + txtRono.getText();
			
			res += "\n Major = " + (rdoIT.isSelected() ? "IT" :
								 	rdoNet.isSelected() ? "Networking" : 
								 	rdoCivil.isSelected() ? "Civil" :
								 	rdoEC.isSelected() ? "EC" : "");
			
			res += "\n Address = " + taAddress.getText();
			
			res += "\n Hobbies = " + ((chkGame.isSelected() ? "Game" : "") + ", " +
								      (chkInternet.isSelected() ? "Internet" : "") + ", " +
								      (chkStudying.isSelected() ? "Studying" : ""));
			
			JOptionPane.showMessageDialog(this, res);
			txtName.setText("");
			txtRono.setText("");
			txtName.setText("");
			taAddress.setText("");
			group.clearSelection();
			chkGame.setSelected(false);
			chkInternet.setSelected(false);
			chkStudying.setSelected(false);
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StudentTest();
	}

}
