
public class Pilha <String>{

	private No topo;
	private int tamanho;
	
	public boolean estaVazia() {
		return tamanho == 0;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public String get() {
		return topo.dado;
	}
	
	public void insert(java.lang.String frase){
		No no = new No();
		no.dado = (String) frase;
		no.proximo = topo;
		topo = no;
		tamanho++;
	}
	
	public boolean remove() {
		if(estaVazia()) {
			return false;
		}
		topo = topo.proximo;
		tamanho--;
		return true;
	}
	
	private class No{
		String dado;
		No proximo;
	}
	
}
