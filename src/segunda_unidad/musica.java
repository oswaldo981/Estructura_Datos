package segunda_unidad;

public class musica  {
	private String genero;
	private String artista;
	private String cancion;
	private String album;
	private String id;
	private musica anterior;
	private musica siguiente;
	private musica datos;
	public musica getDatos() {
		return datos;
	}
	public void setDatos(musica datos) {
		this.datos = datos;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getCancion() {
		return cancion;
	}
	public void setCancion(String cancion) {
		this.cancion = cancion;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public musica getAnterior() {
		return anterior;
	}
	public void setAnterior(musica anterior) {
		this.anterior = anterior;
	}
	public musica getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(musica siguiente) {
		this.siguiente = siguiente;
	}
		
	

}
