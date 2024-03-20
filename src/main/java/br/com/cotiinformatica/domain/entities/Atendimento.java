package br.com.cotiinformatica.domain.entities;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_atendimento")
@Data
public class Atendimento {

	@Id
	@Column(name = "id")
	private UUID id;

	@Column(name = "data_atendimento")
	private Date dataAtendimento;

	@Column(name = "local")
	private String local;

	
	
	@ManyToOne
	private Paciente paciente;

	@ManyToOne
	private Medico medico;

	@OneToMany(mappedBy = "atendimento")
	private List<Exame> exames;

}
