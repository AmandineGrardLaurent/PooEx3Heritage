package fr.fms.entities;

class Capital extends City{
	// Attributs
	private String monument;
	
	
	// Constantes
	private static final String MONUMENT = "";
	
	
	// Constructeurs
	public Capital(String name, String country, int population, String monument){
		super(name, country, population);
		setMonument(monument);
	}
	
	public Capital(String name, String country, int population){
		super(name, country, population);
		setMonument(MONUMENT);
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
		return super.toString() + (this.monument == MONUMENT ? "" : ", monument: " + this.monument);
	}
}
