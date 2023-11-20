package model;

import java.util.Date;

public class Profesor extends Trabajador {
	private Departamento departamento;
	private TipoContrato tipoContrato;
	public TipoContrato getTipoContrato() {
		return this.tipoContrato;
	}
	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	public Departamento getDepartamento(){
		return this.departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Profesor(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, Date horario, TipoContrato tipoContrato, Departamento departamento) {
		super(tituloProfesional,nombre,direccion,estadoCivil,rut,horario);
		this.tipoContrato = tipoContrato;
		this.departamento = departamento;
	}

	public String getTipo() {
		return "Profesor";
	}
}