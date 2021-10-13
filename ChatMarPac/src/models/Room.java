package models;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="room")
public class Room {
	
	//private static final long serialVersionUID = 1L;

	private String nombreSala = "";
	private List<User> user;
	private List<Message> mensajes;

	public Room() {
		super();
	}

	public Room(String nombreSala, List<User> user, List<Message> mensajes) {
		super();
		this.nombreSala = nombreSala;
		this.user = user	;
		this.mensajes = mensajes;
	}

	public String getNombreSala() {
		return nombreSala;
	}

	public void setNombreSala(String nombreSala) {
		this.nombreSala = nombreSala;
	}
//@XmlElementWrapper(name = "user")
//@XmlElement(name = "usuario")
	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}
	//@XmlElementWrapper(name = "mensajes")
	//@XmlElement(name = "message")
	public List<Message> getMensajes() {
		return mensajes;
	}

	public void setMensajes(List<Message> mensajes) {
		this.mensajes = mensajes;
	}

	@Override
	public String toString() {
		return "Room [nombreSala=" + nombreSala + ", user=" + user + ", mensajes=" + mensajes + "]";
	}

}
