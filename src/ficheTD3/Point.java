package ficheTD3;

public class Point {
	private float abcisse;
	private float ordonne;

	public Point() {
		this.abcisse = 0;
		this.ordonne = 0;
	}

	Point(float abcisse) {
		this.abcisse = abcisse;
		this.ordonne = abcisse;
	}

	Point(float abcisse, float ordonne) {
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

	public void setAbcisse(float abcisse) {
		this.abcisse = abcisse;
	}

	public void setOrdonne(float ordonne) {
		this.ordonne = ordonne;
	}

	public float getAbcisse() {
		return abcisse;
	}

	public float getOrdonne() {
		return ordonne;
	}

}
