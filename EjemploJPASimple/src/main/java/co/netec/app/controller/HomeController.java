package co.netec.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.netec.app.entity.Articulo;
import co.netec.app.service.IArticuloService;

@Controller
public class HomeController {
	
	@Autowired
    private IArticuloService service;
	
	@GetMapping("/")
	public String inicio(Model model) {

		List<Articulo> result =service.findAll();
		model.addAttribute("articulos", result);
		
		
		return "listArticulos";
		
		
	}
	
}
