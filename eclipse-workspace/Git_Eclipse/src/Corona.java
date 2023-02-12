class Corona {
	/**
	 * Cercle intern
	 */
	Cercle petit;
	/**
	 * Cercle extern
	 */
	Cercle gran;

	/**
	 * Assigna els cercles a la Corona
	 * 
	 * @param p intern petit
	 * @param g extern gran
	 */
	Corona(Cercle p, Cercle g) {
		petit = p;
		gran = g;
	}

	public String toString() {
		return "cercle gran " + gran + " cercle petit " + petit;
	}

	/**
	 * Calcula l'àrea de la Corona
	 * 
	 * @return el valor obtingut
	 */
	double area() {
		return gran.area() - petit.area();
	}
}