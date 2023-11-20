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
	public Departamento getDepartamento(){
		return this.departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public CarreraUniversitaria(String nombre, Departamento departamento) {
		this.nombre = nombre;
		this.departamento = departamento;
	}
}