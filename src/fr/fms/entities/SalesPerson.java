package fr.fms.entities;

public class SalesPerson extends Person{
	// Attributs
	private String nameEntreprise;
	private double salary;
	
	
	// Constantes
	private static final int SALARY = 0;
	private static final double TURNOVER = 50000;
	
	
	// Constructeurs
	public SalesPerson(String lastName, String firstName, int years, String address, City hometown, String nameEntreprise, double salary){
		super(lastName, firstName, years, address, hometown);
		setNameEntreprise(nameEntreprise);
		setSalary(salary);
	}
			
	public SalesPerson(String lastName, String firstName, int years, String address, City hometown, String nameEntreprise){
		super(lastName, firstName, years, address, hometown);
		setNameEntreprise(nameEntreprise);
		setSalary(SALARY);
	}
	
	
	// Accesseurs
	public String getNameEntreprise() {
		return nameEntreprise;
	}
	public void setNameEntreprise(String nameEntreprise) {
		this.nameEntreprise = nameEntreprise;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if (salary < 0) {
			throw new RuntimeException("% du chiffre d'affaire inférieur à 0 impossible.");
		}
		else {
			this.salary = salary;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() +  ", Entreprise: " 
				+ this.nameEntreprise + ", %CA: " 
				+ this.salary;
	}
	
	// Méthode
	public double remuneration() {
		return this.salary * TURNOVER/100;
	}
}
