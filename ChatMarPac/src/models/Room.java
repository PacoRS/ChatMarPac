package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="room")
public class Room implements Serializable{
	/**
	 * Variables de la clase mesage este tiene el mismo mensaje,la fecha la hora y un usuario
	 */
	private static final long serialVersionUID = 1L;

	private String nombreSala = "";
	private List<User> user= new ArrayList<>();
	private List<Message> mensajes=new ArrayList<>();

	/**
	 * Constructor por defecto
	 */
	public Room() {
		super();
	}
	
	/**
	 * Constructor entero
	 */
	public Room(String nombreSala, List<User> user, List<Message> mensajes) {
		super();
		this.nombreSala = nombreSala;
		this.user = user	;
		this.mensajes = mensajes;
	}
	
	/**
	 * Son los geters and seters y nos permite modificar y mostrar los datos de las variables
	 */
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
	public void addUser(User newUser) {
		this.user.add(newUser);
	}

	
	public String toString() {
		return "Room [nombreSala=" + nombreSala + ", user=" + user + ", mensajes=" + mensajes + "]";
	}

}
