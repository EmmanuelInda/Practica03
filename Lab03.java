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

	public static void mostrarPrestamos(Biblioteca biblioteca) {
		ArrayList<String> prestamos = biblioteca.getPrestamos();

		for (String prestamo : prestamos) {
			System.out.println("Prestamo");
			System.out.println(prestamo + "\n");
		}
	}

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		
		biblioteca.agregarLibro(new Libro("Luna de Pluton", new Autor(0, "Dross", "correo00@email.com"), 2015, "978-6070731747"));
		biblioteca.agregarLibro(new Libro("Programación orientada a objetos con Java usando BlueJ", new Autor(2, "David J. Barnes, Michael Kölling", "correo02@email.com"), 2017, "978-8490355312"));
		biblioteca.agregarLibro(new Libro("Libro", new Autor(4, "Autor 2", "correo04@email.com"), 2001, "978-0000000001"));
		
		Libro libro1 = new Libro("The C Programming Language (2nd Edition)", new Autor(1, "Brian W. Kernighan, Dennis M. Ritchie",  "correo01@email.com"), 1988, "978-0131103627");
		Libro libro2 = new Libro("Libro00", new Autor(3, "Autor 1", "correo03@email.com"), 2000, "978-0000000000");
		Libro libro3 = new Libro("Libro01", new Autor(5, "Autor 3", "correo05@email.com"), 2002, "978-0000000002");

		biblioteca.agregarLibro(libro1);
		biblioteca.agregarLibro(libro2);
		biblioteca.agregarLibro(libro3);

		biblioteca.prestarLibro(libro1, new Lector(0, "Lector00", "lector00@email.xyz"));
		biblioteca.prestarLibro(libro2, new Lector(1, "Lector01", "lector01@email.xyz"));
		biblioteca.prestarLibro(libro3, new Lector(2, "Lector02", "lector02@email.xyz"));

		mostrarLibros(biblioteca);
		mostrarLibrosPorTitulo(biblioteca, "The C Programming Language (2nd Edition)");
		mostrarLibrosPorTitulo(biblioteca, "Libro");
		mostrarLibrosPrestados(biblioteca, true);
		mostrarLibrosPrestados(biblioteca, false);
		mostrarPrestamos(biblioteca);

		biblioteca.devolverLibro(libro2);
		biblioteca.devolverLibro(libro3);

		mostrarPrestamos(biblioteca);
	}
}