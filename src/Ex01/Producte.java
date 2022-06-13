package Ex01;

public class Producte {
	//Atributs
	private String nom;
	private double preu;
	
	//Constructor
	public Producte(String nom,double preu){
		this.nom=nom;
		this.preu=preu;
	}
	//Setters & getters
	
	public double getPreu() {
		
		return preu;
	}
	
	public String getNom() {
		
		return nom;
	}
	public void setNom(String nom) {
		
		this.nom=nom;
	}
}
