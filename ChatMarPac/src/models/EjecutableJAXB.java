package models;
/**
 * Esta clase llama a la vista y muesta el programa
 */
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
		
	}
	
}
