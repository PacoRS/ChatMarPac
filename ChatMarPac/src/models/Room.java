package models;

import java.util.List;

public class Room {
	protected String nombreSala="";
	protected List<User> user;
	
	public Room() {
		super();
	}
	public Room(String nombreSala, List<User> user) {
		super();
		this.nombreSala = nombreSala;
		this.user = user;
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
	@Override
	public String toString() {
		return "Room [nombreSala=" + nombreSala + ", user=" + user + "]";
	}
	
	
}
