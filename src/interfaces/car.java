package interfaces;

public class car implements Comparable<car>{

	int speed;
	int price;
	String color;

	public car(int speed, int price, String color) {
		this.speed = speed;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "s: " + speed + " p: " + price + " c: " + color;

	}

	@Override
	public int compareTo(car other) {
	  //return this.speed-other.speed;
		return other.price-this.price;
	}

}
