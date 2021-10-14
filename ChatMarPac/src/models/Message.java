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
	/**
	 * Variables de la clase mesage este tiene el mismo mensaje,la fecha la hora y un usuario
	 */
	private static final long serialVersionUID = 1L;
	
	private String mensaje = "";
	private LocalDateTime fechaHora = LocalDateTime.now();
	private User u = new User("");
	
	/**
	 * Constructor por defecto
	 */
	public Message() {
		super();
	}

	/**
	 * Constructor entero
	 */
	public Message(String mensaje, LocalDateTime fechaHora, User u) {
		super();
		this.mensaje = mensaje;
		this.fechaHora = fechaHora;
		this.u = u;
	}

	/**
	 * Son los geters and seters y nos permite modificar y mostrar los datos de las variables
	 */
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
