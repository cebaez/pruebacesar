package com.empresa.proyecto.emtity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name = "PERSONA")
@Entity
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "MY_SEQ_PERSONA")
	@SequenceGenerator(name = "MY_SEQ_PERSONA", sequenceName = "SEQPERSONA")
	private int id;
	
	@Column(name = "DNI", length = 10)
	private String dni;
	
	@Column(name = "NOBRE", length = 50)
	private String nombre;
	
	@Column(name = "APELLIDO_PATERNO", length = 50)
	private String apellidoPaterno;
	
	@Column(name = "APELLIDO_MATERNO", length = 50)
	private String apellidoMaterno;
	
	@Column(name = "FECHA_NACIMIENTO")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	@Column(name = "SEXO", length = 1)
	private String sexo;

	public Persona() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
