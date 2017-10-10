package ex2;

import java.util.Date;

public class ComptageStock {

	/** nbElements int */
	private int nbElements;
	/** resultat int */
	private int resultat;
	/** dateDebutComptage Date */
	private Date dateDebutComptage;
	/** dateFinComptage Date */
	private Date dateFinComptage;
	
	
	
	/** Ajoute un élément
	 * @param montant 
	 * @return void
	 */
	public void ajouterElement(int montant){
		nbElements++;
		resultat +=montant;
	}
	
	/** Affiche le statut du comptage
	 * @param typeOperation 
	 * @return void
	 */
	public void afficheStatutComptage(TypeOperation typeOperation){
		if(nbElements == 0 || nbElements == 1){
			throw new NullElementsException();
		}else{
			affichageResultat(typeOperation);
		}
		
		affichageDateDebut();
		
		affichageDateFin();
	}
	
	/** Affiche le résultat
	 * @param typeOperation 
	 * @return void
	 */
	private void affichageResultat(TypeOperation typeOperation) {
		if (typeOperation!=null && typeOperation.equals(TypeOperation.SOMME)){
			afficherResultats(typeOperation, resultat);
		}
		else if (typeOperation!=null && typeOperation.equals(TypeOperation.MOYENNE)){
			afficherResultats(typeOperation, resultat/nbElements);
		}
	}

	/** Affiche la date de début
	 * @return void
	 */
	private void affichageDateDebut() {
		if (dateDebutComptage!=null){
			System.out.println(DateUtils.format(dateDebutComptage));
		}
	}
	
	/** Affiche la date de fin
	 * void
	 */
	private void affichageDateFin() {
		if (dateFinComptage!=null){
			System.out.println("Le comptage est clos depuis le "+ DateUtils.format(dateFinComptage));
			if (nbElements==0){
				System.out.println("Le comptage est clos mais n'a pas d'éléments. Le comptage est en anomalie.");
			}
			else {
				System.out.println("Le comptage est clos et est OK.");
			}
		}
		else {
			System.out.println("Le compte est actif.");
		}
	}

	
	/** Affiche les résultats
	 * @param type
	 * @param resultat 
	 * @return void
	 */
	private void afficherResultats(TypeOperation type, int resultat){
		System.out.println("Ce comptage est de type " + type);
		System.out.println("Nombre d'élements "+nbElements);
		
		System.out.println("Résultat "+resultat);
	}
	/**
	 * @return the nbElements
	 */
	public int getNbElements() {
		return nbElements;
	}

	/**
	 * @param nbElements the nbElements to set
	 */
	public void setNbElements(int nbElements) {
		this.nbElements = nbElements;
	}

	/**
	 * @return the resultat
	 */
	public int getResultat() {
		return resultat;
	}

	/**
	 * @param resultat the resultat to set
	 */
	public void setResultat(int resultat) {
		this.resultat = resultat;
	}

	/**
	 * @return the dateDebutComptage
	 */
	public Date getDateDebutComptage() {
		return dateDebutComptage;
	}

	/**
	 * @param dateDebutComptage the dateDebutComptage to set
	 */
	public void setDateDebutComptage(Date dateDebutComptage) {
		this.dateDebutComptage = dateDebutComptage;
	}

	/**
	 * @param dateFinComptage the dateFinComptage to set
	 */
	public void setDateFinComptage(Date dateFinComptage) {
		this.dateFinComptage = dateFinComptage;
	}
	
	
}
