package fr.fms.entities;

public class Employee extends Person{
	// Attributs
	private String nameEntreprise;
	private double salary;
	
	// Constantes
	private static final int SALARY = 0;
	private static final double PAYROLL_COST = 0.20;
	
	// Constructeurs
	public Employee(String lastName, String firstName, int years, String address, City hometown, String nameEntreprise, double salary){
		super(lastName, firstName, years, address, hometown);
		setNameEntreprise(nameEntreprise);
		setSalary(salary);
	}
	
	public Employee(String lastName, String firstName, int years, String address, City hometown, String nameEntreprise){
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
			throw new RuntimeException("Salaire inférieur à 0 impossible.");
		}
		else {
			this.salary = salary;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() +  ", Entreprise: " 
				+ this.nameEntreprise + ", salaire: " 
				+ this.salary;
	}
	
	// Méthode
	public double remuneration() {
		return this.salary - (this.salary * PAYROLL_COST);
	}
	
	

}
