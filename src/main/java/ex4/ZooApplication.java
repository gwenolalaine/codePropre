package ex4;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal("Gazelle", TypeAnimaux.MAMMIFERE, Comportements.HERBIVORE));
		zoo.addAnimal(new Animal("Zèbre", TypeAnimaux.MAMMIFERE, Comportements.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", TypeAnimaux.MAMMIFERE, Comportements.HERBIVORE));
		zoo.addAnimal(new Animal("Panthère", TypeAnimaux.MAMMIFERE, Comportements.CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", TypeAnimaux.POISSON, Comportements.HERBIVORE));
		zoo.addAnimal(new Animal("Truite dorée", TypeAnimaux.POISSON, Comportements.HERBIVORE));
	
		zoo.afficherListeAnimaux();
	}

}
