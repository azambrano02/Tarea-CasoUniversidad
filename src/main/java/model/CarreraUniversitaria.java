package model;

public class CarreraUniversitaria {
	private String nombre;
	private Departamento departamento;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CarreraUniversitaria(String nombre) {
		throw new UnsupportedOperationException();
	}
}