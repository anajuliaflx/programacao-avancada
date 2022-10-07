package exerciseJavaPoo.question01;

public class Transporte {
	private Integer id;
	private Integer ano;
	private String modelo;
	private Double cargaMaxima;
	private Double potencia;
	
	public Transporte() {
	
	}
	
	public Transporte(Integer id, Integer ano, String modelo, Double carga_maxima, Double potencia) {
		this.id = id;
		this.ano = ano;
		this.modelo = modelo;
		this.cargaMaxima = carga_maxima;
		this.potencia = potencia;
	}

	public String leiaModelo() {
		return modelo;
	}
	public void gravaModelo(String modelo) {
		this.modelo = modelo;
	}
	public Double consumo() {
		return potencia * cargaMaxima * 100;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(Double carga_maxima) {
		this.cargaMaxima = carga_maxima;
	}

	public Double getPotencia() {
		return potencia;
	}

	public void setPotencia(Double potencia) {
		this.potencia = potencia;
	}
	
	

}
