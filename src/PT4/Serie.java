package PT4;

public class Serie {
	final private int TEMPORADAS_DEFAULT = 3;
	final private boolean ENTREGADO_DEFAULT = false;
	final private String GENERO_DEFAULT = "uncategorized";
	
	private String titulo;
	private int temporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	public Serie() {
		this.titulo = "";
		this.temporadas = TEMPORADAS_DEFAULT;
		this.entregado = ENTREGADO_DEFAULT;
		this.genero = GENERO_DEFAULT;
		this.creador = "";
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.temporadas = TEMPORADAS_DEFAULT;
		this.entregado = ENTREGADO_DEFAULT;
		this.genero = GENERO_DEFAULT;
		this.creador = creador;
	}
	
	public Serie(String titulo, int temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.entregado = ENTREGADO_DEFAULT;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	@Override
	public String toString() {
		return "Título: " + titulo + "  -  Temporadas: " + temporadas + "  -  Entregado: " + entregado + "  -  Género: " + genero + "  -  Creador: " + creador;
	}
	
}
