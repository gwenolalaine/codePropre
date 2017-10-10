package ex3;

public class CompteCourant extends CompteBancaire{


	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;
	
	public CompteCourant(double solde, double decouvert) {
		super(solde);
		this.decouvert = decouvert;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	@Override
	public void debiterMontant(double montant){
		if (this.solde - montant > decouvert){
			this.solde = solde - montant;
		}	
	}

	/**
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	
}
