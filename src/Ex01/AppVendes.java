package Ex01;

public class AppVendes {

	public static void main(String[] args)
		
		{
		int llista[]= new int[10];
		
		Producte producte=new Producte("ulleres",1000);
		Venda venda=new Venda();
	 	venda.afegirProducte(producte);
		
	 	
		//Aquí es tracta si hi ha exepció 
		try {
			venda.calculaTotal();
		}
		catch(VendaBuidaException e) { 	//Array list buit, no s'ha posat cap llista de productes
			System.out.println(e.getMessage());	
		}
		catch(IndexOutOfBoundsException e1) { 	//Comproba index Array list fora de límits
			System.out.println(e1.getMessage());	
		}
		
		//Codi necessari per generarr i capturar una exepció de tipus ArrayIndexOutOfBoundsException
		
		try {
			llista[0]=3;
			llista[1]=4;
			llista[2]=5;
			llista[3]=8;
			llista[10]=8;//Porvoca exepció
		}
		catch(ArrayIndexOutOfBoundsException e2){  //captura exepció
			System.out.println(e2.getMessage());	//manega error
		}
	}
	

}
