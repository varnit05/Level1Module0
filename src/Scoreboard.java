import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Scoreboard {
	public static void main(String[] args) {
		Scoreboard scoreBoard = new Scoreboard();

	}

	JFrame frame = new JFrame();
	JPanel VisitorPanel = new JPanel();
	JPanel HomePanel = new JPanel();
	JPanel MainPanel = new JPanel();
	JPanel HomeFoulsPanel = new JPanel();
	JPanel VisitorFoulsPanel = new JPanel();
	JButton VisitorButton = new JButton();
	JButton HomeButton = new JButton();
	JLabel VisitorTimeoutsLabel = new JLabel();
	JLabel HomeTimeoutsLabel = new JLabel();
	JLabel HomeFoulslabel = new JLabel();
	JLabel HomeFoulsLabel = new JLabel();
	JLabel VisitorFoulsLabel = new JLabel();
	JButton VisitorScoreButton = new JButton();
	JButton HomeScoreButton = new JButton();
	JButton HomeName = new JButton("Home");
	JButton VisitorName = new JButton("Visitor");
	


	int HomeScore;
	int VisitorScore;
	int HomeFouls;
	int Visitorfouls;
	int HomeTimouts;
	int VistorTimeouts;

	public Scoreboard() {


		this.HomeFouls = 0;
		HomeFoulsLabel.setText(" Fouls: " + Integer.toString(this.HomeFouls));

		this.Visitorfouls = 0;
		VisitorFoulsLabel.setText(" Fouls: " + Integer.toString(this.Visitorfouls));

		this.HomeTimouts = 3;
		HomeTimeoutsLabel.setText(" Timeouts: " + Integer.toString(this.HomeTimouts));

		this.VistorTimeouts = 3;
		VisitorTimeoutsLabel.setText(" Timeouts: " + Integer.toString(this.VistorTimeouts));

		this.HomeScore = 00;
		HomeScoreButton.setText("score: " + Integer.toString(this.HomeScore));

		this.VisitorScore = 00;
		VisitorScoreButton.setText("score: " + Integer.toString(this.VisitorScore));

		run();
	}

	void run() {
		frame.setSize(1000, 75);
		MainPanel.setLayout(new BorderLayout());
		HomePanel.setLayout(new BorderLayout());
		VisitorPanel.setLayout(new BorderLayout());
		HomeFoulsPanel.setLayout(new BorderLayout());
        VisitorFoulsPanel.setLayout(new BorderLayout());
		
		VisitorPanel.add(VisitorName,BorderLayout.NORTH);
		VisitorPanel.add(VisitorScoreButton,BorderLayout.CENTER);
		VisitorPanel.add(VisitorFoulsPanel,BorderLayout.SOUTH);
		VisitorFoulsPanel.add(VisitorTimeoutsLabel,BorderLayout.WEST);
		VisitorFoulsPanel.add(VisitorFoulsLabel,BorderLayout.EAST);

		HomePanel.add(HomeName,BorderLayout.NORTH);
		HomePanel.add(HomeScoreButton,BorderLayout.CENTER);
		HomePanel.add(HomeFoulsPanel, BorderLayout.SOUTH);
		HomeFoulsPanel.add(HomeTimeoutsLabel,BorderLayout.WEST);
		HomeFoulsPanel.add(HomeFoulsLabel,BorderLayout.EAST);
		

		
	
		MainPanel.add(HomePanel,BorderLayout.WEST);
		MainPanel.add(VisitorPanel,BorderLayout.EAST);
		
		frame.add(MainPanel);

		frame.setVisible(true);
		frame.pack();

	}
	public void setHomeScore(int Score) {
		this.HomeScore = Score;
	}
}
