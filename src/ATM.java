import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ATM implements ActionListener {
	public static void main(String[] args) {
		ATM Atm = new ATM();
		Atm.run();

	}

	JFrame frame = new JFrame("ATM");
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JTextField Depfield = new JTextField("Deposit");
	JTextField Withfield = new JTextField("Withdraw");
	JTextField Available = new JTextField("Available:$100");
	JButton Dep = new JButton("Amount");
	JButton With = new JButton("Amount");
	JPanel Main = new JPanel();

	public void run() {

		panel.add(Depfield);

		panel.add(Dep);

		frame.add(panel);

		frame.setVisible(true);

		panel1.add(Withfield);

		panel1.add(With);

		frame.add(panel1);

		frame.setVisible(true);

		frame.pack();

		panel2.add(Available);

		frame.add(panel2);

		frame.setVisible(true);

		frame.pack();

		Main.add(panel);

		Main.add(panel1);

		Main.add(panel2);

		frame.add(Main);

		Dep.addActionListener(this);
		With.addActionListener(this);

		frame.pack();

		Main.setLayout(new BoxLayout(Main, BoxLayout.Y_AXIS));

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String Depositamount = Depfield.getText();
		String Withdrawamount = Withfield.getText();
		
		double DepositNum = Double.parseDouble(Depositamount);
		double Withdrawnum  = Double.parseDouble(Withdrawamount);
		
		if(e.getSource() == ) {
		double ans = DepositNum - Withdrawnum;
		if (Dep.)) {
			
		}
		
		}
	}
}