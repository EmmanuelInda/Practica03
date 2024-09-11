import java.util.ArrayList;

public class Lab03 {
	public static void mostrarLibros(Biblioteca biblioteca) {
		ArrayList<String> libros = biblioteca.getInformacionLibros();

		for (String libro : libros) {
			System.out.println("Informacion libro");
			System.out.println(libro + "\n");
		}
	}

	public static void mostrarLibrosPorTitulo(Biblioteca biblioteca, String titulo) {
		ArrayList<String> libros = biblioteca.getInformacionLibrosPorTitulo(titulo);

		for (String libro : libros) {
			System.out.println("Libro con titulo: \"" + titulo + "\"");
			System.out.println(libro + "\n");
		}
	}

	public static void mostrarLibrosPrestados(Biblioteca biblioteca, boolean prestado) {
		ArrayList<String> libros = biblioteca.getInformacionLibrosPrestados(prestado);

		for (String libro : libros) {
			System.out.println("Informacion libro prestado");
			System.out.println(libro + "\n");
		}
	}

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		
		biblioteca.agregarLibro(new Libro("Luna de Pluton", new Autor(0, "Dross", "correo00@email.com"), 2015, "978-6070731747"));
		biblioteca.agregarLibro(new Libro("The C Programming Language (2nd Edition)", new Autor(1, "Brian W. Kernighan, Dennis M. Ritchie",  "correo01@email.com"), 1988, "978-0131103627", true));
		biblioteca.agregarLibro(new Libro("Programación orientada a objetos con Java usando BlueJ", new Autor(2, "David J. Barnes, Michael Kölling", "correo02@email.com"), 2017, "978-8490355312"));
		biblioteca.agregarLibro(new Libro("Libro", new Autor(3, "Autor 1", "correo03@email.com"), 2000, "978-0000000000", true));
		biblioteca.agregarLibro(new Libro("Libro", new Autor(4, "Autor 2", "correo04@email.com"), 2001, "978-0000000001"));
		biblioteca.agregarLibro(new Libro("Libro", new Autor(5, "Autor 3", "correo05@email.com"), 2002, "978-0000000002", true));

		mostrarLibros(biblioteca);
		mostrarLibrosPorTitulo(biblioteca, "The C Programming Language (2nd Edition)");
		mostrarLibrosPorTitulo(biblioteca, "Libro");
		mostrarLibrosPrestados(biblioteca, true);
		mostrarLibrosPrestados(biblioteca, false);
	}
}