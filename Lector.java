public class Lector {
	private int id;
	private String nombre;
	private String email;

	public Lector(int id, String nombre, String email) {
		this.id = id;
		this.nombre = nombre;
		this.email = email;
	}

	public String toString() {
		return nombre + " (" + id + ", " +  email + ")";
	}
}
