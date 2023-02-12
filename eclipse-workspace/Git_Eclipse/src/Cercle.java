class Cercle {
	/**
	 * radi del cercle
	 */
	double radi;

	/**
	 * Constructor, assigna al cercle el radi indicat
	 * 
	 * @param r radi del cercle
	 */
	Cercle(double r) {
		radi = r;
	}

	public String toString() {
		return "radi:" + radi;
	}

	/**
	 * Calcula l'àrea del cercle segons Pi*radi^2
	 * 
	 * @return l'àrea calculada
	 */
	double area() {
		return Math.PI * Math.pow(radi, 2);
	}
}