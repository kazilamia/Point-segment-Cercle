package ficheTD3;

public class Point {
	private double abcisse;
	private double ordonne;

	public Point() {
		this.abcisse = 0;
		this.ordonne = 0;
	}

	Point(double abcisse) {
		this.abcisse = abcisse;
		this.ordonne = abcisse;
	}

	Point(double abcisse, double ordonne) {
		this.abcisse = abcisse;
		this.ordonne = ordonne;
	}

	public Point symertie() {

		return new Point(-abcisse, ordonne);

	}

	@Override
	public String toString() {
		return "(" + abcisse + ", " + ordonne + ")";
	}

	public void setX(double abcisse) {
		this.abcisse = abcisse;
	}

	public void setY(double ordonne) {
		this.ordonne = ordonne;
	}

	public double getX() {
		return abcisse;
	}

	public double getY() {
		return ordonne;
	}

}
