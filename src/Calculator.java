import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Calculator implements ActionListener {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.run();
	}

	public void run() {
		
		panel.add(add);

		panel.add(subtract);

		panel.add(divide);

		panel.add(multiply);

		panel.add(text);

		panel.add(field);

		panel.add(tf);

		frame.add(panel);
		
		frame.setVisible(true);
		
		frame.pack();
		
		frame.setSize(2000, 2000);
		
		add.setText("+");
		multiply.setText("*");
		subtract.setText("-");
		divide.setText("/");
		text.setText(" number one");
		field.setText("number two.");
		tf.setText("answer box");
		
		add.addActionListener(this);
		subtract.addActionListener(this);
		divide.addActionListener(this);
		multiply.addActionListener(this);
		
		
	}

	JFrame frame = new JFrame();
	JButton add = new JButton();
	JButton divide = new JButton();
	JButton multiply = new JButton();
	JButton subtract = new JButton();
	JPanel panel = new JPanel();
	JTextField text = new JTextField();
	JTextField field = new JTextField();
	JTextField tf = new JTextField();
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String StrOne = text.getText();
		String StrTwo = field.getText();
		
		double NumOne = Double.parseDouble(StrOne);
		double NumTwo  = Double.parseDouble(StrTwo);
		if(e.getSource() == add) {
			double ans = NumOne + NumTwo;
			
			String x =  Double.toString(ans);
			tf.setText(x);
			
		}
		if(e.getSource() == subtract) {
		double ans = NumOne - NumTwo;
			
			String x =  Double.toString(ans);
			tf.setText(x);
		}
		if(e.getSource() == multiply) {
		double ans = NumOne * NumTwo;
			
			String x =  Double.toString(ans);
			tf.setText(x);
		}
		if(e.getSource() == divide) {
		double ans = NumOne / NumTwo;
			
			String x =  Double.toString(ans);
			tf.setText(x);
		}
		
		
	}

}
