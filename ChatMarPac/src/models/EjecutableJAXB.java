package models;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.swing.text.AbstractDocument.Content;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;

import views.RoomViews;

public class EjecutableJAXB {

	public static void main(String[] args) throws JAXBException, IOException {
		
		RoomViews r=new RoomViews();
		r.mainmenu();
		
		/*
		JAXBContext context = JAXBContext.newInstance(Room.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Marshaller marshaller = context.createMarshaller();
		Room sala = (Room) unmarshaller.unmarshal(new File("misala.xml"));
		escribirxml(sala,marshaller);
		verxml(sala);
		

	}

	public static void verxml(Room sala) {
		System.out.println("nombre: " + sala.getNombreSala());

		List<User> usus = sala.getUser();
		for (User u : usus) {
			System.out.println(u.getNombre());
		}
		List<Message> mensajess = sala.getMensajes();
		for (Message m : mensajess) {
			System.out.println(m.getMensaje() + " " + m.getFechaHora() + " " + m.getU());
		}
	}

	public static void escribirxml(Room sala, Marshaller marshallers) {

		sala.setNombreSala("Prueba 3");

		List<User> users = new ArrayList<>();
		User user1 = new User();
		user1.setNombre("manolo");
		users.add(user1);

		User user2 = new User();
		user2.setNombre("isa");
		users.add(user2);

		sala.setUser(users);

		try {
			marshallers.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		} catch (PropertyException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// marshaller.marshal(sala, System.out);
		try {
			marshallers.marshal(sala, new File("misala.xml"));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
}
