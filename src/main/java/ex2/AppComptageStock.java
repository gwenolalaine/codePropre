package ex2;

public class AppComptageStock {

	public static void main(String[] args) {
		ComptageStock comptageStock = new ComptageStock();
		comptageStock.ajouterElement(0);
		comptageStock.ajouterElement(0);
		comptageStock.afficheStatutComptage(TypeOperation.MOYENNE);

	}

}
