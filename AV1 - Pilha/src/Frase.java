
public class Frase {
	
	private String frase;

	public Frase() {
		
	}
	
	public Frase(String frase) {
		this.frase = frase;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}
	
	@Override
	public String toString() {
		return "Frase: [" + frase + "]";
	}
	
}
