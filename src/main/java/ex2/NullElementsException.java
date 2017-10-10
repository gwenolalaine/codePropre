package ex2;

public class NullElementsException extends RuntimeException {
	/** serialVersionUID long */
	private static final long serialVersionUID = 1L;

	public NullElementsException(){
		super("Vous ne pouvez pas faire d'operation sur moins de 2 élements");
	}
	
	public NullElementsException(String message) {
        super(message);
    }
}
