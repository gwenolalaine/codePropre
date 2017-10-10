package ex4;

import java.util.ArrayList;
import java.util.List;

public class Zones{

	private List<Animal> animaux = new ArrayList<>();
	
	public void add(Animal animal){
		animaux.add(animal);
	}
	
	public void afficherListeAnimaux(){
		animaux.stream().map(a->a.getNom()).forEach(System.out::println);
	}
	
	public int calculerKgsNourritureParJour(int multiplier){
		return animaux.size() * multiplier;
	}
}
