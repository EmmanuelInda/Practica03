import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Libro> libros;

	public Biblioteca() {
		libros = new ArrayList<>();
	}

	public void agregarLibro(Libro libro) {
		this.libros.add(libro);
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
}
