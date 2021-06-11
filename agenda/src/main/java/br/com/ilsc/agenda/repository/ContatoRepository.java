package br.com.ilsc.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ilsc.agenda.modelo.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
