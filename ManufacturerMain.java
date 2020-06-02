package com.cg.inventorymanagementsystem.ui;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.inventorymanagementsystem.exceptions.IMSException;
import com.cg.inventorymanagementsystem.model.Manufacturer;
import com.cg.inventorymanagementsystem.service.IManufacturerService;
import com.cg.inventorymanagementsystem.service.ManufacturerService;

public class ManufacturerMain {

	public static Manufacturer addOrder() {

		Scanner scanner = null;
		String name = "";
		boolean nameFlag = false;

		IManufacturerService service = new ManufacturerService();

		do {
			scanner = new Scanner(System.in);
			System.out.println("Enter Name"); // BR
			name = scanner.nextLine();
			try {
				service.validateName(name);
				nameFlag = true;
			} catch (IMSException e) {
				nameFlag = false;
				System.err.println(e.getMessage());
			}
		} while (!nameFlag);

		double cost = 0;
		boolean costFlag = false;

		do {
			scanner = new Scanner(System.in);
			System.out.println("Enter Cost"); // BR
			try {
				cost = scanner.nextDouble();
				service.validateCost(cost);
				costFlag = true;
			} catch (InputMismatchException e) {
				costFlag = false;
				System.out.println("cost should contain only digits");
			} catch (IMSException e) {
				System.err.println(e.getMessage());
			}

		} while (!costFlag);

		String date = null;
		boolean dateFlag = false;
		LocalDate localDate = null;

		do {
			scanner = new Scanner(System.in);
			System.out.println("Enter Date(yyyy-MM-dd)");
			date = scanner.next();

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

			try {
				localDate = LocalDate.parse(date, formatter);
				dateFlag = true;
			} catch (DateTimeParseException e) {
				dateFlag = false;
				System.err.println("date should be in the format of yyyy-MM-dd");
			}

		} while (!dateFlag);

		int units = 0;
		boolean unitsFlag = false;

		do {
			scanner = new Scanner(System.in);
			System.out.println("Enter units");
			try {
				units = scanner.nextInt();
				service.validateUnits(units);
				unitsFlag = true;
			} catch (InputMismatchException e) {
				unitsFlag = false;
				System.out.println("units should contain only digits");
			} catch (IMSException e) {
				System.err.println(e.getMessage());
			}

		} while (!unitsFlag);

		int id = 0;
		boolean idFlag = false;

		do {
			scanner = new Scanner(System.in);
			System.out.println("Enter Id"); // BR
			try {
				cost = scanner.nextDouble();
				service.validateId(id);
				idFlag = true;
			} catch (InputMismatchException e) {
				costFlag = false;
				System.out.println("id should contain only digits");
			}

		} while (!idFlag);

		Date mfgDate = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

		Date expDate = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

		Manufacturer manufacturer = new Manufacturer(name, mfgDate, units, cost, expDate, id);

		return manufacturer;

	}

}
