package br.com.ilsc.agenda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ilsc.agenda.modelo.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {

	List<Contato> findByNomeContatoContaining(String contato);

}
