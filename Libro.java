import java.time.Year;

public class Libro {
	private String titulo;
	private String autor;
	private int anyoPublicacion;
	private String isbn;

	public Libro(String titulo, String autor, int anyoPublicacion, String isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.anyoPublicacion = anyoPublicacion;
		this.isbn = isbn;
	}

	public void mostrarInformacion() {
		System.out.println("Titulo: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Anyo de publicacion: " + anyoPublicacion);
		System.out.println("ISBN: " + isbn + "\n");
	}

	public boolean esAntiguo(Libro libro) {
		int anyoActual = Year.now().getValue();

		return (anyoActual - anyoPublicacion) > 20;
	}

	public String getTitulo() {
		return titulo;
	}
}