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
	/**
	 * Variables de la clase mesage este tiene el mismo mensaje,la fecha la hora y un usuario
	 */
	private static final long serialVersionUID = 1L;

	private String nombre;
	@XmlTransient
	private int afuego = 6;

	/**
	 * Constructor por defecto
	 */
	public User() {
		super();
	}

	/**
	 * Constructor entero
	 */
	public User(String nombre) {
		super();
		this.nombre = nombre;
	}

	/**
	 * Son los geters and seters y nos permite modificar y mostrar los datos de las variables
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	public String toString() {
		return "User [nombre=" + nombre + "]";
	}

}
