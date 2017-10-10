package ex4;

public enum TypeAnimaux {
	MAMMIFERE (10), 
	REPTILE (0.1), 
	POISSON (0.2);

	double value;
	
     TypeAnimaux (double value)
     {
         this.value = value ;
     }
}
