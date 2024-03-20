package br.com.cotiinformatica.domain.entities;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "tbl_paciente")
@Data
public class Paciente {

	@Id
	@Column(name = "id")
	private UUID id;
	
	@Column(name = "nome", length = 150, nullable = false)
	private String nome;
	
	@Column(name = "cpf", length = 11, nullable = false, unique = true)
	private String cpf;
	
	@Column(name = "sexo", nullable = false)
	private String sexo;
	
	@Column(name = "datanascimento", nullable = false)
	private Date dataNascimento;
	
		
	@OneToMany(mappedBy = "paciente")
	private List<Atendimento> atendimentos;
}
