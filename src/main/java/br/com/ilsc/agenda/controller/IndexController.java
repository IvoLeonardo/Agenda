package br.com.ilsc.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@Autowired

	@GetMapping("/index")
	public String inicio() {

		return "index";
	}

//	@PostMapping("salvarContato")
//	public ModelAndView salvar(Contato contato) {
//
//		contatoRepository.save(contato);
//
//		ModelAndView mv = new ModelAndView("index");
//		mv.addObject("contatoObj", new Contato());
//		mv.addObject("contatos", contatoRepository.findAll());
//
//		return mv;
//	}
}
