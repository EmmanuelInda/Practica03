import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Libro> libros;

	public Biblioteca() {
		libros = new ArrayList<>();
	}

	public void agregarLibro(Libro libro) {
		this.libros.add(libro);
	}

	public void mostrarLibros() {
		for (Libro libro : this.libros) {
			System.out.println("Informacion del libro");
			libro.mostrarInformacion();
		}
	}

	public void buscarLibroPorTituloLibroPorTitulo(String titulo) {
		for (Libro libro : this.libros) {
			if (titulo.equals(libro.getTitulo())) {
				System.out.println("Libro por titulo");
				libro.mostrarInformacion();
			}
		}
	}
}
