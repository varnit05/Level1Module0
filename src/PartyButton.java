import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PartyButton implements ActionListener {
public static void main(String[] args) {
	PartyButton Pb  = new PartyButton();
	Pb.run();
}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();


void run() {
	button.setText("PARTY");
	panel.add(button);
	frame.add(panel);
	button.addActionListener(this);
	frame.setVisible(true);
	frame.pack();
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (condition) {
		
	}
}
}