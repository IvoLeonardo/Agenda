package br.com.ilsc.agenda.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contatos")
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// Corrigido. O nome do atributo da classe não pode ser o mesmo nome da classe,
	// caso contrário ocorre o erro de status 400
	private String nomeContato;

	public Contato() {

	}

	public Contato(String contato) {
		this.nomeContato = contato;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String contato) {
		this.nomeContato = contato;
	}

	@Override
	public String toString() {
		return this.getNomeContato();
	}
}
