package fr.fms.entities;

public class City
	{
		// Attributs
		private String name;
		private String country;
		private int population;
		
		
		// Constantes
		public static final int DEFAULT_POPULATION = 0;
		public static final String DEFAULT_COUNTRY = "unknown";
		
		
		// Constructeurs
		public City(String name, String country, int population){
			setName(name);
			setCountry(country);
			setPopulation(population);
		}
		
		public City(String name, String country){
			setName(name);
			setCountry(country);
			setPopulation(DEFAULT_POPULATION);
		}
		
		public City(String name, int population){
			setName(name);
			setCountry(DEFAULT_COUNTRY);
			setPopulation(population);
		}
		
		
		// Accesseurs
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public int getPopulation() {
			return population;
		}

		public void setPopulation(int population) {
			this.population = population;
		}


		public String toString() {
			return this.name + ", " 
					+ this.country ;
					/*+ ", " 
					+ this.population 
					+ " d'habitants";*/
		}
}
