package segunda_unidad;

public class lista_doble {
	
	private nodo_m cabeza;
	
	
	public nodo_m getCabeza() {
		return cabeza;
	}


	public void setCabeza(nodo_m cabeza) {
		this.cabeza = cabeza;
	}
	
	public boolean isVacio()
	{
		boolean respuesta=true;
		if(this.cabeza!=null)
		{
			respuesta=false;
		}
		return respuesta;
	}

	public void insertar(musica valor){
		
		nodo_m nuevo=new nodo_m();
		nuevo.setValores(valor);
		nuevo.setSiguiente(null);
		nuevo.setAnterior(null);
		this.cabeza=nuevo;
	}
	public void insertar_inicio(musica valor) {
		
		if(this.isVacio())
		{
			insertar(valor);
		}
		else {
			nodo_m nuevo=new nodo_m();
			nuevo.setValores(valor);
			nuevo.setSiguiente(this.cabeza);
			nuevo.setAnterior(null);
			this.cabeza=nuevo;
		}
		
	}
	public void insertarFinal(musica valor)
	{
		if(this.isVacio())
		{
			this.insertar(valor);
		}
		else {
			nodo_m nuevo=new nodo_m();
			nuevo.setValores(valor);
			nuevo.setSiguiente(this.cabeza);
			
			nodo_m temp=this.cabeza;
			while(temp.getSiguiente()!=null)
			{
				temp=temp.getSiguiente();			
				
			}
			nuevo.setAnterior(temp);
			temp.setSiguiente(nuevo);
		}
	}
	public StringBuilder imprimir()
	{
		StringBuilder cadena=new StringBuilder();
		cadena.append("Cabeza---->");
		nodo_m temp=this.cabeza;
		while(temp!=null)
		{
			cadena.append(temp.getValores().getCancion());
			cadena.append("---->");
			temp=temp.getSiguiente();			
		}
		cadena.append("NULL");
		return cadena;
	}
	public StringBuilder imprimir_anterior()
	{
		StringBuilder cadena=new StringBuilder();
		cadena.append("Cabeza<====>");
		nodo_m temp=null;
		while(temp==this.cabeza)
		{
			cadena.append(temp.getValores().getCancion());
			cadena.append("<====>");
			temp=temp.getAnterior();			
		}
		cadena.append("NULL");
		return cadena;
	}
}
