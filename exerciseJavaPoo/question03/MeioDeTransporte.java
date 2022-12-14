package exerciseJavaPoo.question03;

public class MeioDeTransporte {
	private Integer id;
	private short ano;
	private String modelo;
	protected Double carga_maxima;

	MeioDeTransporte() {
	}

	public MeioDeTransporte(Integer id, short ano, String modelo, Double carga_maxima) {
		super();
		this.id = id;
		this.ano = ano;
		this.modelo = modelo;
		this.carga_maxima = carga_maxima;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public short getAno() {
		return ano;
	}

	public void setAno(short ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getCarga_maxima() {
		return carga_maxima;
	}

	public void setCarga_maxima(Double carga_maxima) {
		this.carga_maxima = carga_maxima;
	}

	public Double consumo() {
		return  carga_maxima * 100;
	}
		
		
	
	
}

