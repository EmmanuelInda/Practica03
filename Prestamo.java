public class Prestamo {
	private Libro libro;
	private Lector lector;
	
	public Prestamo(Libro libro, Lector lector) {
		this.libro = libro;
		this.lector = lector;
	}

	public String getInformacion() {
		return "Libro: " + libro.getTitulo() + "\n" +
				"Lector: " + lector;
	}

	public Libro getLibro() {
		return libro;
	}

	public Lector getLector() {
		return lector;
	}
}
