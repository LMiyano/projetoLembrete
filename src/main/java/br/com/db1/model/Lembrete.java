package br.com.db1.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "lembrete")
public class Lembrete {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false, name = "data_lembrete")
	@Temporal(TemporalType.DATE)
	private Date data_lembrete;

	@Column(nullable = false, length = 100, name = "descricao")
	private String descricao;

	public Integer getId() {
		return id;
	}

	public Date getData_lembrete() {
		return data_lembrete;
	}

	public void setData_lembrete(Date data_lembrete) {
		this.data_lembrete = data_lembrete;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
