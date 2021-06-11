package br.com.ilsc.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.ilsc.agenda.modelo.Contato;
import br.com.ilsc.agenda.repository.ContatoRepository;

@Controller
public class IndexController {

	@Autowired
	private ContatoRepository contatoRepository;

	@GetMapping("/")
	public ModelAndView inicio() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("contatoObj", new Contato());
		mv.addObject("contatos", contatoRepository.findAll());

		return mv;
	}

	@PostMapping("salvarContato")
	public ModelAndView salvar(Contato contato) {

		contatoRepository.save(contato);

		ModelAndView mv = new ModelAndView("index");
		mv.addObject("contatoObj", new Contato());
		mv.addObject("contatos", contatoRepository.findAll());

		return mv;
	}
}
