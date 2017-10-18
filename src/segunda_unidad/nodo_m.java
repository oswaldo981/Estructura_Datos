package segunda_unidad;

public class nodo_m {

	private static musica valor=new musica();
	private  musica valores;
	private nodo_m anterior;
	private nodo_m siguiente;
	public musica getValores() {
		return valores;
	}
	public void setValores(musica valores) {
		this.valores = valores;
	}
	public nodo_m getAnterior() {
		return anterior;
	}
	public void setAnterior(nodo_m anterior) {
		this.anterior = anterior;
	}
	public nodo_m getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(nodo_m siguiente) {
		this.siguiente = siguiente;
	}
	
	
}
