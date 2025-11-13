package fr.fms.entities;

public class Test {
	public static void main(String[] args) {
		Capital washington = new Capital("Washington", "USA", 760000, "W-M");
		City pretoria = new City("Pretoria", "Afrique du Sud", 800000);
		
		Employee gates = new Employee("Gates", "Bill", 65, "USA", washington, "Fondation B&M", 1000000);
		Employee musk = new Employee("Musk", "Elon", 49, "Palo Alto", pretoria, "Tesla", 150000);
		
		System.out.println(gates);
		System.out.println(musk);
		
		City limoges = new City("Limoges", "France", 133000);

		SalesPerson dupont = new SalesPerson("Dupont", "Robert", 50, "rue des rosiers à Toulouse", limoges, "brico", 5);
		System.out.println(dupont);
		
		
	}
}
