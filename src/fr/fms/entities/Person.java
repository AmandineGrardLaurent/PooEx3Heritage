package fr.fms.entities;

import java.util.ArrayList;

public abstract class Person {
		// Attributs
		private String lastName;
		private String firstName;
		private int years;
		private String address;
		private City hometown;
		
		
		// Constantes
		public static final int DEFAULT_YEARS = 0;
		public static final String DEFAULT_ADDRESS = "unknown";
		public static final City DEFAULT_HOMETOWN = new City ("unknown", "unknown", 0);
		
		
		// Constructeurs
		public Person(String lastName, String firstName, int years, String address, City hometown){
			setLastName(lastName);
			setFirstName(firstName);
			setYears(years);
			setAdress(address);
			this.hometown = hometown;
		}

		public Person(String lastName, String firstName, int years){
			this(lastName, firstName, years, DEFAULT_ADDRESS, DEFAULT_HOMETOWN);
		}
		
		public Person(String lastName, String firstName){
			this(lastName, firstName, DEFAULT_YEARS, DEFAULT_ADDRESS, DEFAULT_HOMETOWN);
		}

		
		// Accesseurs
		public String getLastName() {
			return this.lastName;
		}
		
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		public String getFirstName() {
			return this.firstName;
		}
		
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public int getYears() {
			return this.years;
		}
		
		public void setYears(int years) {
			if (years < 0) {
				throw new RuntimeException("Merci de saisir un age valide.");
			}
			else {
				this.years = years;
			}
		}
		
		public String getAdress() {
			return this.address;
		}
		
		public void setAdress(String address) {
			this.address = address;
		}
		
		
		// Méthodes	
		public static void displayPersons(ArrayList<Person> persons) {
			for (Person index : persons) {
				//System.out.println(index);
				System.out.println(Person.displayRemuneration(index));
			}
		}
		
		public static String displayRemuneration(Person person) {
			return "salaire de " + person.firstName + " " + person.lastName + " : " + person.remuneration();
		}
		
		public String toString() {
			return lastName + ", " 
					+ firstName + ", " 
					+ years + "ans, " 
					+ "habitant " + address + ", " 
					+ ((hometown == DEFAULT_HOMETOWN) ? "" : 
						"Ville de naissance: " + this.hometown);
		}
		
		public double remuneration() {
			return 0;
		}
		
}
