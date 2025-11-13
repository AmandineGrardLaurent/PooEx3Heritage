package fr.fms.entities;

public class Employee extends Person{
	private String nameEntreprise;
	private double salary;
	
	// Constructeur
	public Employee(String lastName, String firstName, int years, String address, City hometown, String nameEntreprise, double salary){
		super(lastName, firstName, years, address, hometown);
		setNameEntreprise(nameEntreprise);
		setSalary(salary);
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
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return super.toString() +  ", Entreprise: " 
				+ this.nameEntreprise + ", salaire: " 
				+ this.salary;
	}

}
