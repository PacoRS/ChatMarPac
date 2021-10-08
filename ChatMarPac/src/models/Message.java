package models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Message {
protected String mensaje="";
protected LocalDateTime fechaHora=LocalDateTime.now();


public Message() {
	super();
}


public Message(String mensaje, LocalDateTime fechaHora) {
	super();
	this.mensaje = mensaje;
	this.fechaHora = fechaHora;
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


@Override
public String toString() {
	return "Message [mensaje=" + mensaje + ", fechaHora=" + fechaHora + "]";
}



}
