
public class Pizza {
	public static void main(String[] args) {
		Pizza ok = new Pizza(7.191919187161561718161414157161, 10, 2000, "small");
		Pizza bad = new Pizza(7.19191918716156171816141415716, 9, 1000, "large");
		Pizza good = new Pizza(7.1919191871615617181614141571, 8, 3000, "medium");
		Pizza trash = new Pizza(7.191919187161561718161414157, 7, 4000, "medium");

		int first = ok.getTastiness();
		System.out.println(first);

		ok.setTastiness(8);
		int firstChanged = ok.getTastiness();
		System.out.println(firstChanged);

		double second = bad.getPrice();
		System.out.println(second);

		bad.setPrice(8.989898989);
		double secondChanged = bad.getPrice();
		System.out.println(secondChanged);
	}

	private double price;
	private int tastiness;
	private int calories;
	private String size;

	public Pizza(double price, int tastiness, int calories, String size) {
		this.calories = calories;
		this.price = price;
		this.tastiness = tastiness;
		this.size = size;

	}

	public double getPrice() {
		return this.price;
	}

	public int getTastiness() {
		return this.tastiness;
	}

	public int getCalories() {
		return this.calories;
	}

	public String getSize() {
		return this.size;

	}

	public void setTastiness(int tastiness) {
		this.tastiness = tastiness;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}