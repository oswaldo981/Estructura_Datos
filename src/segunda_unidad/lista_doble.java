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
			this.cabeza.setAnterior(nuevo);
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
			nuevo.setSiguiente(null);
			
			nodo_m temp=this.cabeza;
			while(temp.getSiguiente()!=null)
			{
				temp=temp.getSiguiente();			
				
			}
			temp.setSiguiente(nuevo);
			nuevo.setAnterior(temp);
			
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
		cadena.append("null<====>");
		nodo_m temp=this.cabeza;
		while(temp.getSiguiente()!=null)
		{
			temp=temp.getSiguiente();			
		}
		while(temp!=null)
		{
			cadena.append(temp.getValores().getCancion()+"<=====>");
			temp=temp.getAnterior();
		}
		cadena.append("cabeza");
		return cadena;
	}
	public nodo_m encontrar(int posicion)
	{
		nodo_m temporal=this.cabeza;
		nodo_m anterior=null;
		int i=0;
		while(i<posicion)
		{
			i++;
			anterior=temporal;
			temporal=temporal.getSiguiente();
		}
		return anterior;
	}
	public int contar()
	{
		int respuesta=0;
		nodo_m temporal=this.cabeza;
		while(temporal!=null)
		{
			respuesta++;
			temporal=temporal.getSiguiente();		
			}
		return respuesta;
	}
	public boolean eliminar_principio()
	{
		boolean respuesta=false;
		nodo_m temp = this.cabeza;
		if(isVacio())
		{
			respuesta=false;
		}
		if(temp.getSiguiente()!=null)
		{
				this.cabeza=temp.getSiguiente();
				this.cabeza.getAnterior().setSiguiente(null);
				temp.setAnterior(null);
				respuesta=true;
				
		}
		else {
			temp.setAnterior(null);
			temp.setSiguiente(null);
			this.cabeza=null;
			respuesta=true;
		}
		return respuesta;
		
	}
	public boolean eliminar_final()
	{
		boolean respuesta=false;
		if(isVacio())
		{
			respuesta=false;
		}
		else {
			nodo_m temp=this.encontrar(this.contar()-1);
			temp.setSiguiente(temp.getSiguiente().getSiguiente());
			respuesta=true;
			
		}
		
		
		
		return respuesta;
	}
}
