package models;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nombre; 
	protected List<Message> mensajes; 
	@XmlTransient
	private int afuego = 6;

	public User() {
		super();
	}

	public User(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "User [nombre=" + nombre + "]";
	}

}
