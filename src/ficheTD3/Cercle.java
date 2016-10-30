package ficheTD3;

public class Cercle {

	private double rayon;
	public Point centre = new Point();

	public Cercle(Point centre, double rayon) {

		this.centre = centre;
		this.rayon = rayon;

	}

	public Cercle(double rayon) {

		this(new Point(), rayon);
	}

	public float périmètre(double rayon) {

		return  (2 * rayon * Math.PI);
	}

	public Cercle symetrie(Point centre) {

		return new Cercle(centre.symertie(), rayon);
	}

	@Override
	public String toString() {
		return " rayon=" + rayon + ", centre=" + centre.toString() + "";
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
