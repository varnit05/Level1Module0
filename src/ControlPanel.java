import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ControlPanel {


	public static void main(String[] args) {
		ControlPanel control = new ControlPanel();
		control.run();

	}

	JFrame frame = new JFrame();

	JPanel VisitorPanel = new JPanel();

	JPanel HomePanel = new JPanel();

	JPanel MainPanel = new JPanel();

	JLabel VisitorFoulsLabel = new JLabel();
	JLabel VisitorTimeoutsLabel = new JLabel();

	JLabel HomeTimeoutsLabel = new JLabel();
	JLabel HomeFoulslabel = new JLabel();
	
	JLabel HomePointsLabel = new JLabel();
	JLabel VisitorPointsLabel = new JLabel();

	JButton HomeName = new JButton("Home");
	JButton VisitorName = new JButton("Visitor");

	JButton VisitorPointsPlus1 = new JButton();
	JButton VisitorPointsMinus1 = new JButton();
	JButton HomePointsPlus1 = new JButton();
	JButton HomePointsMinus1 = new JButton();
	
	JButton VisitorTimeoutsPlus1 = new JButton();
	JButton HomeTimeoutsPlus1 = new JButton();
	JButton VisitorTimeoutsMinus1 = new JButton();
	JButton HomeTimeoutsMinus1 = new JButton();
	
	JButton VisitorFoulsPlus1 = new JButton();
	JButton HomeFoulsMinus1 = new JButton();
	JButton VisitorFoulsMinus1 = new JButton();
	JButton HomeFoulsPlus1 = new JButton();

	public void run() {
		VisitorPanel.add(VisitorFoulsLabel);
		VisitorPanel.add(VisitorTimeoutsLabel);
		VisitorPanel.add(VisitorPointsLabel);
		VisitorPanel.add(VisitorName);
		
		
		VisitorPanel.add(VisitorFoulsPlus1);
		VisitorPanel.add(VisitorFoulsMinus1);
		
		VisitorPanel.add(VisitorTimeoutsPlus1);
		VisitorPanel.add(VisitorTimeoutsMinus1);
		
		VisitorPanel.add(VisitorPointsPlus1);
		VisitorPanel.add(VisitorPointsMinus1);
	
		
		
		
		
		HomePanel.add(HomeFoulslabel);
		HomePanel.add(HomeTimeoutsLabel);
		HomePanel.add(HomePointsLabel);
		HomePanel.add(HomeName);
		
		
		HomePanel.add(HomeFoulsPlus1);
		HomePanel.add(HomeFoulsMinus1);
		
		HomePanel.add(HomeTimeoutsPlus1);
		HomePanel.add(HomeTimeoutsMinus1);
		
		HomePanel.add(HomePointsPlus1);
		HomePanel.add(HomePointsMinus1);
		
		MainPanel.add(HomePanel);
		MainPanel.add(VisitorPanel);
		
		frame.add(MainPanel);
		
		frame.setVisible(true);
		
		frame.pack();
}
}




























