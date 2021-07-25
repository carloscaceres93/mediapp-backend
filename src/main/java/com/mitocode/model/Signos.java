package com.mitocode.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "signos", catalog = "mediappbd")
public class Signos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSigno;
	
	@Column(name = "temperatura", nullable = false, length = 50)
	private String temperatura;
	
	@Column(name = "pulso", nullable = false, length = 50)
	private String pulso;
	
	@Column(name = "ritmo", nullable = false, length = 50)
	private String ritmo;
	
	@Column(name = "fecha", nullable = false)
	private LocalDate fecha;
	
	@ManyToOne
	@JoinColumn(name = "paciente", nullable = false)
	private Paciente paciente;
	
	public Integer getIdSigno() {
		return idSigno;
	}
	public void setIdSigno(Integer idSigno) {
		this.idSigno = idSigno;
	}
	public String getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	public String getPulso() {
		return pulso;
	}
	public void setPulso(String pulso) {
		this.pulso = pulso;
	}
	public String getRitmo() {
		return ritmo;
	}
	public void setRitmo(String ritmo) {
		this.ritmo = ritmo;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Signo [idSigno=" + idSigno + ", temperatura=" + temperatura + ", pulso=" + pulso + ", ritmo=" + ritmo
				+ ", paciente=" + paciente + "]";
	} 
	
	
}
