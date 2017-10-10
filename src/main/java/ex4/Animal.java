package ex4;

public class Animal {
	String nom;
	TypeAnimaux type;
	Comportements comportement;
	
	public Animal(String nom, TypeAnimaux type, Comportements comportement) {
		this.nom = nom;
		this.type = type;
		this.comportement = comportement;
	}
	
	public String toString(){
		return nom + " de type " + type + " avec le comportement " + comportement;
	}
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the type
	 */
	public TypeAnimaux getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(TypeAnimaux type) {
		this.type = type;
	}
	/**
	 * @return the comportement
	 */
	public Comportements getComportement() {
		return comportement;
	}
	/**
	 * @param comportement the comportement to set
	 */
	public void setComportement(Comportements comportement) {
		this.comportement = comportement;
	}
	
	
	
}
