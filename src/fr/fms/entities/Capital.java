package fr.fms.entities;

class Capital extends City{
	// Attributs
	private String monument;
	
	
	// Constructeur
	public Capital(String name, String country, int population, String monument){
		super(name, country, population);
		setMonument(monument);
	}
	
	
	// Accesseurs
	public String getMonument() {
		return monument;
	}

	public void setMonument(String monument) {
		this.monument = monument;
	}
	
	@Override
	public String toString() {
		return super.toString() + " monument : " + this.monument;
	}
}
