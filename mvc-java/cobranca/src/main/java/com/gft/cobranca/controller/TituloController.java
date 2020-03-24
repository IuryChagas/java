package com.gft.cobranca.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gft.cobranca.model.StatusTitulo;
import com.gft.cobranca.model.Titulo;
import com.gft.cobranca.repository.Titulos;


@Controller
@RequestMapping("/titulos")
public class TituloController {

	@Autowired
	private Titulos titulos;

    @RequestMapping("/novo")
    public ModelAndView novo() {
    	ModelAndView mv = new ModelAndView("CadastroTitulo");
    	mv.addObject("todosStatusTitulo", StatusTitulo.values());
    	mv.addObject(new Titulo());
    	return mv;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String salvar(@Validated Titulo titulo, Errors errors, RedirectAttributes attributes) {
    	if(errors.hasErrors()) {
    		return "CadastroTitulo";
    	}
 
    	titulos.save(titulo);
    	attributes.addFlashAttribute("mensagem", "Titulo salvo com sucesso!");
    	return "redirect:/titulos/novo";
    }
    @RequestMapping
    public ModelAndView pesquisar() {
    	List<Titulo> todosTitulos = titulos.findAll();
    	ModelAndView mv = new ModelAndView("PesquisaTitulos");
    	mv.addObject("titulos", todosTitulos);
    	return mv;
    }
    @ModelAttribute("todosStatusTitulo")
    public List<StatusTitulo> todosStatusTitulo(){
    	return Arrays.asList(StatusTitulo.values());
    }
}
