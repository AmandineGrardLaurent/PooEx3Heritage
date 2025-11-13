package fr.fms.entities;

import java.util.ArrayList;

public class TestEntities {
	
	public static void main(String[] args) {
	
	ArrayList<Person> persons = new ArrayList<Person>();
	
	Capital washington = new Capital("Washington", "USA", 760000, "W-M");
	City pretoria = new City("Pretoria", "Afrique du Sud", 800000);
	City limoges = new City("Limoges", "France", 133000);
	
	Person gates = new Employee("Gates", "Bill", 65, "USA", washington, "Fondation B&M", 1000000);
	Person musk = new Employee("Musk", "Elon", 49, "Palo Alto", pretoria, "Tesla", 150000);
	Person dupont = new SalesPerson("Dupont", "Robert", 50, "rue des rosiers à Toulouse", limoges, "brico", 5);
	
	// Méthode avec des listes
	persons.add(gates);
	persons.add(musk);
	persons.add(dupont);
	
	//Person.displayPersons(persons);
	
	
	// Méthode avec un tableau
	Person [] person = {gates, musk, dupont};
	
	for (Person index : person) {
		//System.out.println(index);
		System.out.println(Person.displayRemuneration(index));
	}
	
	}
	
}
