package Ex01;

import java.util.ArrayList;

public class Venda {
	//Atributs
	private ArrayList<Producte> colProductes; //Array list de productes
	private double preuTotal;
	
	//Constructor
	
	public Venda() {
		preuTotal=0;
		colProductes=new ArrayList<Producte>();
		
	}
	
	//Setters & Getters
	
	public  void afegirProducte(Producte producte) {
		 colProductes.add(producte);
	}
	
	public ArrayList<Producte> getProductes(){
		return colProductes;
	}
	
	//Mètodes
	
	public void calculaTotal() throws VendaBuidaException { 
		int i;
		
		preuTotal=0;
		if (colProductes.isEmpty()) throw  new VendaBuidaException("Per fer una venda primer has d’afegir productes"); //Llença exepció
		for( i=0;i<colProductes.size();i++)
		{
			
			preuTotal+=colProductes.get(i).getPreu();
		}				
		
	
	}


}
