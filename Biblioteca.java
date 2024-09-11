import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Libro> libros;
	private ArrayList<Prestamo> prestamos;

	public Biblioteca() {
		libros = new ArrayList<>();
		prestamos = new ArrayList<>();
	}

	public void agregarLibro(Libro libro) {
		this.libros.add(libro);
	}

	public void prestarLibro(Libro libro, Lector lector) {
		Prestamo prestamo = new Prestamo(libro, lector);

		prestamos.add(prestamo);
		libro.setPrestado(true);
	}

	public void devolverLibro(Libro libro) {
		Prestamo prestamoAEliminar = null;

		for (Prestamo prestamo : prestamos) {
			if (prestamo.getLibro().equals(libro)) {
				prestamoAEliminar = prestamo;
				libro.setPrestado(false);
				break;
			}
		}

		if (prestamoAEliminar != null)
			prestamos.remove(prestamoAEliminar);
	}

	public ArrayList<String> getInformacionLibros() {
		ArrayList<String> libros = new ArrayList<>();

		for (Libro libro : this.libros) {
			libros.add(libro.getInformacion());
		}

		return libros;
	}

	public ArrayList<String> getInformacionLibrosPorTitulo(String titulo) {
		ArrayList<String> libros = new ArrayList<>();

		for (Libro libro : this.libros) {
			if (titulo.equals(libro.getTitulo())) {
				libros.add(libro.getInformacion());
			}
		}

		return libros;
	}

	public ArrayList<String> getInformacionLibrosPrestados(boolean prestado) {
		ArrayList<String> libros = new ArrayList<>();

		for (Libro libro : this.libros) {
			if (libro.isPrestado() == prestado) {
				libros.add(libro.getInformacion());
			}
		}

		return libros;
	}

	public ArrayList<String> getPrestamos() {
		ArrayList<String> prestamos = new ArrayList<>();

		for (Prestamo prestamo : this.prestamos) {
			prestamos.add(prestamo.getInformacion());
		}

		return prestamos;
	}
}
