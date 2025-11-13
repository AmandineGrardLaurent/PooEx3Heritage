package fr.fms.entities;

public class SalesPerson extends Person{
	// Attributs
	private String nameCompany;
	private double salary;
	
	
	// Constantes
	private static final int DEFAULT_SALARY = 0;
	private static final double DEFAULT_TURNOVER = 50000;
	
	
	// Constructeurs
	public SalesPerson(String lastName, String firstName, int years, String address, City hometown, String nameCompany, double salary){
		super(lastName, firstName, years, address, hometown);
		setNameEntreprise(nameCompany);
		setSalary(salary);
	}
			
	public SalesPerson(String lastName, String firstName, int years, String address, City hometown, String nameCompany){
		super(lastName, firstName, years, address, hometown);
		setNameEntreprise(nameCompany);
		setSalary(DEFAULT_SALARY);
	}
	
	
	// Accesseurs
	public String getNameEntreprise() {
		return nameCompany;
	}
	public void setNameEntreprise(String nameCompany) {
		this.nameCompany = nameCompany;
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
				+ this.nameCompany + ", %CA: " 
				+ this.salary;
	}
	
	// Méthode
	public double remuneration() {
		return this.salary * DEFAULT_TURNOVER/100;
	}
}
