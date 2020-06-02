package com.cg.inventorymanagementsystem.ui;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.PropertyConfigurator;

import com.cg.inventorymanagementsystem.exceptions.IMSException;
import com.cg.inventorymanagementsystem.model.Manufacturer;
import com.cg.inventorymanagementsystem.model.Suppliers;
import com.cg.inventorymanagementsystem.service.IManufacturerService;
import com.cg.inventorymanagementsystem.service.ManufacturerService;

public class Main {

	public static void main(String args[]) {

		PropertyConfigurator.configure("src/main/java/log4j.properties");
		Scanner scanner = null;
		String reChoice = "";

		do {
			// scanner = new Scanner(System.in);
			System.out.println(" *** Welcome Manufacturer *** ");
			System.out.println("1.Add Order");
			System.out.println("2.Update Order");
			System.out.println("3.Show Order Details");
			System.out.println("4.Show Supplier Details");
			System.out.println("5.Exit");

			int choice = 0;
			boolean choiceFlag = false;
			IManufacturerService service = new ManufacturerService();

			do {
				scanner = new Scanner(System.in);
				System.out.println("select your choice:");

				try {
					choice = scanner.nextInt();
					choiceFlag = true;

					switch (choice) {

					case 1:
						Manufacturer order = ManufacturerMain.addOrder();
						try {
							int orderId = service.addOrder(order);
							System.out.println("order inserted with the given id: " + orderId);
						} catch (IMSException e) {
							System.err.println(e.getMessage());
						}
						break;
						
					case 2: 
						break;

					case 3:
						try {
							List<Manufacturer> orders = service.getAllOrders();

							for (Manufacturer data : orders) {
								System.out.println(data);
							}

						} catch (IMSException e) {
							System.out.println(e.getMessage());
						}
						break;
						
					case 4:
						try {
							List<Suppliers> suppliers = service.showSupplierDetails();

							for (Suppliers data : suppliers) {
								System.out.println(data);
							}

						} catch (IMSException e) {
							System.out.println(e.getMessage());
						}
						break;
						
					case 5:
						System.out.println("thank you");
						System.exit(0);
						
					default:
						choiceFlag = false;
						System.out.println("Input should be in the range of 1-6");
						break;
	
					}	

				} catch (InputMismatchException e) {
					choiceFlag = false;
					System.err.println("Input should contain only digits");
				}

			} while (!choiceFlag);

			System.out.println("do you want to continue? (yes/no)");
			reChoice = scanner.next();

		} while (reChoice.equalsIgnoreCase("yes"));

		scanner.close();
	}
}
