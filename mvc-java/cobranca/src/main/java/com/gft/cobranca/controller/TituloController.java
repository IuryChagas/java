package com.gft.cobranca.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gft.cobranca.model.StatusTitulo;
import com.gft.cobranca.model.Titulo;
import com.gft.cobranca.repository.Titulos;
import com.gft.cobranca.service.CadastroTituloService;


@Controller
@RequestMapping("/titulos")
public class TituloController {

	private static final String CADASTRO_VIEW = "CadastroTitulo";
	@Autowired
	private Titulos titulos;

	@Autowired
	private CadastroTituloService cadastroTituloService;
	
    @RequestMapping("/novo")
    public ModelAndView novo() {
    	ModelAndView mv = new ModelAndView(CADASTRO_VIEW);
    	mv.addObject("todosStatusTitulo", StatusTitulo.values());
    	mv.addObject(new Titulo());
    	return mv;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String salvar(@Validated Titulo titulo, Errors errors, RedirectAttributes attributes) {
    	if(errors.hasErrors()) {
    		return CADASTRO_VIEW;
    	}
 
    	try {
    		cadastroTituloService.salvar(titulo);
	    	attributes.addFlashAttribute("mensagem", "Titulo salvo com sucesso!");
	    	return "redirect:/titulos/novo";
    	} catch (IllegalArgumentException exception) {
			errors.rejectValue("dataVencimento", null, exception.getMessage());
			return CADASTRO_VIEW;
		}
    }
    @RequestMapping
    public ModelAndView pesquisar(@RequestParam(defaultValue = "") String descricao) {
    	List<Titulo> todosTitulos = titulos.findByDescricaoContaining(descricao);
    	
    	ModelAndView mv = new ModelAndView("PesquisaTitulos");
    	mv.addObject("titulos", todosTitulos);
    	return mv;
    }
    
    @RequestMapping("{codigo}")
    public ModelAndView edicao(@PathVariable Long codigo) {
    	Titulo titulo = titulos.findById(codigo).get();
    	ModelAndView mv = new ModelAndView(CADASTRO_VIEW);
    	mv.addObject(titulo);
    	return mv;
    }
    
    @PostMapping(value = "{codigo}")
    public String excluir(@PathVariable Long codigo) {
    	cadastroTituloService.excluir(codigo);
    	
    	return "redirect:/titulos";
    }

    @RequestMapping(value="/{codigo}/receber", method = RequestMethod.PUT)
    public @ResponseBody String receber(@PathVariable Long codigo) {
    	return cadastroTituloService.receber(codigo);
    	
    }

    @ModelAttribute("todosStatusTitulo")
    public List<StatusTitulo> todosStatusTitulo(){
    	return Arrays.asList(StatusTitulo.values());
    }
}
