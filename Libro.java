import java.time.Year;

public class Libro {
	private String titulo;
	private Autor autor;
	private int anyoPublicacion;
	private String isbn;
	private boolean prestado;

	public Libro(String titulo, Autor autor, int anyoPublicacion, String isbn) {
		this(titulo, autor, anyoPublicacion, isbn, false);
	}

	public Libro(String titulo, Autor autor, int anyoPublicacion, String isbn, boolean prestado) {
		this.titulo = titulo;
		this.autor = autor;
		this.anyoPublicacion = anyoPublicacion;
		this.isbn = isbn;
		this.prestado = prestado;
	}

	public String getInformacion() {
		return "Titulo: " + titulo + "\n" +
				"Autor: " + autor + "\n" +
				"Anyo de publicacion: " + anyoPublicacion + "\n" +
				"ISBN: " + isbn + "\n" +
				"Prestado: " + (prestado ? "Si" : "No");
	}

	public boolean esAntiguo(Libro libro) {
		int anyoActual = Year.now().getValue();

		return (anyoActual - anyoPublicacion) > 20;
	}

	public String getTitulo() {
		return titulo;
	}

	public boolean isPrestado() {
		return prestado;
	}
}