//package br.com.ilsc.agenda.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import br.com.ilsc.agenda.modelo.Categoria;
//import br.com.ilsc.agenda.modelo.Contato2;
//
//@Controller
//public class ContatoController2 {

//	@Autowired
//	private ContatoRepository contatoRepository;

//	@GetMapping("/cadContato")
//	public ModelAndView inicio() {
//
//		ModelAndView mv = new ModelAndView("cadastro/formContato");
//		mv.addObject("contatoObj", new Contato2());
//		mv.addObject("contatos", contatoRepository.findAll());
//		return mv;
//	}

//	@PostMapping("**/salvarContato")
//	public ModelAndView salvar(Contato contato) {
//
//		contatoRepository.save(contato);
//
//		ModelAndView mv = new ModelAndView("cadastro/formContato");
//		mv.addObject("contatoObj", new Contato());
//		mv.addObject("contatos", contatoRepository.findAll());
//
//		return mv;
//	}

//	@PostMapping("**/salvarContato")
//	public ModelAndView salvar(Contato2 contato) {
//
//		contatoRepository.save(contato);
//
//		ModelAndView mv = new ModelAndView("cadastro/formContato");
//		mv.addObject("categorias", contatoRepository.findAll());
//		mv.addObject("categoriaObj", new Categoria());
//
//		return mv;
//	}
//}
