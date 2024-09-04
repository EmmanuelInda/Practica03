public class Lab03 {
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();

		biblioteca.agregarLibro(new Libro("Luna de Pluton", "Dross", 2015, "978-6070731747"));
		biblioteca.agregarLibro(new Libro("The C Programming Language (2nd Edition)", "Brian W. Kernighan, Dennis M. Ritchie", 1988, "978-0131103627"));
		biblioteca.agregarLibro(new Libro("Programación orientada a objetos con Java usando BlueJ", "David J. Barnes, Michael Kölling", 2017, "978-8490355312"));
		biblioteca.agregarLibro(new Libro("Libro", "Autor 1", 2000, "978-0000000000"));
		biblioteca.agregarLibro(new Libro("Libro", "Autor 2", 2001, "978-0000000001"));
		biblioteca.agregarLibro(new Libro("Libro", "Autor 3", 2002, "978-0000000002"));
		biblioteca.mostrarLibros();
		biblioteca.buscarLibroPorTituloLibroPorTitulo("The C Programming Language (2nd Edition)");
		biblioteca.buscarLibroPorTituloLibroPorTitulo("Libro");
	}
}