import java.awt.BorderLayout;
import java.awt.Component;

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

		MainPanel.setLayout(new BorderLayout());
		HomePanel.setLayout(new BorderLayout());
		VisitorPanel.setLayout(new BorderLayout());
	    HomeTimeoutsPanel.setLayout(new BorderLayout());
	    VisitorTimeoutsPanel.setLayout(new BorderLayout());
	    
		
		VisitorPanel.add(VisitorFoulsLabel);
		VisitorPanel.add(VisitorPointsLabel);
		VisitorPanel.add(VisitorName);
		
		
		VisitorPanel.add(VisitorFoulsPlus1);
		VisitorPanel.add(VisitorFoulsMinus1);
		
		VisitorPanel.add(VisitorTimeoutsPlus1);
		VisitorPanel.add(VisitorTimeoutsMinus1);
		
		VisitorPanel.add(VisitorPointsPlus1);
		VisitorPanel.add(VisitorPointsMinus1);
	
		
		
		
		
		HomePanel.add(HomeFoulslabel);
		HomePanel.add(HomePointsLabel);
		HomePanel.add(HomeName);
		
		
		HomePanel.add(HomeFoulsPlus1);
		HomePanel.add(HomeFoulsMinus1);
		
		HomePanel.add(HomeTimeoutsPlus1);
		HomePanel.add(HomeTimeoutsMinus1);
		
		HomePanel.add(HomePointsPlus1);
		HomePanel.add(HomePointsMinus1);
		
		HomeTimeoutsPanel.add(HomeTimeoutsLabel);
		VisitorTimeoutsPanel.add(VisitorTimeoutsLabel);
		
		MainPanel.add(HomePanel);
		MainPanel.add(HomeTimeoutsPanel);
		MainPanel.add(VisitorTimeoutsPanel);
		MainPanel.add(VisitorPanel);
		
		frame.add(MainPanel);
		
		frame.setVisible(true);
		
		
		VisitorPanel.add(VisitorName, BorderLayout.NORTH);
		VisitorPanel.add(VisitorPointsLabel, BorderLayout.CENTER);
		VisitorPanel.add(VisitorFoulsLabel, BorderLayout.SOUTH);
		
		MainPanel.add(VisitorTimeoutsPanel, BorderLayout.SOUTH);
		
		HomePanel.add(HomeName, BorderLayout.NORTH);
		HomePanel.add(HomePointsLabel, BorderLayout.CENTER);
		HomePanel.add(HomeFoulslabel, BorderLayout.SOUTH);
		

		
		MainPanel.add(HomePanel, BorderLayout.WEST);
		MainPanel.add(VisitorPanel, BorderLayout.EAST);
		MainPanel.add(VisitorTimeoutsPanel, BorderLayout.WEST);
		MainPanel.add(HomeTimeoutsPanel, BorderLayout.EAST);
		
		MainPanel.add(HomeTimeoutsPanel, BorderLayout.SOUTH);
		
		frame.pack();
}
}




























