package model;

import java.util.Date;


public class Administrativo extends Trabajador {
	private Departamento departamento;

	public Departamento getDepartamento(){
		return this.departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Administrativo(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, Date horario, Departamento departamento) {
		super(tituloProfesional,nombre,direccion,estadoCivil,rut,horario);
		this.departamento = departamento;
	}

	public TipoTrabajador getTipo() {
		return TipoTrabajador.ADMINISTRATIVO;
	}
}