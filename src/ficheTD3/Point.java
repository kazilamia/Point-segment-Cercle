package ficheTD3;

public class Point {
	private double x;
	private double y;

	public Point() {
		this.x = 0;
		this.y = 0;
	}

	Point(double x) {
		this.x = x;
		this.y = x;
	}

	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point symertie() {

		return new Point(-x, y);

	}

	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

}
