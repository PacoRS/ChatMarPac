package models;

import java.io.Serializable;
import java.time.LocalDate;

import java.time.LocalDateTime;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "mensajes")
public class Message implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String mensaje = "";
	private LocalDateTime fechaHora = LocalDateTime.now();
	private User u = new User("");
	
	
	public Message() {
		super();
	}


	public Message(String mensaje, LocalDateTime fechaHora, User u) {
		super();
		this.mensaje = mensaje;
		this.fechaHora = fechaHora;
		this.u = u;
	}


	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}


	public LocalDateTime getFechaHora() {
		return fechaHora;
	}


	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}


	public User getU() {
		return u;
	}


	public void setU(User u) {
		this.u = u;
	}


	
	public String toString() {
		return "Message [mensaje=" + mensaje + ", fechaHora=" + fechaHora + ", u=" + u + "]";
	}
		
}
