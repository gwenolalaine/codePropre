package ex4;

public class Zoo {

	private String nom;
	private Zones savaneAfricaine = new Zones();
	private Zones zoneCarnivore = new Zones();
	private Zones fermeReptile = new Zones();
	private Zones aquarium = new Zones();
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	public void addAnimal(Animal animal){
		if (animal.type.equals(TypeAnimaux.MAMMIFERE)){
			if(animal.getComportement().equals(Comportements.CARNIVORE)){
				zoneCarnivore.add(animal);
			}
			else if (animal.getComportement().equals(Comportements.HERBIVORE)){
				savaneAfricaine.add(animal);
			}
		}
		else if (animal.type.equals(TypeAnimaux.REPTILE)){
			fermeReptile.add(animal);
		}
		else if (animal.type.equals(TypeAnimaux.POISSON)){
			aquarium.add(animal);
		}
	}
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
