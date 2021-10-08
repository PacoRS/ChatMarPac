package models;

import java.util.List;

public class Room {
	private String nombreSala = "";
	private List<User> user;
	private List<Message> mensajes;

	public Room() {
		super();
	}

	public Room(String nombreSala, List<User> user, List<Message> mensajes) {
		super();
		this.nombreSala = nombreSala;
		this.user = user;
		this.mensajes = mensajes;
	}

	public String getNombreSala() {
		return nombreSala;
	}

	public void setNombreSala(String nombreSala) {
		this.nombreSala = nombreSala;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

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
