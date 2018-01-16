import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Scoreboard {
	public static void main(String[] args) {
		Scoreboard scoreBoard = new Scoreboard();

	}

	JFrame frame = new JFrame();
	JPanel timePanel = new JPanel();
	JPanel VisitorPanel = new JPanel();
	JPanel HomePanel = new JPanel();
	JLabel VisitorLabel = new JLabel();
	JLabel HomeLabel = new JLabel();
	JLabel VisitorTimeoutsLabel = new JLabel();
	JLabel HomeTimeoutsLabel = new JLabel();
	JLabel HomeFoulslabel = new JLabel();
	JLabel HomeFoulsLabel = new JLabel();
	JLabel VisitorFoulsLabel = new JLabel();
	JLabel VisitorScoreLabel = new JLabel();
	JLabel HomeScoreLabel = new JLabel();
	JLabel TimeLabel = new JLabel();

	String HomeName;
	String VisitorName;
	int HomeScore;
	int VisitorScore;
	int HomeFouls;
	int Visitorfouls;
	int HomeTimouts;
	int VistorTimeouts;

	public Scoreboard() {
		this.HomeName = "HOME";
		HomeLabel.setText(this.HomeName);

		this.VisitorName = "Visitor";
		VisitorLabel.setText(this.VisitorName);

		this.HomeFouls = 0;
		HomeFoulsLabel.setText("Fouls: " + Integer.toString(this.HomeFouls));

		this.Visitorfouls = 0;
		VisitorFoulsLabel.setText("Fouls: " + Integer.toString(this.Visitorfouls));

		this.HomeTimouts = 3;
		HomeTimeoutsLabel.setText("Timeouts: " + Integer.toString(this.HomeTimouts));

		this.VistorTimeouts = 3;
		VisitorTimeoutsLabel.setText("Timeouts: " + Integer.toString(this.VistorTimeouts));

		this.HomeScore = 00;
		HomeScoreLabel.setText("score: " + Integer.toString(this.HomeScore));

		this.VisitorScore = 00;
		VisitorScoreLabel.setText("score: " + Integer.toString(this.VisitorScore));

		run();
	}

	void run() {
		timePanel.add(TimeLabel);
		VisitorPanel.add(VisitorFoulsLabel);
		VisitorPanel.add(VisitorScoreLabel);
		VisitorPanel.add(VisitorScoreLabel);
		VisitorPanel.add(VisitorTimeoutsLabel);

		HomePanel.add(HomeFoulsLabel);
		HomePanel.add(HomeScoreLabel);
		HomePanel.add(HomeScoreLabel);
		HomePanel.add(HomeTimeoutsLabel);

		frame.add(timePanel);
		frame.add(HomePanel);
		frame.add(VisitorPanel);

		frame.setVisible(true);
		frame.pack();

	}
}
