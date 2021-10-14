package views;

import java.io.BufferedWriter;
import java.io.File;
//import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

import org.apache.felix.resolver.Util;

import models.Room;
import models.User;
import utils.JAXBManager;
/**
 * Esta es la vista de nuestro programa
 */
public class RoomViews {
	// File file = new File("misala.xml");
	public void mainmenu() {
		/**
		 * Menu principal
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Loading previus data...");
		int selected = 0;
		do {
			System.out.println("Welcome to...");
			System.out.println("___  ___             ______            ");
			System.out.println("|  \\/  |            | ___\\           ");
			System.out.println("| .  .  |   __   _ _ | |_/ / _ _   ___ ");
			System.out.println("| |\\/  | /  _` | '__|  __/  _` |/ __| ");
			System.out.println("| |  |  |   (_| | | ||  | | (_| | (__  ");
		 System.out.println("\\_| |_/ \\__,_ |_ |  \\_| \\__,_|\\___|");

			System.out.println("Seleccione uno de los siguientes numeros...");
			System.out.println("1. Crear Usario");
			System.out.println("2. Crear Sala");
			System.out.println("3. Exit App");
			selected = sc.nextInt();
			switch (selected) {
			case 1:
				newUser();
				break;
			case 2:
				newSala();
				break;
			case 3:
				System.out.println("Closing...");
				break;
			default:
			}
		} while (selected != 3);
	}
/**
 * Crea un usuario en el xml añadiendo su nick name
 */
	public static void newUser() {

		System.out.println("introduce el nickname");
		Scanner sc = new Scanner(System.in);
		String intro = "";
		intro = sc.next();

		User u1 = new User(intro);

		Room r1 = new Room();

		r1.addUser(u1);
		try {
			JAXBManager.marshal(r1, new File("ejemplo.xml"));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
/**
 * Añade una sala en el xml poniendo su nombre de la sala
 */
	public static void newSala() {

		System.out.println("introduce el nombre de la sala");
		Scanner sc = new Scanner(System.in);
		String intro = "";
		intro = sc.next();

		Room r1 = new Room();

		r1.setNombreSala(intro);
		try {
			JAXBManager.marshal(r1, new File("ejemplo.xml"));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
