package ex3;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;
	
	/** Ce constructeur est utilisé pour créer un compte de type Livret A
	 * @param type = LA
	 * @param solde représente le solde du compte
	 * @param decouvert  représente le découvert autorisé
	 * @param tauxRemuneration  représente le taux de rémunération du livret A
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	
	/** Ajoute un montant au solde
	 * @param montant
	 * 
	 */
	@Override
	public void debiterMontant(double montant){
		if (this.solde - montant > 0){
			this.solde = solde - montant;
		}	
		
	}
	
	/**Donne les intérêts chaque année
	 *  
	 * @return void
	 */
	public void appliquerRemuAnnuelle(){
		this.solde = solde + solde*tauxRemuneration/100;
	}


	/**
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}


	/**
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
	
}
