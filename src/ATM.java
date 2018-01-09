import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ATM implements ActionListener {
	public static void main(String[] args) {
		ATM Atm = new ATM();
		Atm.run();

	}

	double total = 100;
	JFrame frame = new JFrame("ATM");
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JTextField Depfield = new JTextField("Deposit");
	JTextField Withfield = new JTextField("Withdraw");
	JTextField Available = new JTextField("Available:$" + total);
	JButton Dep = new JButton("Amount");
	JButton With = new JButton("Amount");
	JPanel Main = new JPanel();

	public void run() {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

		if (e.getSource() == Dep) {
			System.out.println(Dep);
			double DepositNum = Double.parseDouble(Depositamount);
			total = total + DepositNum;
			Available.setText("Available:$" + total);
		}

		if (e.getSource() == With) {
			System.out.println(With);
			double Withdrawnum = Double.parseDouble(Withdrawamount);
			if (Withdrawnum > total) {
				Available.setText("ERROR, balance :" + total);
				JOptionPane.showMessageDialog(null,
						"You are withdrawing more money than you have available, You're not that rich");

			}
			else {
				
			
			total = total - Withdrawnum;
			Available.setText("Available:$" + total);

			}
		}
	}
}