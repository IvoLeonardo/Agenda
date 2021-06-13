package br.com.ilsc.agenda.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.ilsc.agenda.modelo.Contato;
import br.com.ilsc.agenda.repository.ContatoRepository;

@Controller
public class ContatoController {

	@Autowired
	private ContatoRepository contatoRepository;

	@GetMapping("/cadContato")
	public ModelAndView inicio() {

		ModelAndView mv = new ModelAndView("cadastro/formContato");
		mv.addObject("contatoObj", new Contato());
		mv.addObject("contatos", contatoRepository.findAll());
		return mv;
	}

	@PostMapping("**/salvarContato")
	public ModelAndView salvar(Contato nomeContato) {

		contatoRepository.save(nomeContato);

		ModelAndView mv = new ModelAndView("cadastro/formContato");
		mv.addObject("contatos", contatoRepository.findAll());
		mv.addObject("contatoObj", new Contato());

		return mv;
	}

	@GetMapping("/editarContato/{contatoId}")
	public ModelAndView editar(@PathVariable("contatoId") Long idContato) {

		Optional<Contato> contato = contatoRepository.findById(idContato);

		ModelAndView mv = new ModelAndView("cadastro/formContato");
		mv.addObject("contatoObj", contato.get());
		return mv;
	}

	@GetMapping("/excuirContato/{contatoId}")
	public ModelAndView excluir(@PathVariable("contatoId") Long idContato) {

		contatoRepository.deleteById(idContato);

		ModelAndView mv = new ModelAndView("cadastro/formContato");
		mv.addObject("contatos", contatoRepository.findAll());
		mv.addObject("contatoObj", new Contato());
		return mv;
	}

	@PostMapping("**/pesquisaNomeContato")
	public ModelAndView pesquisar(@RequestParam("contatoPesquisa") String contato) {

		ModelAndView mv = new ModelAndView("cadastro/formContato");
		mv.addObject("contatoObj", new Contato());
		mv.addObject("contatos", contatoRepository.findByNomeContatoContaining(contato));

		return mv;
	}

	@GetMapping("/listaContato")
	public ModelAndView listar() {

		ModelAndView mv = new ModelAndView("cadastro/formContato");
		mv.addObject("contatoObj", new Contato());
		mv.addObject("contatos", contatoRepository.findAll());

		return mv;
	}
}
