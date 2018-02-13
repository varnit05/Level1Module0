import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ControlPanel {

	public static void main(String[] args) {
		ControlPanel control = new ControlPanel();
		control.run();
		
	}
	Scoreboard score = new Scoreboard();

	JFrame frame = new JFrame();

	JPanel VisitorPanel = new JPanel();

	JPanel HomePanel = new JPanel();

	JPanel HomeTimeoutsPanel = new JPanel();

	JPanel VisitorTimeoutsPanel = new JPanel();

	JPanel MainPanel = new JPanel();

	JLabel VisitorFoulsLabel = new JLabel("Visitor Fouls:");
	JLabel VisitorTimeoutsLabel = new JLabel("Visitor Timeouts:");

	JLabel HomeTimeoutsLabel = new JLabel("Home Timeouts:");
	JLabel HomeFoulslabel = new JLabel("Home Fouls:");

	JLabel HomePointsLabel = new JLabel("Home Points:");
	JLabel VisitorPointsLabel = new JLabel("Visitor Points:");

	JTextField HomeName = new JTextField("Home:");
	JTextField VisitorName = new JTextField("Visitor:");

	JButton VisitorPointsPlus1 = new JButton("+1");
	JButton VisitorPointsMinus1 = new JButton("-1");
	JButton HomePointsPlus1 = new JButton("+1");
	JButton HomePointsMinus1 = new JButton("-1");

	JButton VisitorTimeoutsPlus1 = new JButton("+1");
	JButton HomeTimeoutsPlus1 = new JButton("+1");
	JButton VisitorTimeoutsMinus1 = new JButton("-1");
	JButton HomeTimeoutsMinus1 = new JButton("-1");

	JButton VisitorFoulsPlus1 = new JButton("+1");
	JButton HomeFoulsMinus1 = new JButton("-1");
	JButton VisitorFoulsMinus1 = new JButton("-1");
	JButton HomeFoulsPlus1 = new JButton("+1");

	public void run() {
		score.run();
	
		MainPanel.setLayout(new BoxLayout(MainPanel, BoxLayout.X_AXIS));
		HomePanel.setLayout(new BoxLayout(HomePanel, BoxLayout.PAGE_AXIS));
		VisitorPanel.setLayout(new BoxLayout(VisitorPanel, BoxLayout.PAGE_AXIS));

		VisitorPanel.add(VisitorName);

		VisitorPanel.add(VisitorFoulsLabel);
		VisitorPanel.add(VisitorFoulsPlus1);
		VisitorPanel.add(VisitorFoulsMinus1);

		VisitorPanel.add(VisitorPointsLabel);
		VisitorPanel.add(VisitorPointsPlus1);
		VisitorPanel.add(VisitorPointsMinus1);

		VisitorPanel.add(VisitorTimeoutsLabel);
		VisitorPanel.add(VisitorTimeoutsPlus1);
		VisitorPanel.add(VisitorTimeoutsMinus1);

		HomePanel.add(HomeName);

		HomePanel.add(HomeFoulslabel);
		HomePanel.add(HomeFoulsPlus1);
		HomePanel.add(HomeFoulsMinus1);

		HomePanel.add(HomePointsLabel);

		HomePanel.add(HomePointsPlus1);
		HomePanel.add(HomePointsMinus1);

		HomePanel.add(HomeTimeoutsLabel);

		HomePanel.add(HomeTimeoutsPlus1);
		HomePanel.add(HomeTimeoutsMinus1);

		MainPanel.add(HomePanel);

		MainPanel.add(VisitorPanel);

		frame.add(MainPanel);

		MainPanel.add(HomePanel);
		MainPanel.add(VisitorPanel);
		

		HomeFoulsPlus1.setVisible(true);
		frame.setVisible(true);
		
		frame.setVisible(true);
		frame.setVisible(true);
		
		frame.setVisible(true);
		frame.setVisible(true);
		
		frame.setVisible(true);
		frame.setVisible(true);
		
		frame.setVisible(true);
		frame.setVisible(true);
		
		frame.setVisible(true);
		frame.setVisible(true);
		
		
		

		frame.setVisible(true);

		frame.pack();
	}
}

























