package models;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class EscrituraJAXB {

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		JAXBContext context = JAXBContext.newInstance(Room.class);

		Marshaller marshaller = context.createMarshaller();

		Room sala = new Room();
		sala.setNombreSala("Prueba 2");

		List<User> users = new ArrayList<>();
		User user1 = new User();
		user1.setNombre("pacotee");
		users.add(user1);
		
		User user2 = new User();
		user2.setNombre("manoleteee");
		users.add(user2);
		
		sala.setUser(users);
		
		marshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		//marshaller.marshal(sala, System.out);
		try {
			marshaller.marshal(sala, new File("misala.xml"));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
