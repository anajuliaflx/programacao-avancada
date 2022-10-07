package exerciseJavaPoo.question02;

import java.util.Date;

public class Produto {
	private Integer id;
	private String name;
	private String descricao;
	private Date validade;
	
	
	public Produto(Integer id, String name, String descricao, Date validade) {
		
		this.id = id;
		this.name = name;
		this.descricao = descricao;
		this.validade = validade;
	}


	

	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String nome) {
		this.name = name;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public void setValidade(Date validade) {
		this.validade = validade;
	}


	public Integer getCod() {
		return id;
	}
	public Date getValidade() {
		return validade;
	}
	
	
	
	
	

}
