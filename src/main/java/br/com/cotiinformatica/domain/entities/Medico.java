package br.com.cotiinformatica.domain.entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "tbl_medico")
@Data
public class Medico {
	
	@Id
	@Column(name = "id")
	private UUID id;
	
	@Column(name = "nome", length = 150, nullable = false)
	private String nome;
	
	@Column(name = "crm", length = 50, nullable = false, unique = true)
	private String crm;
	
	@Column(name = "especializacao", length = 50, nullable = false)
	private String especializacao;
	
	 @OneToMany(mappedBy = "medico")
	 private List<Atendimento> atendimentos;
	
}
