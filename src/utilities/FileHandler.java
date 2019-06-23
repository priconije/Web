package utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import enums.UserRole;
import model.Administrator;
import model.Item;
import model.User;

public final class FileHandler {

	public static final String savedDataFolderPath = "C:\\Users\\Ognjen\\Documents\\EclipseWorkspace\\WebProjekat\\Web\\WebContent\\SavedData";

	// public static final String savedDataFolderPath =
	// "C:\\Grujica\\Web\\WebContent\\SavedData";
	private FileHandler() {
	}

	public static boolean WriteNewUserToFile(User newUser) {
		try {
			Writer output;
			output = new BufferedWriter(new FileWriter(savedDataFolderPath + "/" + "Users.txt", true));
			output.append(System.lineSeparator());
			output.append(newUser.toString());
			output.close();
		} catch (IOException e) {
			System.out.println("User not added, stacktrace: " + e.toString());
			return false;
		}

		return true;
	}

	public static List<User> GetAllUsers() {
		try {
			ArrayList<User> users = new ArrayList<User>();
			BufferedReader reader = new BufferedReader(new FileReader(savedDataFolderPath + "\\" + "Users.txt"));
			String line;
			User user;

			try {
				while ((line = reader.readLine()) != null) {
					String[] lineParts = line.split(";");
					UserRole role = UserRole.valueOf(lineParts[4]);

					switch (role) {
					case ADMINISTRATOR:
						user = new Administrator();
						break;

					default:
						System.out.println("User Role unknown");
						return null;
					}

					user.setUsername(lineParts[0]);
					user.setPassword(lineParts[1]);
					user.setFirstName(lineParts[2]);
					user.setLastName(lineParts[3]);
					user.setPhoneNumber(lineParts[5]);
					user.setEmail(lineParts[6]);
					user.setUserRole(role);
					user.setRegistrationDate(lineParts[7]);
					user.setCity(lineParts[8]);

					users.add(user);
				}

				reader.close();
				return users;
			} catch (IOException ex) {
				System.out.println("Error while reading a line from Users.txt");
				return null;
			}
		} catch (FileNotFoundException ex) {
			System.out.println("Users file not found");
			return null;
		}
	}

	public static boolean WriteNewItemToFile(Item item) {
		try {
			Writer output;
			output = new BufferedWriter(new FileWriter(savedDataFolderPath + "/" + "Items.txt", true));
			output.append(System.lineSeparator());
			output.append(item.toString());
			output.close();
			return true;
		} catch (IOException e) {
			System.out.println("User not added, stacktrace: " + e.toString());
			return false;
		} 		
	}

	public static List<Item> GetAllItems() {
		try {
			List<Item> items = new ArrayList<Item>();
			BufferedReader reader = new BufferedReader(new FileReader(savedDataFolderPath + "\\" + "Users.txt"));
			String line;

			try {
				while ((line = reader.readLine()) != null) {
					String[] lineParts = line.split(";");
					Item item = new Item();
					item.setName(lineParts[0]);
					item.setPrice(Double.parseDouble(lineParts[1]));
					item.setQuantity(Integer.parseInt(lineParts[2]));
					item.setDescription(lineParts[3]);

					items.add(item);
				}
				reader.close();
				return items;
			} catch (Exception e) {
				System.out.println("Error while reading a line from Items.txt");
				return null;
			}

		} catch (FileNotFoundException e) {
			System.out.println("Items.txt file not found");
			return null;
		}

	}

}
