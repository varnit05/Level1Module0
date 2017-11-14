
public class PizzaRobot {
	private boolean isOnDiet;
	private String name;
	private double allowance;
	private int tasteLevel;

	public PizzaRobot(double allowance, int tasteLevel, boolean isOnDiet, String name) {

		this.allowance = allowance;
		this.isOnDiet = isOnDiet;
		this.name = name;
		this.tasteLevel = tasteLevel;
	}

	public double getallowance() {
		return this.allowance;
	}

	public int gettasteLevel() {
		return this.tasteLevel;
	}

	public boolean getisOnDiet() {
		return this.isOnDiet;
	}

	public String getname() {
		return this.name;

	}

	public void setallowance(double allowance) {
		this.allowance = allowance;
	}

	public void set(boolean isOnDiet) {
		this.isOnDiet = isOnDiet;
	}

	public void set(String name) {
		this.name = name;
	}

	public void setPrice(int tasteLevel) {
		this.tasteLevel = tasteLevel;
	}

public boolean canBuyPizza(Pizza pizza) {
	if(this.allowance)
}
}
