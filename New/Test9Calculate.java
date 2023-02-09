package testByME;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test9Calculate extends JFrame implements ActionListener {
	JMenuBar mb;
	JMenu op; 
	JMenuItem addItem,minusItem,dividedItem,multiplyItem,exitItem;

	JPanel p;
	JLabel l1, l2, l3;
	JTextField t1, t2, t3;
	JButton b1;
	
	public Test9Calculate() {
		
		this.setTitle("Menu Test");
		/*this.setSize(400, 200);
		this.setLocation(800, 400);*/
		this.setBounds(800, 400, 400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mb = new JMenuBar();
		op = new JMenu("Calculation");
		
		addItem = new JMenuItem("Addition");
		addItem.setMnemonic('A');
		
		minusItem = new JMenuItem("Subtraction");
		minusItem.setMnemonic('S');
		
		multiplyItem = new JMenuItem("Multiplication");
		multiplyItem.setMnemonic('M');
		
		dividedItem = new JMenuItem("Division");
		dividedItem.setMnemonic('D');
		
		exitItem = new JMenuItem("Exit");
		exitItem.setMnemonic('e');
		
		this.setJMenuBar(mb);

		mb.add(op);
		op.add(addItem);
		op.add(minusItem);
		op.add(multiplyItem);
		op.add(dividedItem);
		op.addSeparator();
		op.add(exitItem);

		addItem.addActionListener(this);
		minusItem.addActionListener(this);
		multiplyItem.addActionListener(this);
		dividedItem.addActionListener(this);
		exitItem.addActionListener(this);

		l1 = new JLabel("Number 1");
		l2 = new JLabel("Number 2");
		l3 = new JLabel("Result");

		t1 = new JTextField(5);
		t2 = new JTextField(5);
		t3 = new JTextField(5);

		b1 = new JButton("Add");
		b1.addActionListener(this);

		p = new JPanel();
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(t2);
		p.add(l3);
		p.add(t3);
		p.add(b1);

		this.add(p);
		
		p.setVisible(false);
		
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Test9Calculate();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == addItem) {
			p.setVisible(true);
			b1.setText("Add");
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
		else if (e.getSource() == minusItem) {
			p.setVisible(true);
			b1.setText("Minus");
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
		else if (e.getSource() == multiplyItem) {
			p.setVisible(true);
			b1.setText("Multiply");
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
		else if (e.getSource() == dividedItem) {
			p.setVisible(true);
			b1.setText("Divided");
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
		else if (e.getSource() == exitItem) {
			System.exit(0);
		}
		else
		{
			int n1=Integer.parseInt(t1.getText());
			int n2=Integer.parseInt(t2.getText());
			int ans;
			if(b1.getText().equals("Add"))
			{
				ans=n1+n2;
				t3.setText(Integer.toString(ans));
			}
			else if(b1.getText().equals("Minus"))
			{
				ans=n1-n2;
				t3.setText(Integer.toString(ans));
			}
			else if(b1.getText().equals("Multiply"))
			{
				ans=n1*n2;
				t3.setText(Integer.toString(ans));
			}
			else if(b1.getText().equals("Divided"))
			{
				ans=n1/n2;
				t3.setText(Integer.toString(ans));
			}
			
		}
		
	}

}
